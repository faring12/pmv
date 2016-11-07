package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Max
 *
 */

@Controller
public class ApplicationController {
	
	@RequestMapping("/login")
	public String login() {
		return "/WEB-INF/jsp/login.jsp";
	}
	
}
