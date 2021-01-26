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

@WebServlet("/boardMain")
public class BoardMain extends HttpServlet {
	private BoardServiceI service = new BoardService();
	private static final Logger logger = LoggerFactory.getLogger(BoardMain.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(); 
		if(session != null) {
			doPost(req,resp);
		}else {
			resp.sendRedirect(req.getContextPath() + "/login.jsp");
		}
	}
	// 게시판 목록 출력
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		UserVo user = (UserVo) session.getAttribute("M_USER");
		String userid = user.getuser_id();
		logger.debug(userid);
		List<BoardVo> boardList = service.selectBoard(userid);
		session.setAttribute("boardList", boardList);
		req.setAttribute("board", boardList);
		req.getRequestDispatcher("/board/boardMain.jsp").forward(req, resp);

	}

}
