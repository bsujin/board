package kr.or.ddit.board.respository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.board.model.BoardListVo;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.db.MybatisUtill;
import kr.or.ddit.member.model.UserVo;
import kr.or.ddit.page.model.PageSearchVo;
import kr.or.ddit.page.model.PageVo;

public class BoardDao implements BoardDaoI {

	@Override
	public UserVo selectMember(String userid) {
		SqlSession sqlSession = MybatisUtill.getSqlSession();
		UserVo user = sqlSession.selectOne("board.selectMember", userid);
		sqlSession.close();
		return user;
	}

	@Override
	public List<BoardVo> selectBoard(String userid) {
		SqlSession sqlSession = MybatisUtill.getSqlSession();
		List<BoardVo> board = sqlSession.selectList("board.selectBoard", userid);
		sqlSession.close();
		return board;
	}

	@Override
	public int addBoard(BoardVo boardVo) {
		SqlSession sqlSession = MybatisUtill.getSqlSession();
		int addBoard = sqlSession.insert("board.insertBoard", boardVo);
		if (addBoard == 1) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return addBoard;
	}

	@Override
	public int modifyBoard(BoardVo boardVo) {
		SqlSession sqlSession = MybatisUtill.getSqlSession();
		int modifyBoard = sqlSession.update("board.modifyBoard", boardVo);

		if (modifyBoard == 1) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return modifyBoard;
	}

	@Override
	public List<BoardListVo> selectBoardList(int board_no) {
		SqlSession sqlSession = MybatisUtill.getSqlSession();
		List<BoardListVo> board = sqlSession.selectList("board.selectBoardList", board_no);
		sqlSession.close();
		return board;
	}

//	@Override
//	public List<UserVo> selectPagingMember(PageVo vo) {
//		SqlSession sqlSession = MybatisUtill.getSqlSession();
//
//		List<UserVo> userList = sqlSession.selectList("users.selectPagingMember", vo);
//
//		// 사용할 자원 반환
//		sqlSession.close();
//
//		return userList;
//	}

}
