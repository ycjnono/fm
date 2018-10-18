/**  
 * All rights Reserved, Designed By MIIA
 * @Title: FmFile.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.io.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.miia.fm.global.base.BaseEntity;

/**
 * 封装文件实体
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Entity
@Table(name = "fm_file")
public class FmFile extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1332613128012991041L;

	/**
	 * 文件名称
	 */
	@Column(name = "file_name")
	private String fileName;

	/**
	 * 文件路径
	 */
	@Column(name = "path")
	private String path;

	/**
	 * 父级文件夹目录
	 */
	@Column(name = "parent_path")
	private String parentPath;

	/**
	 * 父级文件夹名称
	 */
	@Column(name = "parent_name")
	private String parentName;

	/**
	 * 文件真实名称
	 */
	@Column(name = "real_name")
	private String realName;

	/**
	 * 文件类型
	 */
	@Column(name = "file_type")
	private FileTypeEnum fileType;

	/**
	 * 文件后缀名称
	 */
	@Column(name = "suffix")
	private String suffix;

	/**
	 * md5值
	 */
	@Column(name = "md5")
	private String md5;

	/**
	 * 文件长度
	 */
	@Column(name = "length")
	private long length;

	/**
	 * 文件IO时间，上传及下载时间
	 */
	@Column(name = "io_time")
	private Date IOTime;

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the parentPath
	 */
	public String getParentPath() {
		return parentPath;
	}

	/**
	 * @param parentPath the parentPath to set
	 */
	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}

	/**
	 * @return the parentName
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * @param parentName the parentName to set
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * @return the fileType
	 */
	public FileTypeEnum getFileType() {
		return fileType;
	}

	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(FileTypeEnum fileType) {
		this.fileType = fileType;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @return the md5
	 */
	public String getMd5() {
		return md5;
	}

	/**
	 * @param md5 the md5 to set
	 */
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	/**
	 * @return the length
	 */
	public long getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(long length) {
		this.length = length;
	}

	/**
	 * @return the iOTime
	 */
	public Date getIOTime() {
		return IOTime;
	}

	/**
	 * @param iOTime the iOTime to set
	 */
	public void setIOTime(Date iOTime) {
		IOTime = iOTime;
	}

}
