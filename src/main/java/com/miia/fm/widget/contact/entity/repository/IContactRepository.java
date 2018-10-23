/**  
 * All rights Reserved, Designed By MIIA
 * @Title: IContactRepository.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.widget.contact.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miia.fm.widget.contact.entity.Contact;

/**
 * 联系人持久化接口
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Repository
public interface IContactRepository extends JpaRepository<Contact, String> {

}
