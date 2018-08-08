//Servlet behaving as controller and forwarding request to invoke JSP page.


package com.cg.resume;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person p = new Person(request.getParameter("firstName"), request.getParameter("lastName"),
				request.getParameter("gender"), request.getParameter("hq"), request.getParameter("dob"),
				request.getParameterValues("hobbies"), request.getParameter("address"),
				request.getParameterValues("skills"), request.getParameter("email"), request.getParameter("phone"),
				request.getParameter("summary"));
		request.setAttribute("PersonObject", p);
		RequestDispatcher rd = request.getRequestDispatcher("ResumeShow.jsp");
		rd.forward(request, response);
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

}
