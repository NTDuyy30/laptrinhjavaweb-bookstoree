package com.ttcn.service;

import com.ttcn.model.UserModel;

public interface IUserService {
	UserModel findByUsernameAndPassword(String username, String password);
}
