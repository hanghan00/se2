package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSevlet
 */
@WebServlet("/LoginSevlet")
public class LoginSevlet extends HttpServlet {
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Reading the user's input
		   String name = request.getParameter("username");
		   String password = request.getParameter("password");

		   //Setting the content type
		   response.setContentType("text/html");
		   //Getting the stream to write the data
		   PrintWriter pw = response.getWriter();
		   //Writing html in the stream
		   pw.println(
				   "<html>\n" +
		             "<body>" + 
		             "<h2> Login sucessfully!" + 
		             "</body>" +
		             "</html>"   
				   ); 
		   //Closing the stream
		   pw.close();
	   }

	

}
