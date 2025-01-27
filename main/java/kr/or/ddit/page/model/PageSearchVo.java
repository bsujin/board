package kr.or.ddit.page.model;

public class PageSearchVo {
	private int page;
	private int pageSize;
	private String userid;
	private String usernm;
	private String alias;
	

	public PageSearchVo() {}
	
	public PageSearchVo(int page, int pageSize, String userid, String usernm,String alias) {
		this.page = page;
		this.pageSize = pageSize;
		this.userid = userid;
		this.usernm = usernm;
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "PageSearchVo [page=" + page + ", pageSize=" + pageSize + ", userid=" + userid + ", usernm=" + usernm
				+ ", alias=" + alias + ", getPage()=" + getPage() + ", getPageSize()=" + getPageSize()
				+ ", getUserid()=" + getUserid() + ", getUsernm()=" + getUsernm() + ", getAlias()=" + getAlias()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getPage() {
		
		return page == 0 ? 1 : page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize == 0 ? 5 : page;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsernm() {
		return usernm;
	}

	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	
}
