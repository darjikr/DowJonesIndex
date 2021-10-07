package com.krunaldarji.DowJonesIndex.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping("/")
	public void getIndex(HttpServletResponse response) throws IOException {
		response.sendRedirect("/api/stocks");
	}

}
