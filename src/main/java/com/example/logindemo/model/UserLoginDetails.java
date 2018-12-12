package com.example.logindemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserLoginDetails
{
	@Id
	@GeneratedValue
	/** 
	 * This attribute maps to the column U_ID in the user_login_details table.
	 */
	protected int uId;

	/** 
	 * This attribute maps to the column U_NAME in the user_login_details table.
	 */
	protected String uName;

	/** 
	 * This attribute maps to the column USERNAME in the user_login_details table.
	 */
	protected String username;

	/** 
	 * This attribute maps to the column PASSWORD in the user_login_details table.
	 */
	protected String password;

	/**
	 * Method 'UserLoginDetails'
	 * 
	 */
	public UserLoginDetails()
	{
	}

	/**
	 * Method 'getUId'
	 * 
	 * @return int
	 */
	public int getUId()
	{
		return uId;
	}

	/**
	 * Method 'setUId'
	 * 
	 * @param uId
	 */
	public void setUId(int uId)
	{
		this.uId = uId;
	}

	/**
	 * Method 'getUName'
	 * 
	 * @return String
	 */
	public String getUName()
	{
		return uName;
	}

	/**
	 * Method 'setUName'
	 * 
	 * @param uName
	 */
	public void setUName(String uName)
	{
		this.uName = uName;
	}

	/**
	 * Method 'getUsername'
	 * 
	 * @return String
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Method 'setUsername'
	 * 
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.example.logindemo.dto.UserLoginDetails: " );
		ret.append( "uId=" + uId );
		ret.append( ", uName=" + uName );
		ret.append( ", username=" + username );
		ret.append( ", password=" + password );
		return ret.toString();
	}

}
