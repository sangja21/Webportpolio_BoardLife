// 진행만 하는 역할을 수행함

package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import vo.ActionForward;

@WebServlet("*.bo") 
// 앞에 뭐가들어오든, .bo로 끝나는 모든 url은 controller를 타고 들어온다는 의미
// db작업 진행방향은 action으로 향하게 됨
// dao를 만들어서 svc단에서 데이터처리를 함
public class BoardFrontController extends javax.servlet.http.HttpServlet 
{
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		ActionForward forward=null;
		Action action=null;
		
		if(command.equals("/*.bo")){
			forward=new ActionForward();
			forward.setPath("/*.jsp");
		}
		
	} // doProcess
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doProcess(request,response);
	}  	// doGet method

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doProcess(request,response);
	}   // doPost method
	
} // class BoardFrontController
	
