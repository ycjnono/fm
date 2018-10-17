/**  
 * All rights Reserved, Designed By MIIA
 * @Title: Role.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.paltform.oauth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.miia.fm.global.base.BaseEntity;

/**
 * 角色实体
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Entity
@Table(name = "fm_role")
public class Role extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6997266042742886306L;

	/**
	 * 角色名称
	 */
	@Column(name = "role_name")
	private String roleName;

	/**
	 * 角色状态
	 */
	@Column(name = "role_status")
	private boolean status = false;

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
