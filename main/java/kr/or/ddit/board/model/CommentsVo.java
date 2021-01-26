package kr.or.ddit.board.model;

import java.util.Date;

public class CommentsVo {

	int board_no;
	int post_no;
	String user_id;
	int comm_no;
	String comm;
	Date reg_date;
	int next_comm;
	String next_user_id;
	int delete_cact;

	public CommentsVo() {}
	
	public CommentsVo(int board_no, int post_no, String user_id, int comm_no, String comm, Date reg_date, int next_comm,
			String next_user_id, int delete_cact) {
		super();
		this.board_no = board_no;
		this.post_no = post_no;
		this.user_id = user_id;
		this.comm_no = comm_no;
		this.comm = comm;
		this.reg_date = reg_date;
		this.next_comm = next_comm;
		this.next_user_id = next_user_id;
		this.delete_cact = delete_cact;
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

	public int getComm_no() {
		return comm_no;
	}

	public void setComm_no(int comm_no) {
		this.comm_no = comm_no;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public int getNext_comm() {
		return next_comm;
	}

	public void setNext_comm(int next_comm) {
		this.next_comm = next_comm;
	}

	public String getNext_user_id() {
		return next_user_id;
	}

	public void setNext_user_id(String next_user_id) {
		this.next_user_id = next_user_id;
	}

	public int getDelete_cact() {
		return delete_cact;
	}

	public void setDelete_cact(int delete_cact) {
		this.delete_cact = delete_cact;
	}

	@Override
	public String toString() {
		return "CommentsVo [board_no=" + board_no + ", post_no=" + post_no + ", user_id=" + user_id + ", comm_no="
				+ comm_no + ", comm=" + comm + ", reg_date=" + reg_date + ", next_comm=" + next_comm + ", next_user_id="
				+ next_user_id + ", delete_cact=" + delete_cact + "]";
	}
	
	
	
}
