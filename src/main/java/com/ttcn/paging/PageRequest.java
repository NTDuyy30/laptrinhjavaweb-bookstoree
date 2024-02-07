package com.ttcn.paging;

import com.ttcn.sort.Sorter;

public class PageRequest implements Pageble {
	private Integer page;
	private Integer maxPageItems;
	private Sorter sorter;
	
	public PageRequest(Integer page, Integer maxPageItems, Sorter sorter) {
		this.page = page;
		this.maxPageItems = maxPageItems;
		this.setSorter(sorter);
	}
	@Override
	public Integer getPage() {
		return this.page;
	}

	@Override
	public Integer getLimit() {
		return this.maxPageItems;
	}

	@Override
	public Integer getOffset() {
		if (this.page != null && this.maxPageItems != null) {
			return (this.page - 1) * this.maxPageItems;
		}
		return null;
	}
	
	@Override
	public Sorter getSorter() {
		return this.sorter;
	}
	
	public void setSorter(Sorter sorter) {
		this.sorter = sorter;
	}

}
