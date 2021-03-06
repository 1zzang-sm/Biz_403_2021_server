package com.callor.diet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.diet.model.MyFoodCDTO;
import com.callor.diet.service.MyFoodService;
import com.callor.diet.service.impl.MyFoodServiceImplV1;

@WebServlet("/")
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = -953531494441799347L;
	protected MyFoodService mfService;
	public HomeController() {
		mfService = new  MyFoodServiceImplV1();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 프로젝트 RUN 시 ("") 주소에 있는 것을 보여주라 
		// 처음시작할때 쓰는 코드
//		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		
		List<MyFoodCDTO> mfList = mfService.selectAll();
		req.setAttribute("MFOODS", mfList);
		ReqController.forward(req, resp, "home");
		
		
	}
	
	

}
