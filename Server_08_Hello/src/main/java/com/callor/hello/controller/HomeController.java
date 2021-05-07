package com.callor.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 매개변수 req, resp 로 컨트롤러가 반응할때 실행되는 method
		
		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
	}

	
	
	
	
	
}
