package info.duhovniy.trivialpursuit;

import java.sql.*;

public class MySQLDBHandler {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/my_schema";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "lgh35#lake";
	
	public MySQLDBHandler() {}

	public static Question getQuestionRequest() {
		QueryList list = new QueryList();
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT _id, sub_id, question, right_ans, wrong_ans1, wrong_ans2, wrong_ans3 FROM trivia";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				list.addQuestion(new Question(rs.getInt("_id"), 
						String.valueOf(rs.getInt("sub_id")),
						rs.getString("question"),
						rs.getString("right_ans"),
						rs.getString("wrong_ans1"),
						rs.getString("wrong_ans2"),
						rs.getString("wrong_ans3")));
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		
		System.out.println("Goodbye!");
		return list.getRandomQuestion();
	}

}
