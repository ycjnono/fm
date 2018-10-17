/**  
 * All rights Reserved, Designed By MIIA
 * @Title: User.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.paltform.oauth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.miia.fm.global.base.BaseEntity;

/**
 * 用户实体
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Entity
@Table(name = "fm_user")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7322655809380627642L;

	/**
	 * 用户名
	 */
	@Column(name = "username")
	private String userName;

	/**
	 * 密码
	 */
	@Column(name = "password")
	private String password;

	/**
	 * 加密值
	 */
	@Column(name = "salt")
	private String salt;

	/**
	 * 关联手机号
	 */
	@Column(name = "tel_number")
	private String telNumber;

	/**
	 * 关联邮箱
	 */
	@Column(name = "email")
	private String email;

	/**
	 * 关联qq号
	 */
	@Column(name = "qq_number")
	private String qqNumber;

	/**
	 * 关联微信号
	 */
	@Column(name = "wechat_number")
	private String weChatNumber;

	/**
	 * 用户状态
	 */
	@Column(name = "status")
	private boolean status;

	/**
	 * 角色-多对一关联关系，懒加载
	 */
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the telNumber
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * @param telNumber the telNumber to set
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the qqNumber
	 */
	public String getQqNumber() {
		return qqNumber;
	}

	/**
	 * @param qqNumber the qqNumber to set
	 */
	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}

	/**
	 * @return the weChatNumber
	 */
	public String getWeChatNumber() {
		return weChatNumber;
	}

	/**
	 * @param weChatNumber the weChatNumber to set
	 */
	public void setWeChatNumber(String weChatNumber) {
		this.weChatNumber = weChatNumber;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}
