package Tut02;
import java.sql.*;
public class MySQL_Connect {
	// declare DB connection parameters
    private static String DB_URL = "jdbc:mysql://localhost:3306/se201?useSSL=false";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "root";
 
    public static void main(String args[]) {
        try {
            // connect to MySQL database  
            Connection con = getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            // create statement
            Statement stm = con.createStatement();
			// create SQL query
			String query = "SELECT * FROM student";
            // execute SQL query
            ResultSet rs = stm.executeQuery(query);
            // display data to console
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt(1));
				System.out.println("Student Name:  " + rs.getString(2));
				System.out.println("Student Phone: " + rs.getString(3));
				System.out.println("Student Address: " + rs.getString(4));
            }
            // close JDBC connection
            con.close();
        } catch (Exception ex) {
			// print error if failure
            ex.printStackTrace();
        }
    }
 
	// establish connection to a MySQL database
    public static Connection getConnection(String dbUrl, String dbUsername, String dbPassword) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            System.out.println("Connect to MySQL database successfully !");
        } catch (Exception ex) {
            System.out.println("Connect to MySQL database failed !");
			// print error if failure
            ex.printStackTrace();
        }
        return con;
    }
	

}
