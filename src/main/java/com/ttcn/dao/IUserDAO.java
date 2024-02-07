package com.ttcn.dao;

import com.ttcn.model.UserModel;

public interface IUserDAO {
	UserModel findByUsernameAndPassword(String username, String password);
}
