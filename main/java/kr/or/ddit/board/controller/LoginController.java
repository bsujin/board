package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceI;
import kr.or.ddit.member.model.UserVo;

@WebServlet("/loginController")
public class LoginController extends HttpServlet{
	
	private BoardServiceI service = new BoardService();
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userid = req.getParameter("userid"); 
		String pass = req.getParameter("userpw");
			
		UserVo user = service.selectMember(userid);	//입력된 id를 비교함 
		
		logger.debug("로그인한 회원정보 : {}", user);
		
		//로그인 성공  ==> service를 통해 데이터 베이스에 저장된 값과 일치할 때 
			if(user != null && pass.equals(user.getPass())) {
				HttpSession session = req.getSession();
				session.setAttribute("M_USER", user);
				List<BoardVo> board = service.selectBoard(userid);
				session.setAttribute("boardList", board);
				// servlet 처리를 해주기 
				resp.sendRedirect(req.getContextPath() + "/main.jsp");
			
		}
		//로그인 실패
		else {
			resp.sendRedirect(req.getContextPath() + "/login.jsp");
		}
	}
	
	}












