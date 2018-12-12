package com.example.logindemo.exceptions;

public class UserLoginDetailsDaoException extends DaoException
{
	/**
	 * Method 'UserLoginDetailsDaoException'
	 * 
	 * @param message
	 */
	public UserLoginDetailsDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'UserLoginDetailsDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public UserLoginDetailsDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
