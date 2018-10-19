/**  
 * All rights Reserved, Designed By MIIA
 * @Title: Cache.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.cache.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 缓存结果标记
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Cache {

}
