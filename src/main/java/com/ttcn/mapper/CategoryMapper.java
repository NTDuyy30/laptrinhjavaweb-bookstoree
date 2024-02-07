package com.ttcn.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ttcn.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet rs) {
		try {
			CategoryModel category = new CategoryModel();
			category.setId(rs.getLong("id"));
			category.setTenDanhMuc(rs.getString("tenDanhMuc"));
			category.setNgayTao(rs.getTimestamp("ngayTao"));
			category.setNguoiTao(rs.getString("nguoiTao"));
			if (rs.getTimestamp("ngaySua") != null) {
				category.setNgaySua(rs.getTimestamp("ngaySua"));
			}
			if (rs.getTimestamp("nguoiSua") != null) {
				category.setNguoiSua(rs.getString("nguoiSua"));
			}
			return category;
		} catch (SQLException e) {
			return null;
		}
	}

}
