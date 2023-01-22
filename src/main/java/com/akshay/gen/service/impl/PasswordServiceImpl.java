package com.akshay.gen.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.gen.entity.PasswordEntity;
import com.akshay.gen.model.PasswordModel;
import com.akshay.gen.model.SavePasswordModel;
import com.akshay.gen.repository.PasswordRepo;
import com.akshay.gen.service.PasswordService;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Autowired
	private PasswordRepo passwordRepo;
	
	@Override
	public void savePassword(SavePasswordModel savePasswordModel) {
		passwordRepo.save(new PasswordEntity(
				savePasswordModel.getWebsiteUrl(),
				savePasswordModel.getUserName(),
				savePasswordModel.getUserId(),
				savePasswordModel.getPassword()
				));
	}

	@Override
	public List<PasswordModel> findAllPasswordsByUserId(String userId) {
		List<PasswordEntity> list = passwordRepo.findByUserId(userId);
		return convertPasswordEntityToModel(list);
	}

	private List<PasswordModel> convertPasswordEntityToModel(List<PasswordEntity> entityList) {
		List<PasswordModel> list = new ArrayList<>();
		for (PasswordEntity entity: entityList)
			list.add(new PasswordModel(
					entity.getUrl(),
					entity.getUserName(),
					entity.getUserId(),
					entity.getPassword()
					));
		return list;
	}

}
