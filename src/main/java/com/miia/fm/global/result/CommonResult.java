/**  
 * All rights Reserved, Designed By MIIA
 * @Title: CommonResult.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.result;

import java.io.Serializable;

import com.miia.fm.global.execption.FmException;
import com.miia.fm.global.execption.FmRunTimeException;

/**
 * 统一返回结果集
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
public class CommonResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -917650104722636873L;

	/**
	 * 回文状态码
	 */
	private int code;

	/**
	 * 回文描述
	 */
	private String message;

	/**
	 * 回文内容
	 */
	private Object data;

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

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 全參
	 * 
	 * @param code
	 * @param message
	 * @param data
	 */
	public CommonResult(int code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * 无参构造
	 */
	public CommonResult() {
		super();
	}

	/**
	 * 根据异常构造结果集
	 * 
	 * @param e
	 */
	public CommonResult(FmException e) {
		this.code = e.getCode();
		this.message = e.getMessage();
	}

	/**
	 * 根据异常构造结果集
	 * 
	 * @param e
	 */
	public CommonResult(FmRunTimeException e) {
		this.code = e.getCode();
		this.message = e.getMessage();
	}

}
