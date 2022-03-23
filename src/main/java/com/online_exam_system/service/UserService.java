package com.online_exam_system.service;

import com.online_exam_system.model.UserModel;

public interface UserService {
	UserModel findByUsername(String username);

}
