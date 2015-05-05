package com.beerselection.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

import com.beerselection.model.BeerExpert;

public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String color = request.getParameter("color");
		PrintWriter out = response.getWriter();
		BeerExpert beerExpert = new BeerExpert();
		List result = beerExpert.getBrands(request.getParameter("colorName"));
		/*
		 * out.println("Beer Selection Advice <br>");
		 */
		// String c= request.getParameter("color");
		// out.println("<br>Got Beer Color "+color+ "<br>Name is "+ request.getParameter("colorName"));
		response.setContentType("text/html"); 
		request.setAttribute("styles", result);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("result.jsp");
		/*
		 * Iterator it = result.iterator(); while (it.hasNext()) { out.println("<br>try :" + it.next()); }
		 */
		requestDispatcher.forward(request,response);
	}

}
