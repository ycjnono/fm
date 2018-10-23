/**  
 * All rights Reserved, Designed By MIIA
 * @Title: IRoleRepository.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.platform.oauth.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miia.fm.platform.oauth.entity.Role;

/**
 * 角色持久化接口
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Repository
public interface IRoleRepository extends JpaRepository<Role, String> {

}
