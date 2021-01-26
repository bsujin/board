package kr.or.ddit.board.respository;

import java.util.List;

import kr.or.ddit.board.model.BoardListVo;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.member.model.UserVo;

public interface BoardDaoI {

	// userid에 해당하는 사용자 한명의 정보 조회
	UserVo selectMember(String userid);

	// 사용자의 게시판 리스트 가져오기
	List<BoardVo> selectBoard(String userid);
	
	// 게시판 등록
	int addBoard(BoardVo boardVo);
	
	// 활성상태 수정
	int modifyBoard(BoardVo boardVo);
	
	//사용하는 게시판의 게시글  리스트 가져오기
	List<BoardListVo> selectBoardList(int board_no);

	
	// 페이징처리
//	List<UserVo> selectPagingMember(PageVo vo);
}