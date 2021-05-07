package com.callor.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product/*")
public class ProductController extends HttpServlet{


	private static final long serialVersionUID = 1L;
	
	// 입력처리를 위한 처음 화면 보여주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 매개변수 req, resp로 컨트롤러가 반응할때 실행하는 method
		
		req.getRequestDispatcher("WEB-INF/views/product.jsp").forward(req, resp);
		
	}
	
	// 데이터를 전송받아 처리후 결과 보여주기
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		String result = "%d + %d = %d";
		try {
			Integer intNum1 = Integer.valueOf(num1);
			Integer intNum2 = Integer.valueOf(num2);
			Integer sum = intNum1 + intNum2;
			result = String.format(result, intNum1, intNum2, sum);
		} catch (Exception e) {
			result = "숫자로만 입력하세요";
			
		}
		req.setAttribute("RESULT", result);
		req.getRequestDispatcher("/WEB-INF/views/product.jsp").forward(req, resp);
		
	}
	
	
	

}
