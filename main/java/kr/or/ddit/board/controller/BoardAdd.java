package kr.or.ddit.board.controller;

import java.io.IOException;

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

@WebServlet("/addboard")
public class BoardAdd extends HttpServlet {

	private static final Logger logger = LoggerFactory.getLogger(BoardAdd.class);
	private BoardServiceI service = new BoardService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpSession session = req.getSession();
//		UserVo user = (UserVo) session.getAttribute("M_USER");
//		String userid = user.getuser_id();

		String userid = req.getParameter("userid");
		if (userid == null) {
			resp.sendRedirect(req.getContextPath() + "/login.jsp");
		}
		logger.debug("userid{}", userid);

		String boardnm = req.getParameter("boardnm");
		int activation = Integer.parseInt(req.getParameter("activation"));

		logger.debug("boardnm{}", boardnm);
		logger.debug("activation{}", activation);

		BoardVo boardVo = new BoardVo();
		boardVo.setUser_id(userid);
		boardVo.setBoard_nm(boardnm);
		boardVo.setActivation(activation);

		int insertCnt = 0;
		// service에서 예외처리를 안해줬을 경우, servlet에서 처리
		try {
			insertCnt = service.addBoard(boardVo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (insertCnt == 1) {
			resp.sendRedirect(req.getContextPath() + "/board/boardMain.jsp");
		} else {
			req.getRequestDispatcher("/board/addBoard.jsp").forward(req, resp);
		}

	}

}
