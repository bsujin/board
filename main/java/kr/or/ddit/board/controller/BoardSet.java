package kr.or.ddit.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceI;
import kr.or.ddit.member.model.UserVo;

@WebServlet("/boardSet")
public class BoardSet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(BoardSet.class);
	private BoardServiceI service = new BoardService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//	      String userid = req.getParameter("userid");
//	      
//	      UserVo user = service.selectMember(userid);
//	      
//	      req.setAttribute("user", user);
//	      
	      
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid = req.getParameter("userid");
		int boardno = Integer.parseInt(req.getParameter("boardno"));
		String act = req.getParameter("act");
//		int activation = Integer.parseInt(req.getParameter("activation"));
		logger.debug("userid{}", req.getParameter("userid"));
		logger.debug("boardno{}", req.getParameter("boardno"));
		logger.debug(req.getParameter("activation"));
		
//		int board = boardno==null ? 1 : Integer.parseInt(req.getParameter("boardno"));
		int activation = act.equals("") || act.equals(1) ? 1 : Integer.parseInt(req.getParameter("act"));
		
//		logger.debug("board{}", board);
		
		BoardVo vo = new BoardVo();
		vo.setBoard_no(boardno);
		vo.setActivation(activation);
		vo.setUser_id(userid);
		
		int updateCnt = service.modifyBoard(vo);
	      
	      if(updateCnt == 1) {	  // 수정이 정상적으로 된 경우 => 해당 사용자의 상세조회 페이지로 이동
	         
	    	  resp.sendRedirect(req.getContextPath()+"/board/boardMain.jsp");

	      } else {  			 // 수정이 비정상적으로 된 경우 => 해당 사용자의 정보 수정 페이지로 이동
	    	  req.setAttribute("error", "수정오류");
	    	  req.getRequestDispatcher("/board/boardMain.jsp").forward(req, resp);
	      }    
	      
	}
	

}
