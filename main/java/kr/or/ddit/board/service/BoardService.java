package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.model.BoardListVo;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.respository.BoardDao;
import kr.or.ddit.board.respository.BoardDaoI;
import kr.or.ddit.member.model.UserVo;

public class BoardService implements BoardServiceI {

	private BoardDaoI dao = new BoardDao();


	public UserVo selectMember(String userid) {

		return dao.selectMember(userid);
	}

	// 게시판 목록 가져오기 
	@Override
	public List<BoardVo> selectBoard(String userid) {
		return dao.selectBoard(userid);
	}

	@Override
	public int addBoard(BoardVo boardVo) {
		return dao.addBoard(boardVo);
	}

	@Override
	public int modifyBoard(BoardVo boardVo) {
		return dao.modifyBoard(boardVo);

	}

	@Override
	public List<BoardVo> selectActBoard(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardListVo> selectBoardList(int board_no) {
		// TODO Auto-generated method stub
		return dao.selectBoardList(board_no);
	}


}
