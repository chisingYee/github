package com.yc.web.dto;

import java.io.Serializable;
import java.util.List;

public class PageSet<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1262565905521592031L;
	private Integer total;
	private Integer pages;
	private Integer pagesize;
	private Integer pageNum;
	private List<T> list;
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "PageSet [total=" + total + ", pages=" + pages + ", pagesize=" + pagesize + ", list=" + list + "]";
	}
	
 
}
