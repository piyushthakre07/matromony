package com.app.module.master.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.beans.TemporaryBean;
import com.app.module.master.service.ITemporaryService;

@Controller
@RequestMapping(path = "/register", produces = "application/json")
public class TemporaryController {

	@Autowired
	ITemporaryService temporaryService;
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> saveTempDetails(HttpServletRequest request, @RequestBody TemporaryBean temporaryBean){
		
		String message = "";
		
		boolean status=temporaryService.saveTempDetails(temporaryBean);
		if (status) {
			message = "Success";
			
		} else {
			message = "Fail";
		}
		return new ResponseEntity<String>(message, HttpStatus.OK);
		
		
	}
}
