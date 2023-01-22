package com.akshay.gen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.gen.model.ApiResponse;
import com.akshay.gen.model.Password;
import com.akshay.gen.model.PasswordGenModel;
import com.akshay.gen.model.PasswordModel;
import com.akshay.gen.model.SavePasswordModel;
import com.akshay.gen.service.PasswordService;
import com.akshay.gen.utility.PasswordGenerator;

@RestController
public class PasswordController {
	
	@Autowired
	private PasswordService passwordService;
	
	@GetMapping("/password-gen")
	public PasswordGenModel generatePassword() {
		return new PasswordGenModel(new PasswordGenerator(true, true, true, true).generatePassword(15));
	}
	
	@GetMapping("/check-pass-strength")
	public ApiResponse checkPasswordStrength(@RequestParam String password) {
		return new ApiResponse(new Password(password).getStrength());
	}
	
	@PostMapping("/save-password")
	public ApiResponse savePassword(@RequestBody SavePasswordModel savePasswordModel) {
		ApiResponse response = new ApiResponse();
		passwordService.savePassword(savePasswordModel);
		return response;
	}
	
	@GetMapping("/get-all-passwords")
	public List<PasswordModel> getAllPasswords(@RequestParam String userId) {
		return passwordService.findAllPasswordsByUserId(userId);
	}

}
