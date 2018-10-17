/**  
 * All rights Reserved, Designed By MIIA
 * @Title: GlobalExceptionHandler.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.handler;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miia.fm.global.execption.FmException;
import com.miia.fm.global.execption.FmRunTimeException;
import com.miia.fm.global.result.CommonResult;

/**
 * 统一异常处理器
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	Log logger = LogFactory.getLog(GlobalExceptionHandler.class);

	/**
	 * 拦截所有抛出的FmException
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = FmException.class)
	@ResponseBody
	public CommonResult jsonErrorHandler(FmException e) {
		CommonResult response = new CommonResult(e);
		logger.error("Fm Server Has Error!", e);
		return response;
	}

	/**
	 * 拦截所有抛出的FmRunTimeException
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = FmRunTimeException.class)
	@ResponseBody
	public CommonResult jsonErrorHandler(FmRunTimeException e) {
		CommonResult response = new CommonResult(e);
		logger.error("Fm Server Has Error!", e);
		return response;
	}

}
