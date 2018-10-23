/**  
 * All rights Reserved, Designed By MIIA
 * @Title: SwaggerConfiguration.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 配置类
 * <p>
 * 默认访问地址http://${host}:${port}/doc.html
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	/**
	 * 基础包名称
	 */
	private String basePackage = "com.miia.fm";

	/**
	 * swagger标题
	 */
	private String title = "miia fm apis";

	/**
	 * 描述
	 */
	private String description = "Apis For FM";

	/**
	 * 连接地址
	 */
	private String serviceUrl = "http://127.0.0.1:8080";

	/**
	 * 联系人
	 */
	private String contact = "ycjnono@126.com";

	/**
	 * 服务版本
	 */
	private String verison = "1.0";

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.any()).build();
	}

	/**
	 * api基本信息
	 * 
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(description).termsOfServiceUrl(serviceUrl).contact(contact)
				.version(verison).build();
	}

}
