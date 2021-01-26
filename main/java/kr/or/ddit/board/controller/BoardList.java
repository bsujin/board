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

@WebServlet("/boardList")
public class BoardList extends HttpServlet {

	private static final Logger logger = LoggerFactory.getLogger(BoardList.class);
	private BoardServiceI boardService = new BoardService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int board_no = Integer.parseInt(req.getParameter("board_no"));
		
		BoardVo board = (BoardVo) boardService.selectBoardList(board_no);

		req.setAttribute("board", board);

		logger.debug("board 값 : {}", board);

		req.getRequestDispatcher("/board/boardList.jsp").forward(req, resp);
	}

}
