/**  
 * All rights Reserved, Designed By MIIA
 * @Title: UploadController.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.io.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

/**
 * 文件上传接口
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Api(description = "文件上传接口")
@RestController
@RequestMapping("/upload")
public class UploadController {

	/**
	 * 上传用户头像
	 * 
	 * @param file
	 * @param userId
	 * @return
	 */
	@PostMapping("/uploadHead")
	public Object uploadHead(@ApiParam("file") @RequestParam(value = "file", required = true) MultipartFile file,
			@ApiParam("userId") @RequestParam(value = "userId", required = true) String userId) {

		return null;
	}
}
