package com.callor.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenuController extends HttpServlet{

	
	private static final long serialVersionUID = -1559984816269914437L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 매개변수 req, resp 로 컨트롤러가 반응하면 실행하는 method 

		String rootPath = req.getContextPath();
		String id = req.getParameter("id");
		
		resp.sendRedirect(rootPath + "/" + id);
		
		/*
		if(id.equals("buyer")) {
			// 고객정보
			
			resp.sendRedirect(rootPath + "/buyer");
			
		}else if(id.equals("product")) {
			// 상품정보
			
			resp.sendRedirect(rootPath + "/product");
			
		}else if(id.equals("mypage")) {
			// mypage
			
			resp.sendRedirect(rootPath + "/mypage");
		}else {
			resp.sendRedirect(rootPath);
		}
		*/
	}
	
	

}
