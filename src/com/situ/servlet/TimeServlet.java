package com.situ.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet{

   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   Date date = new Date();
	   SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-ss");
	   String nowDate = dateFormat.format(date);
	   
	   PrintWriter prinWriter = resp.getWriter();
	   prinWriter.println("<h1>" + nowDate + "</h1>");
	   prinWriter.close();

 }
  
}
