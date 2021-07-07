package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GugudanServlet")
public class GugudanServlet extends HttpServlet {
	
	// 상수 field값
	private static final long serialVersionUID = 1L;

	// default 생성자 생략
	/*
	 * public GugudanServlet() { super(); }
	 */

	// method
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		int dan = Integer.parseInt(request.getParameter("dan"));
		
		out.println("<table border= 1>");

		for (int i = 1; i < 10; i++) {

			out.println("	<tr>"
						+"		<td>" + dan + "</td>"
						+"		<td>" + i + "</td>"
						+"		<td>" + dan * i + "</td>"
						+"	</tr>");
		}
		out.println("</table>");

//		response.getWriter().append("Served at: ").append(request.getContextPath()); 생략
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
