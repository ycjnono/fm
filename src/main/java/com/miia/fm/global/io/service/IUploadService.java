/**  
 * All rights Reserved, Designed By MIIA
 * @Title: IUploadService.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.io.service;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

import com.miia.fm.global.execption.FmException;

/**
 * 文件上传服务
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
public interface IUploadService {

	/**
	 * 基础文件上传服务
	 * 
	 * @param file
	 * @param dirPath
	 * @return
	 */
	public String uploadFile(File file, String dirPath) throws FmException;

	/**
	 * 二进制文件上传
	 * 
	 * @param file
	 * @param dirPath
	 * @return
	 * @throws FmException
	 */
	public String uploadFile(MultipartFile file, String dirPath,String fileName) throws FmException;

}
