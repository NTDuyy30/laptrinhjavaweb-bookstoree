package com.ttcn.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.ttcn.dao.ICategoryDAO;
import com.ttcn.model.CategoryModel;
import com.ttcn.paging.Pageble;
import com.ttcn.service.ICategoryService;

public class CategoryService implements ICategoryService {
	@Inject
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<CategoryModel> findAll(Pageble pageble) {
		return this.categoryDAO.findAll(pageble);
	}

	@Override
	public CategoryModel insert(CategoryModel categoryModel) {
		categoryModel.setNgayTao(new Timestamp(System.currentTimeMillis()));
		Long id = this.categoryDAO.insert(categoryModel);
		return this.categoryDAO.findOne(id);
	}

	@Override
	public CategoryModel update(CategoryModel categoryUpdate) {
		CategoryModel oldCategory = this.categoryDAO.findOne(categoryUpdate.getId());
		categoryUpdate.setNgayTao(oldCategory.getNgayTao());
		categoryUpdate.setNguoiTao(oldCategory.getNguoiTao());
		categoryUpdate.setNgaySua(new Timestamp(System.currentTimeMillis()));
		this.categoryDAO.update(categoryUpdate);
		return this.categoryDAO.findOne(categoryUpdate.getId());
	}

	@Override
	public void delete(long[] ids) {
		for (long id : ids) {
			this.categoryDAO.delete(id);
		}
	}

	@Override
	public int getTotalItem() {
		return categoryDAO.getTotalItem();
	}

}
