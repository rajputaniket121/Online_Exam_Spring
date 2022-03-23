package com.online_exam_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_exam_system.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	List<UserModel> findByUsername(String username);
}
