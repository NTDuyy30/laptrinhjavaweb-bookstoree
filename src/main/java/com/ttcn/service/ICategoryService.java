package com.ttcn.service;

import java.util.List;

import com.ttcn.model.CategoryModel;
import com.ttcn.paging.Pageble;

public interface ICategoryService {
	List<CategoryModel> findAll(Pageble pageble);
	
	CategoryModel insert(CategoryModel categoryModel);
	
	CategoryModel update(CategoryModel categoryModel);	
	
	void delete(long[] ids);
	
	int getTotalItem();
}
