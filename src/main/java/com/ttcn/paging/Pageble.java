package com.ttcn.paging;

import com.ttcn.sort.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getLimit();
	Integer getOffset();
	Sorter getSorter();
}
