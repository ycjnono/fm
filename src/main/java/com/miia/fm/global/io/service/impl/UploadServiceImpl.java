/**  
 * All rights Reserved, Designed By MIIA
 * @Title: UploadServiceImpl.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.io.service.impl;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.miia.fm.global.execption.FmException;
import com.miia.fm.global.io.service.IUploadService;
import com.miia.fm.global.utils.FileUtil;

/**
 * 文件上传接口服务实现类
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Service
public class UploadServiceImpl implements IUploadService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.miia.fm.global.io.service.IUploadService#uploadFile(java.io.File,
	 * java.lang.String)
	 */
	@Override
	public String uploadFile(File file, String dirPath) throws FmException {
		if (StringUtils.isNotBlank(dirPath) && file != null) {
			File dirFile = FileUtil.prepare(dirPath);
			if (dirFile != null) {

			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.miia.fm.global.io.service.IUploadService#uploadFile(org.springframework.
	 * web.multipart.MultipartFile, java.lang.String)
	 */
	@Override
	public String uploadFile(MultipartFile file, String dirPath, String fileName) throws FmException {
		if (StringUtils.isNotBlank(dirPath) && file != null) {
			FileUtil.prepare(dirPath);
			try {
				fileName = URLDecoder.decode(new String(fileName.getBytes("ISO8859-1"), "UTF-8"), "UTF-8"); // 文件名称转码
				File uploadFile = new File(dirPath, fileName);
				file.transferTo(uploadFile); // 文件上传
				return uploadFile.getAbsolutePath();
			} catch (IOException e) {
				throw new FmException(e);
			}
		}
		return null;
	}

}
