package com.ttcn.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ttcn.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs) {
		try {
			UserModel user = new UserModel();
			user.setId(rs.getLong("id"));
			user.setHoTen(rs.getString("hoTen"));
			user.setSdt(rs.getString("sdt"));
			user.setDiaChi(rs.getString("diaChi"));
			user.setChucVu(rs.getString("chucVu"));
			user.setTenDangNhap(rs.getString("tenDangNhap"));
			user.setMatKhau(rs.getString("matKhau"));
			
			if (rs.getTimestamp("ngaySua") != null) {
				user.setNgaySua(rs.getTimestamp("ngaySua"));
			}
			if (rs.getTimestamp("nguoiSua") != null) {
				user.setNguoiSua(rs.getString("nguoiSua"));
			}
			return user;
		} catch (SQLException e) {
			return null;
		}
	}

}
