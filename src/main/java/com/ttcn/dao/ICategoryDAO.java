package com.ttcn.dao;

import java.util.List;

import com.ttcn.model.CategoryModel;
import com.ttcn.paging.Pageble;

public interface ICategoryDAO {
	List<CategoryModel> findAll(Pageble pageble);
	CategoryModel findOne(Long id);
	Long insert(CategoryModel categoryModel);
	void update (CategoryModel categoryModel);
	void delete (Long id);
	int getTotalItem();
}
