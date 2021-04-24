package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.student;

public class studentDAO {
	
	// Step 1: Establishing a Connection
			Connection connection = DBConnect.getConnection();
	public studentDAO() {
	}
	
	public List<student> selectAllStudents() {
		
		List<student> students = new ArrayList<>();
		
		
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_STUDENTS = "SELECT * FROM students";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENTS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				students.add(new student(id, name, address, phone));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
	
	// TO-DO: Implement selectUser() method to select user by ID (use in UPDATE function)
	public student selectStudent(int id) {
		student stu = null;
		try {
			String SELECT_STUDENTS_BY_ID = "SELECT id, name, address, phone FROM studens WHERE id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STUDENTS_BY_ID); 
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				String name = rs.getString("name");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				stu = new student(id, name, address, phone);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return stu;
	}
	
	// TO-DO: Implement insertUser() method to add new record to table User
	public void insertStudent(student students) throws SQLException {
		try {
			String INSERT_STUDENTS = "INSERT INTO students (name, address, phone) VALUES (?,?,?)"; 
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENTS);
			preparedStatement.setString(1, students.getName());
			preparedStatement.setString(2, students.getAddress());
			preparedStatement.setString(3, students.getPhone());
			preparedStatement.executeUpdate();	

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// TO-DO: Implement updateUser() method to update record in table User  
		public boolean updateStudent(student students) throws SQLException {
			boolean rowUpdated = false;
			try {
				String UPDATE_STUDENTS = "UPDATE students SET name = ?, address = ?, phone = ? WHERE id = ?";
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENTS);
				
				preparedStatement.setString(1, students.getName());
				preparedStatement.setString(2, students.getAddress());
				preparedStatement.setString(3, students.getPhone());
				preparedStatement.setInt(4, students.getId());
				
				rowUpdated = preparedStatement.executeUpdate() > 0;	

			} catch (SQLException e) { 
				// TODO: handle exception
				e.printStackTrace();
			}

			return rowUpdated;
		}

		// TO-DO: Implement deleteUser() method to delete record in table User  
		public boolean deleteStudent(int id) throws SQLException {
			boolean rowDeleted = false;
			try {
				String DELETE_STUDENTS = "DELETE FROM students WHERE id =?";
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENTS);
				preparedStatement.setInt(1, id);
				
				rowDeleted = preparedStatement.executeUpdate() > 0;

				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			return rowDeleted;
		}
}
