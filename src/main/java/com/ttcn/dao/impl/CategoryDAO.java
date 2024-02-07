package com.ttcn.dao.impl;

import java.util.List;

import com.ttcn.dao.ICategoryDAO;
import com.ttcn.mapper.CategoryMapper;
import com.ttcn.model.CategoryModel;
import com.ttcn.paging.Pageble;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM DANHMUC");
		if (pageble.getSorter() != null) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy());
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit());
		}
		return super.query(sql.toString(), new CategoryMapper());
	}

	@Override
	public Long insert(CategoryModel categoryModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO DANHMUC (tenDanhMuc, ngayTao, nguoiTao)");
		sql.append(" VALUES(?, ?, ?)");
		return super.insert(sql.toString(), categoryModel.getTenDanhMuc(), categoryModel.getNgayTao(), categoryModel.getNguoiTao());
	}

	@Override
	public CategoryModel findOne(Long id) {
		String sql = "SELECT * FROM DANHMUC WHERE id = ?";
		List<CategoryModel> items = super.query(sql, new CategoryMapper(), id);
		return (items.isEmpty()) ? null : items.get(0);
	}

	@Override
	public void update(CategoryModel categoryUpdate) {
		String sql = "UPDATE DANHMUC SET tenDanhMuc = ?, ngayTao = ?, ngaySua = ?, nguoiTao = ?, nguoiSua = ? WHERE id = ?";
		super.update_delete(sql, categoryUpdate.getTenDanhMuc(), categoryUpdate.getNgayTao(), categoryUpdate.getNgaySua(), categoryUpdate.getNguoiTao(), categoryUpdate.getNguoiSua(), categoryUpdate.getId());
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM DANHMUC WHERE id = ?";
		super.update_delete(sql, id);
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT COUNT(*) FROM DANHMUC";
		return super.count(sql);
	}
}
