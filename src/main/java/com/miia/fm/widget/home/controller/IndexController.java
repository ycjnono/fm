/**  
 * All rights Reserved, Designed By MIIA
 * @Title: IndexController.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.widget.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页
 * 
 * @author miia
 * @since beijing @ 2018.10
 */
@Controller
public class IndexController {

	/**
	 * 测试模板
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/view")
	public String index(Model model) {
		model.addAttribute("name", "miss yan");
		return "index";
	}
}
