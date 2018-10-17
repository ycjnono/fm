/**  
 * All rights Reserved, Designed By MIIA
 * @Title: FmException.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.execption;

/**
 * 封装Exception
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
public class FmException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6986635469920975383L;

	/**
	 * 错误码
	 */
	private int code;
	
	public FmException(String message, int code, Throwable e) {
		super(message, e);
		this.code = code;
	}

	public FmException(Throwable e) {
		super(e);
		this.code = 500;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

}
