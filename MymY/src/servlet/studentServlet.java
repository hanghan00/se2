package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentDAO;
import model.student;

/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/")
public class studentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private studentDAO studentDAO;

	public void init() {
		studentDAO = new studentDAO();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;Charset=UTF-8");
		request.setCharacterEncoding("utf-8");

		String action = request.getServletPath();
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertStudent(request, response);
				break;
			case "/delete":
				deleteStudent(request, response);
				break;
			case "/update":
				updateStudent(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			default:
				listStudent(request, response);
				break;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		List<student> listStudent = studentDAO.selectAllStudents();
		request.setAttribute("listStudent", listStudent);
		RequestDispatcher dispatcher = request.getRequestDispatcher("student-list.jsp");
		dispatcher.forward(request, response);
	}

	// TO-DO: Implement showNewForm() method which navigates to ADD USER view
	// (add-user.jsp)
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("add-student.jsp");
		dispatcher.forward(request, response);

	}

	// TO-DO: Implement showEditForm() method which navigates to UPDATE USER view
	// (edit-user.jsp)
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		student existingStudent = studentDAO.selectStudent(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("edit-student.jsp");
		request.setAttribute("students", existingStudent);
		dispatcher.forward(request, response);

	}

	// TO-DO: Implement insertUser() method for adding new user
	private void insertStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		student newStudent = new student(name, address, phone);
		studentDAO.insertStudent(newStudent);
		response.sendRedirect("list");
	}

	// TO-DO: Implement updateUser() method for updating existing user
	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");

		student newStudent0 = new student(name, address, phone);
		studentDAO.updateStudent(newStudent0);
		response.sendRedirect("list");
	}

	// TO-DO: Implement deleteUser() method for deleting existing user
	private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		studentDAO.deleteStudent(id);
		response.sendRedirect("list");

	}

}
