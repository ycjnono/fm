/**  
 * All rights Reserved, Designed By MIIA
 * @Title: UserServiceImpl.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.platform.oauth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miia.fm.platform.oauth.entity.User;
import com.miia.fm.platform.oauth.entity.repository.IUserRepository;
import com.miia.fm.platform.oauth.service.IUserService;

/**
 * 用户服务接口
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;
	
	/* (non-Javadoc)
	 * @see com.miia.fm.platform.oauth.service.IUserService#save(com.miia.fm.platform.oauth.entity.User)
	 */
	@Override
	public User save(User user) {
		return userRepository.saveAndFlush(user);
	}

}
