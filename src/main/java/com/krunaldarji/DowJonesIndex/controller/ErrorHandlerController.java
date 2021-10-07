package com.krunaldarji.DowJonesIndex.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandlerController implements ErrorController {
	
	@RequestMapping("/error")
	public ResponseEntity<String> getErrorPath() {
		return new ResponseEntity<>("Wrong URL", HttpStatus.NOT_FOUND);
	}


}
