package com.akshay.gen.service;

import java.util.List;

import com.akshay.gen.model.PasswordModel;
import com.akshay.gen.model.SavePasswordModel;

public interface PasswordService {
	
	public void savePassword(SavePasswordModel savePasswordModel);
	
	public List<PasswordModel> findAllPasswordsByUserId(String userId);

}
