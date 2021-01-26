package kr.or.ddit.board.model;

public class AttachmentsVo {

	int board_no;
	int post_no;
	String user_id;
	int fileno;
	String filenm;
	String realfilenm;
	
	public AttachmentsVo() {}

	public AttachmentsVo(int board_no, int post_no, String user_id, int fileno, String filenm, String realfilenm) {
		super();
		this.board_no = board_no;
		this.post_no = post_no;
		this.user_id = user_id;
		this.fileno = fileno;
		this.filenm = filenm;
		this.realfilenm = realfilenm;
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

	public int getFileno() {
		return fileno;
	}

	public void setFileno(int fileno) {
		this.fileno = fileno;
	}

	public String getFilenm() {
		return filenm;
	}

	public void setFilenm(String filenm) {
		this.filenm = filenm;
	}

	public String getRealfilenm() {
		return realfilenm;
	}

	public void setRealfilenm(String realfilenm) {
		this.realfilenm = realfilenm;
	}

	@Override
	public String toString() {
		return "AttachmentsVo [board_no=" + board_no + ", post_no=" + post_no + ", user_id=" + user_id + ", fileno="
				+ fileno + ", filenm=" + filenm + ", realfilenm=" + realfilenm + "]";
	}
	
	
	
}
