package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.model.BoardListVo;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.member.model.UserVo;

public interface BoardServiceI {

	UserVo selectMember(String userid);
	
	// 사용자의 게시판 리스트 가져오기
	List<BoardVo> selectBoard(String userid);
	
	// 활성화 게시판 가져오기 
	List<BoardVo> selectActBoard(String userid);

	// 게시판 등록
		int addBoard(BoardVo boardVo);
	
	// 게시판 수정
		int modifyBoard(BoardVo boardVo);
		
	//사용하는 게시판의 게시글  리스트 가져오기
	List<BoardListVo> selectBoardList(int board_no);
	
//	Map<String, Object> selectPagingMember(PageVo vo);


}
