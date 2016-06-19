package info.duhovniy.imcloud;

import java.sql.*;
import java.util.ArrayList;

public class MySQLDBHandler {

	public MySQLDBHandler() {
	}

	public static User getUser(String email) {
		User user = new User();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(NetConstant.JDBC_DRIVER);

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(NetConstant.DB_URL, NetConstant.USER, NetConstant.PASSWORD);

			// Execute a query
			System.out.println("Creating statement...");
			String sql = "SELECT " + NetConstant.ID + "," + NetConstant.NICK + "," + NetConstant.EMAIL + ","
					+ NetConstant.PASS + "," + NetConstant.REG_ID + "," + NetConstant.CAN_ID
					+ " FROM " + NetConstant.USER_TABLE + " WHERE " + NetConstant.EMAIL + "= ? ;";

			stmt = conn.prepareStatement(sql);
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();

			// Extract data from result set
			if(rs.next()) {
				// Retrieve by column name
				user.setId(rs.getInt(NetConstant.ID));
				user.setNick(rs.getString(NetConstant.NICK));
				user.setEmail(rs.getString(NetConstant.EMAIL));
				user.setPass(rs.getString(NetConstant.PASS));
				user.setRegistration_id(rs.getString(NetConstant.REG_ID));
				user.setCanonical_id(rs.getString(NetConstant.CAN_ID));
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
		return user;
	}

	public static int addUser(User u) {
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(NetConstant.JDBC_DRIVER);

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(NetConstant.DB_URL, NetConstant.USER, NetConstant.PASSWORD);

			// Execute a query
			System.out.println("Creating statement...");
			String sql = "INSERT INTO " + NetConstant.USER_TABLE + " (" + NetConstant.NICK + ","
					+ NetConstant.EMAIL + "," + NetConstant.PASS + "," + NetConstant.REG_ID  + ") "
					+ "VALUES ( ? , ? , ? , ? );";
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, u.getNick());
			stmt.setString(2, u.getEmail());
			stmt.setString(3, u.getPass());
			stmt.setString(4, u.getRegistration_id());

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
	
	public static int removeUser(User u) {
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(NetConstant.JDBC_DRIVER);

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(NetConstant.DB_URL, NetConstant.USER, NetConstant.PASSWORD);

			// Execute a query
			System.out.println("Creating statement...");
			String sql = "DELETE FROM " + NetConstant.USER_TABLE 
					+ " WHERE " + NetConstant.EMAIL + "=? AND " + NetConstant.PASS + "=? ;";
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, u.getEmail());
			stmt.setString(2, u.getPass());
			
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

	public static int updateUser(User u) {
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(NetConstant.JDBC_DRIVER);

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(NetConstant.DB_URL, NetConstant.USER, NetConstant.PASSWORD);

			// Execute a query
			System.out.println("Creating statement...");
			String sql = "UPDATE " + NetConstant.USER_TABLE
					+ " SET " + NetConstant.NICK + "=?, " + NetConstant.PASS + "=?, " 
					+ NetConstant.REG_ID + "=?, " + NetConstant.CAN_ID + "=? "
					+ " WHERE " + NetConstant.EMAIL + "=? ;";
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, u.getNick());
			stmt.setString(2, u.getPass());
			stmt.setString(3, u.getRegistration_id());
			stmt.setString(4, u.getCanonical_id());
			stmt.setString(5, u.getEmail());
			
			
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

	
	public static ArrayList<User> getAllUsers() {
		ArrayList<User> userList = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		try {
			// Register JDBC driver
			Class.forName(NetConstant.JDBC_DRIVER);

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(NetConstant.DB_URL, NetConstant.USER, NetConstant.PASSWORD);

			// Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql = "SELECT * FROM " + NetConstant.USER_TABLE + ";";
			ResultSet rs = stmt.executeQuery(sql);

			// Extract data from result set
			while(rs.next()) {
				User user = new User();
				// Retrieve by column name
				user.setId(rs.getInt(NetConstant.ID));
				user.setNick(rs.getString(NetConstant.NICK));
				user.setEmail(rs.getString(NetConstant.EMAIL));
				user.setPass(rs.getString(NetConstant.PASS));
				user.setRegistration_id(rs.getString(NetConstant.REG_ID));
				user.setCanonical_id(rs.getString(NetConstant.CAN_ID));
				
				userList.add(user);
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
		return userList;
	}

}
