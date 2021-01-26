package kr.or.ddit.board.model;

public class BoardVo {
	int board_no;
	String user_id;
	String board_nm;
	int activation;
	
	public BoardVo() {}
	
	public BoardVo(int board_no, String user_id, String board_nm, int activation) {
		super();
		this.board_no = board_no;
		this.user_id = user_id;
		this.board_nm = board_nm;
		this.activation = activation;
	}

	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBoard_nm() {
		return board_nm;
	}
	public void setBoard_nm(String board_nm) {
		this.board_nm = board_nm;
	}
	public int getActivation() {
		return activation;
	}
	public void setActivation(int activation) {
		this.activation = activation;
	}

	@Override
	public String toString() {
		return "BoardVo [board_no=" + board_no + ", user_id=" + user_id + ", board_nm=" + board_nm + ", activation="
				+ activation + "]";
	}
	
	
	
	
}
