package com.miia.fm.druid;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

/**
 * druid配置类
 * 
 * @author miia
 * @since beijing @ 2018.03
 */
@Configuration
@ConditionalOnClass(com.alibaba.druid.pool.DruidDataSource.class)
@ConditionalOnProperty(name = "spring.datasource.type", havingValue = "com.alibaba.druid.pool.DruidDataSource", matchIfMissing = true)
public class DruidDataSource {

	/**
	 * @see
	 * 
	 * @return DruidDataSource
	 */
	@Bean
	@ConfigurationProperties("spring.datasource.druid")
	public DataSource dataSourceOne() {
		return DruidDataSourceBuilder.create().build();
	}

}
