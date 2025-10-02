package net.daum.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.daum.dto.TestDTO;
import net.daum.service.TestService;

/**
 * Servlet implementation class TestWriteController
 */
@WebServlet("/write.do")
public class TestWriteController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
																throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		TestService service = new TestService();
		TestDTO testDTO = new TestDTO();
		
		
		request.setAttribute("t_title", testDTO.getTest_title());
		request.setAttribute("t_cont", testDTO.getTest_cont());
		
		String loginId = (String) request.getSession().getAttribute("loginId");
		testDTO.setTest_id(loginId);
		
		
	      service.insertWrite(testDTO);
	      
	      RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/board_write.jsp");
	      rd.forward(request, response);

	}

}
