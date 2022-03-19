package com.online_exam_system.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.online_exam_system.model.UserModel;
import com.online_exam_system.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:8081")
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserModelRepository UserModelRepository;

	@GetMapping("/users")
	public ResponseEntity<List<UserModel>> getAllUserModels(@RequestParam(required = false) String username) {
		try {
			List<UserModel> UserModels = new ArrayList<UserModel>();
			if (username == null)
				UserModels = UserModelRepository.findAll(); // .findAll().forEach(UserModels::add);
			else
				UserModelRepository.findByUsername(username).forEach(UserModels::add);
			if (UserModels.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(UserModels, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<UserModel> getUserModelById(@PathVariable("id") long id) {
		Optional<UserModel> UserModelData = UserModelRepository.findById(id);
		if (UserModelData.isPresent()) {
			return new ResponseEntity<>(UserModelData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/users")
	public ResponseEntity<UserModel> createUserModel(@RequestBody UserModel UserModel) {
		try {
			UserModel _UserModel = UserModelRepository.save(new UserModel(UserModel.getFullname(),
					UserModel.getUsername(), UserModel.getPassword(), UserModel.getMobileno(), UserModel.getDob(),
					UserModel.getCity(), UserModel.getState(), UserModel.getQualification(), UserModel.getYear()));
			return new ResponseEntity<>(_UserModel, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/users/{id}")
	public ResponseEntity<UserModel> updateUserModel(@PathVariable("id") long id, @RequestBody UserModel UserModel) {
		Optional<UserModel> UserModelData = UserModelRepository.findById(id);
		if (UserModelData.isPresent()) {
			UserModel _UserModel = UserModelData.get();
			_UserModel.setFullname(UserModel.getFullname());
			_UserModel.setUsername(UserModel.getUsername());
			_UserModel.setPassword(UserModel.getPassword());
			_UserModel.setMobileno(UserModel.getMobileno());
			_UserModel.setDob(UserModel.getDob());
			_UserModel.setCity(UserModel.getCity());
			_UserModel.setState(UserModel.getState());
			_UserModel.setQualification(UserModel.getQualification());
			_UserModel.setYear(UserModel.getYear());
			return new ResponseEntity<>(UserModelRepository.save(_UserModel), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUserModel(@PathVariable("id") long id) {
		try {
			UserModelRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/users")
	public ResponseEntity<HttpStatus> deleteAllUserModels() {
		try {
			UserModelRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
