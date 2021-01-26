package kr.or.ddit.board.model;

import java.util.Date;

public class BoardListVo {
	int board_no;
	int post_no;
	String user_id;
	String title;
	Date reg_date;
	String content;
	int delete_act;
	String re_content;
	int board_rno;
	int post_rno;
	String ruser_id;
	
	public BoardListVo() {}

	public BoardListVo(int board_no, int post_no, String user_id, String title, Date reg_date, String content,
			int delete_act, String re_content, int board_rno, int post_rno, String ruser_id) {
		super();
		this.board_no = board_no;
		this.post_no = post_no;
		this.user_id = user_id;
		this.title = title;
		this.reg_date = reg_date;
		this.content = content;
		this.delete_act = delete_act;
		this.re_content = re_content;
		this.board_rno = board_rno;
		this.post_rno = post_rno;
		this.ruser_id = ruser_id;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public int getPost_no() {
		return post_no;
	}

	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDelete_act() {
		return delete_act;
	}

	public void setDelete_act(int delete_act) {
		this.delete_act = delete_act;
	}

	public String getRe_content() {
		return re_content;
	}

	public void setRe_content(String re_content) {
		this.re_content = re_content;
	}

	public int getBoard_rno() {
		return board_rno;
	}

	public void setBoard_rno(int board_rno) {
		this.board_rno = board_rno;
	}

	public int getPost_rno() {
		return post_rno;
	}

	public void setPost_rno(int post_rno) {
		this.post_rno = post_rno;
	}

	public String getRuser_id() {
		return ruser_id;
	}

	public void setRuser_id(String ruser_id) {
		this.ruser_id = ruser_id;
	}

	@Override
	public String toString() {
		return "BoardListVo [board_no=" + board_no + ", post_no=" + post_no + ", user_id=" + user_id + ", title="
				+ title + ", reg_date=" + reg_date + ", content=" + content + ", delete_act=" + delete_act
				+ ", re_content=" + re_content + ", board_rno=" + board_rno + ", post_rno=" + post_rno + ", ruser_id="
				+ ruser_id + "]";
	}
	
	
	

}
