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
 * Servlet implementation class TestController
 */
@WebServlet("/login.do")
public class TestController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		TestService service = new TestService();
		TestDTO testDTO = new TestDTO();

		if (request.getMethod().equalsIgnoreCase("GET")) {// login check
			RequestDispatcher uForward = request.getRequestDispatcher("/WEB-INF/view/login.jsp");
			uForward.forward(request, response);
		} else if (request.getMethod().equalsIgnoreCase("POST")) {

			testDTO.setTest_id(request.getParameter("u_id"));
			testDTO.setTest_pass(request.getParameter("u_pass"));

			boolean result = service.loginCheck(testDTO);// 이 변수에는 유저정보에 대한 값들이 모두 들어있기때문에
			// 이렇게 전달하면 확장성에서 우위를 점할 수 있다.

			if (result) {
				request.setAttribute("u_id", testDTO.getTest_id());
				RequestDispatcher uForward = request.getRequestDispatcher("/WEB-INF/view/loginsecess.jsp");
				uForward.forward(request, response);
			} else {
				RequestDispatcher uForward = request.getRequestDispatcher("/WEB-INF/view/loginsecess2.jsp");
				uForward.forward(request, response);

			}

			if (result) {
				request.getSession().setAttribute("loginId", testDTO.getTest_id());
				RequestDispatcher uForward = request.getRequestDispatcher("/WEB-INF/view/board_write.jsp");
				uForward.forward(request, response);
			}

			else {
				RequestDispatcher uForward = request.getRequestDispatcher("/WEB-INF/view/loginsecess2.jsp");
				uForward.forward(request, response);

			}

		}

	}
}
