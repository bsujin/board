package board;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.respository.BoardDao;
import kr.or.ddit.board.respository.BoardDaoI;
import kr.or.ddit.member.model.UserVo;

public class DaoTest {
	
	private BoardDaoI dao;
	
	
	// 로그인 테스트 
	@Test
	public void Logintest() {
		/***Given***/
		dao = new BoardDao();
		String userid = "con";

		/***When***/
		UserVo user= dao.selectMember(userid);
		
		/***Then***/
		assertNotNull(user);
		assertEquals("콘", user.getUsernm());

	}
	
	// 게시판 목록 조회 
		@Test
		public void test() {
			/*** Given ***/
			dao = new BoardDao();
			String userid = "con";
			/*** When ***/
			List<BoardVo> board = dao.selectBoard(userid);

			/*** Then ***/
			assertEquals(4, board.size());
			
		}
	// 게시판 등록
//		@Test
//		public void addBoardtest() {
//			/*** Given ***/
//			dao = new BoardDao();
//			String userid = "con";
//			String board = "boardnm";
//			String act = "사용x";
//			int a = 0;
//			if(act.equals("사용x")) {
//				a = 1;
//			}
//			BoardVo vo = new BoardVo();
//			vo.setUser_id(userid);
//			vo.setBoard_nm(board);
//			vo.setActivation(a);
//			/*** When ***/
//			int cnt = dao.addBoard(vo);
//			/*** Then ***/
//			assertEquals(1, cnt);
//			
//		}
		
		@Test
		public void modifyUserTest() {
			/*** Given ***/
			dao = new BoardDao();
			BoardVo vo  = new BoardVo(4,"con","boardnm", 1);
//			
			/*** When ***/
			int updateCnt = dao.modifyBoard(vo);
			
			/*** Then ***/
			assertEquals(1, updateCnt);
			
		}
	
	
	
	

}
