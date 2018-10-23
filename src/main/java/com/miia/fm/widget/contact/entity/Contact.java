/**  
 * All rights Reserved, Designed By MIIA
 * @Title: Contact.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.widget.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.miia.fm.global.base.BaseEntity;
import com.miia.fm.platform.oauth.entity.User;

/**
 * 联系人实体
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Entity
@Table(name = "fm_contact")
public class Contact extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3177169758916770416L;

	/**
	 * 是否为好友
	 */
	@Column(name = "friend")
	private boolean friend = false;

	/**
	 * 是否为黑名单
	 */
	@Column(name = "deny")
	private boolean deny = false;

	/**
	 * 白名单
	 */
	@Column(name = "allow")
	private boolean allow = false;

	/**
	 * 关注
	 */
	@Column(name = "follow")
	private boolean follow = false;

	/**
	 * 关联用户id
	 */
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "connect_user_id")
	private User connectUser;

	/**
	 * @return the friend
	 */
	public boolean isFriend() {
		return friend;
	}

	/**
	 * @param friend the friend to set
	 */
	public void setFriend(boolean friend) {
		this.friend = friend;
	}

	/**
	 * @return the deny
	 */
	public boolean isDeny() {
		return deny;
	}

	/**
	 * @param deny the deny to set
	 */
	public void setDeny(boolean deny) {
		this.deny = deny;
	}

	/**
	 * @return the allow
	 */
	public boolean isAllow() {
		return allow;
	}

	/**
	 * @param allow the allow to set
	 */
	public void setAllow(boolean allow) {
		this.allow = allow;
	}

	/**
	 * @return the follow
	 */
	public boolean isFollow() {
		return follow;
	}

	/**
	 * @param follow the follow to set
	 */
	public void setFollow(boolean follow) {
		this.follow = follow;
	}

	/**
	 * @return the connectUser
	 */
	public User getConnectUser() {
		return connectUser;
	}

	/**
	 * @param connectUser the connectUser to set
	 */
	public void setConnectUser(User connectUser) {
		this.connectUser = connectUser;
	}

}
