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

/**
 * Servlet implementation class CusSignupServlet
 */
public class CusSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CusSignupServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String emailid = request.getParameter("emailid");
		String phonenumber = request.getParameter("address");
		String address = request.getParameter("phonenumber");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		if (name.length() != 0 && emailid.length() != 0 && phonenumber.length() != 0 && address.length() != 0
				&& username.length() != 0 && (password.equals(cpassword))) {
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

				ResultSet myRs = myStmt.executeQuery(
						"INSERT INTO customer(name, address, email,phone,username,password) VALUES(name, address, emailid, phonenumber,username,password)");
				response.sendRedirect("welcomelogin.jsp");

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (Exception e) {
				System.out.println("Connection Failed");
			}
		} else {
			response.sendRedirect("cuslogin.jsp");
		}
	}
}
