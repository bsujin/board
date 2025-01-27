package kr.or.ddit.page.model;

public class PageVo {
	private int page;
	private int pageSize;
	
	public PageVo() {}
	
	public PageVo(int page, int pageSize) {
		this.page = page;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "PageVo [page=" + page + ", pageSize=" + pageSize + "]";
	}
	public int getPage() {
		
		return page == 0 ? 1 : page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize == 0 ? 10 : page;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
