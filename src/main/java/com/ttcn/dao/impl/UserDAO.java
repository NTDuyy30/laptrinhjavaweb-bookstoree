package com.ttcn.dao.impl;

import java.util.List;

import com.ttcn.dao.IUserDAO;
import com.ttcn.mapper.UserMapper;
import com.ttcn.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {
	
	@Override
	public UserModel findByUsernameAndPassword(String username, String password) {
		String sql = "SELECT * FROM NGUOIDUNG WHERE tenDangNhap = ? AND matKhau = ?";
		List<UserModel> users = super.query(sql, new UserMapper(), username, password);
		return users.isEmpty() ? null : users.get(0);
	}
}
