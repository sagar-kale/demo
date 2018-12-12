package com.example.logindemo.service;

import java.util.List;

import com.example.logindemo.model.UserLoginDetails;

public interface UserLoginDetailsDao
{	
	/**
	 * Returns all rows from the user_login_details table that match the criteria ''.
	 */
	public List<UserLoginDetails> findAll();
}
