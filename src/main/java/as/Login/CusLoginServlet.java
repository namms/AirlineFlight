package com.DAO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CusLoginServlet
 */
public class CusLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CusLoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			FileReader reader = new FileReader(
					"C:\\Users\\dhira\\Documents\\workspace1\\AirplaneSystem\\src\\main\\java\\com\\DAO\\DBProperties.properties");
			Properties p = new Properties();
			try {
				p.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = p.getProperty("avabase.jdbc.url");
			String dbUser = p.getProperty("javabase.jdbc.username");
			String dbPassword = p.getProperty("javabase.jdbc.password");

			Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);
			System.out.println("Database Connection Successful");

			Statement myStmt = conn.createStatement();

			ResultSet myRs = myStmt.executeQuery("select * from customer");

			if (myRs.next()) {
				if (username.equals(myRs.getString("username")) && password.equals(myRs.getString("password"))) {

					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect("welcomelogin.jsp");
				} else {
					DriverManager.println("Invalid Password");
				}
			}

			else {

				response.sendRedirect("cuslogin.jsp");
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			System.out.println("Connection Failed");
		}
	}

}
