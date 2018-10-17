/**  
 * All rights Reserved, Designed By MIIA
 * @Title: LoginController.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.paltform.oauth.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miia.fm.global.execption.FmException;
import com.miia.fm.global.result.CommonResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author miia
 * @since beijing @ 2018.10
 */
@Api("登陆控制接口")
@RestController
public class LoginController {

	/**
	 * 测试登陆接口
	 * 
	 * @param userName
	 * @return
	 * @throws FmException
	 */
	@ApiOperation("登陆")
	@GetMapping("/login")
	public Object login(@ApiParam("用户名") @RequestParam("userName") String userName) throws FmException {
		CommonResult result = new CommonResult(200, "现在时间：", new Date());
		int i = 0;
		try {
			int c = 1 / i;
			System.out.println(c);
		} catch (Exception e) {
			throw new FmException(e);
		}
		return result;
	}

}
