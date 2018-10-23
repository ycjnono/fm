/**  
 * All rights Reserved, Designed By MIIA
 * @Title: IUserService.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.platform.oauth.service;

import com.miia.fm.platform.oauth.entity.User;

/**
 * 用户服务接口
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
public interface IUserService {

	/**
	 * 新增用户
	 * 
	 * @param user
	 * @return
	 */
	public User save(User user);

}
