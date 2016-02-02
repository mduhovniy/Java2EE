package info.duhovniy.trivialpursuit;

import java.sql.*;

public class MySQLDBHandler {

	public MySQLDBHandler() {
	}

	public static QueryList getAllQuestionsRequest() {
		QueryList list = new QueryList();
		Connection conn = null;
		Statement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(NetConstant.JDBC_DRIVER);

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(NetConstant.DB_URL, NetConstant.USER, NetConstant.PASS);

			// Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql = "SELECT " + NetConstant.ID + "," + NetConstant.SUBJECT + "," + NetConstant.QUESTION + ","
					+ NetConstant.R_ANS + "," + NetConstant.W_ANS1 + "," + NetConstant.W_ANS2 + "," + NetConstant.W_ANS3
					+ " FROM " + NetConstant.QUEST_TABLE + ";";
			ResultSet rs = stmt.executeQuery(sql);

			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				list.addQuestion(new Question(rs.getInt(NetConstant.ID), rs.getString(NetConstant.SUBJECT),
						rs.getString(NetConstant.QUESTION), rs.getString(NetConstant.R_ANS),
						rs.getString(NetConstant.W_ANS1), rs.getString(NetConstant.W_ANS2),
						rs.getString(NetConstant.W_ANS3)));
			}
			// Clean-up environment
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
		return list;
	}

	public static int putQuestion(Question q) {
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(NetConstant.JDBC_DRIVER);

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(NetConstant.DB_URL, NetConstant.USER, NetConstant.PASS);

			// Execute a query
			System.out.println("Creating statement...");
			String sql = "INSERT INTO " + NetConstant.QUEST_TABLE + " (" + NetConstant.SUBJECT + ","
					+ NetConstant.QUESTION + "," + NetConstant.R_ANS + "," + NetConstant.W_ANS1 + ","
					+ NetConstant.W_ANS2 + "," + NetConstant.W_ANS3 + ") VALUES ( ? , ? , ? , ? , ? , ? );";
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, q.getSubject());
			stmt.setString(2, q.getQuery());
			stmt.setString(3, q.getRightAnswer());
			stmt.setString(4, q.getWrongAnswer1());
			stmt.setString(5, q.getWrongAnswer2());
			stmt.setString(6, q.getWrongAnswer3());

			rows = stmt.executeUpdate();
			// Clean-up environment
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

		return rows;
	}

}
