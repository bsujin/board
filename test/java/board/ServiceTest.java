package board;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.respository.BoardDao;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceI;
import kr.or.ddit.member.model.UserVo;

public class ServiceTest {

	private BoardServiceI service;
	// 로그인 테스트 
	@Test
	public void Logintest() {
		/***Given***/
		service = new BoardService();
		String userid = "con";

		/***When***/
		UserVo user = service.selectMember(userid);
		
		/***Then***/
		assertNotNull(user);
		assertEquals("콘", user.getUsernm());

	}
	
	// 게시판 목록 조회 
	@Test
	public void test() {
		/*** Given ***/
		 service = new BoardService();
		 String userid = "con";
		/*** When ***/
		List<BoardVo> board = service.selectBoard(userid);

		/*** Then ***/
		assertEquals(3, board.size());
		
	}
	
	// 게시판 등록
//			@Test
//			public void addBoardtest() {
//				/*** Given ***/
//				service = new BoardService();
//				String userid = "con";
//				String board = "boardnm";
//				int a= 1;
//				BoardVo vo = new BoardVo();
//				vo.setUser_id(userid);
//				vo.setBoard_nm(board);
//				vo.setActivation(a);
//				/*** When ***/
//				int cnt = service.addBoard(vo);
//				/*** Then ***/
//				assertEquals(1, cnt);
//				assertEquals("boardnm", vo.getBoard_nm());
//			}
	@Test
	public void modifyUserTest() {
		/*** Given ***/
		service = new BoardService();
		BoardVo vo  = new BoardVo();
		vo.setActivation(1);
		vo.setBoard_no(4);
		vo.setUser_id("con");
//		
		/*** When ***/
		int updateCnt = service.modifyBoard(vo);
		
		/*** Then ***/
		assertEquals(1, updateCnt);
		
	}
}
