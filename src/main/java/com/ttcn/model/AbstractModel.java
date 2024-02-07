package com.ttcn.model;

import java.sql.Timestamp;
import java.util.List;

public class AbstractModel<T> {
	private Long id;
	private Timestamp ngayTao;
	private Timestamp ngaySua;
	private String nguoiTao;
	private String nguoiSua;
	private long[] ids;
	private List<T> listResult;
	private Integer page;
	private Integer maxPageItems;
	private Integer totalPages;
	private Integer totalItem;
	private String sortName;
	private String sortBy;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Timestamp ngayTao) {
		this.ngayTao = ngayTao;
	}
	public Timestamp getNgaySua() {
		return ngaySua;
	}
	public void setNgaySua(Timestamp ngaySua) {
		this.ngaySua = ngaySua;
	}
	public String getNguoiTao() {
		return nguoiTao;
	}
	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}
	public String getNguoiSua() {
		return nguoiSua;
	}
	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}
	public long[] getIds() {
		return ids;
	}
	public void setIds(long[] ids) {
		this.ids = ids;
	}
	public List<T> getListResult() {
		return listResult;
	}
	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getMaxPageItems() {
		return maxPageItems;
	}
	public void setMaxPageItems(Integer maxPageItems) {
		this.maxPageItems = maxPageItems;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public String getSortBy() {
		return sortBy;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	
}
