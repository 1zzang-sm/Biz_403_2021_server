package com.callor.book.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.book.model.BookRentDTO;
import com.callor.book.service.BookRentService;
import com.callor.book.service.impl.BookRentServiceImplV1;

@WebServlet("/")
public class HomeContorller extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	protected BookRentService brService;
	
	public HomeContorller() {
		brService = new BookRentServiceImplV1();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<BookRentDTO> brList = brService.selectAll();
		req.setAttribute("BRLIST", brList);
		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		
		
	}

}
