package com.example.logindemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.logindemo.model.UserLoginDetails;
import com.example.logindemo.service.UserLoginDetailsDao;
import com.example.logindemo.userRepo.UserRepository;

@Service
@Transactional
public class UserLoginDetailsDaoImpl implements UserLoginDetailsDao
{
	@Autowired
    private UserRepository userRepository;

	@Override
	public List<UserLoginDetails> findAll() {
		return userRepository.findAll();
	}
}
