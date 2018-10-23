/**  
 * All rights Reserved, Designed By MIIA
 * @Title: FileUtil.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.utils;

import java.io.File;

/**
 * 文件操作工具类
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
public class FileUtil {

	/**
	 * 准备环境
	 * 
	 * @param dirPath
	 * @return
	 */
	public static File prepare(String dirPath) {
		File dirFile = new File(dirPath);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}
		return dirFile;
	}

}
