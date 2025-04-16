package com.database;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ipt = request.getParameter("id"); 
		String name = "Not Found";
		
		try {
			int id = Integer.parseInt(ipt);
			Student s =  new StudentDao().getStudent(id);
			if(s.name != null) {
				name = s.name;
			}
		} catch (SQLException e) {
			
		}
		
		finally {
			request.setAttribute("name", name);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

}
