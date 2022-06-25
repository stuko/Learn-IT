package com.mh.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Controller
public class TestServlet extends HttpServlet {
	 
	   private String message;

	   public void init() throws ServletException {
	      // Do required initialization
		   TestModel tm = new TestModel();
	      message = tm.getMessage();
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      // Set response content type
	      response.setContentType("text/html");
	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	      response.sendRedirect("/index.html");
	   }

	   public void destroy() {
	      // do nothing.
	   }
	}