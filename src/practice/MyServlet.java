package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("got request from " + req.getParameter("name"));
		
		// how to write content to the client
		PrintWriter out = resp.getWriter();
		
		out.write("<html>");
		out.write("<h1>");
		out.println("got request from " + req.getParameter("name"));
		out.write("</h1>");
		
		// add some dynamic content in the response
		Date date = new Date();
		out.println(" request time " + date);
		out.println("<br/>random number:  " + (int)(Math.random()*101));
		out.write("</html>");
		
		
	}
	
	
	

}
