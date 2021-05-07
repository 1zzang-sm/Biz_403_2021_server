package com.callor.menu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * WebBrowser를 통해서 /hello/menu 라는 요청이 오면 처리 후 응답할 클래스이다.
 * HttpServlet 클래스
 * 
 *  Web에서 /hello/menu/ 라는 요청이 들어오면 컨트롤러의 코드가 반응하도록 설정 (Annotation)@WebServlet("/..")
 */
@WebServlet("/menu")
public class MenuController extends HttpServlet{

	private static final long serialVersionUID = 484683025989144053L;

	// doGet(req,resp)컨트롤러가 반응할때 실행될 method
	// Tomcat이 호출하여 여러가지 정보를 전달해줄 method
	// Tomcat이 전달하는 정보는 
	// HttpServletRequest, HttpServletResponse 클래스의 객체(req, resp)를 통해 받을 수 있다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 매개변수 req / resp 컨트롤러가 반응할때 실행될 method
		
			// WebBrowser의 req에 반응한 클래스 이름이 무엇인가?
		//String servletName = this.getServletName();
			// Servlet name : com.callor.menu.controller.MenuController
		//System.out.println("Servlet name : " + servletName);
		
			// 현재 Project의 Context(RootPath)가 무엇인가?
		//String rootPath = req.getContextPath();
			// RootPath : /hello
		//System.out.println("RootPath : " + rootPath);
		
			// 요청 path(context)에 부착된 질의 데이터 보기
		//String queryString = req.getQueryString();
			// QueryString : id=(index선택항목) ex : id=author
		//System.out.println("QueryString : " + queryString);
		
			// index.html의 <a href 태그 rootpath(context) 뒤 /...?id= 의 id
		String strId = req.getParameter("id");
			// ID 값 : buyer 
		System.out.println("ID 값 : " + strId);
		
		PrintWriter out = resp.getWriter();
		
		
		
		// 전달받은 id 변수에 담긴 값에 따라 
		// 기능 수행
		if(strId.equals("rent")) {
			// 도서대여 처리
			
			resp.sendRedirect("/hello/rent/list");
			
			
			
			
		}else if(strId.equals("book")) {
			// 도서정보 처리
			// 초기화면의 메뉴에서 도서정보를 클릭하면 처리할 부분..
			// 여기에서 처리할 코드가 도서정보를 변수에 세팅하고 
			// book.jsp에 보내서 보여주는 코드를 작성해야 한다.
			
			resp.sendRedirect("/hello/book/list");
			
			
			
		}else if(strId.equals("author")) {
			// 저자정보 처리
			
		}else if(strId.equals("comp")) {
			// 출판사정보 처리
			
		}else if(strId.equals("buyer")) {
			// 회원정보 처리
			
		}
		
		
	}

	
	
	
}






