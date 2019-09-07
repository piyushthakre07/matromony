package com.app.module.registration.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.beans.StatusBean;
import com.app.beans.TemporaryBean;
import com.app.module.registration.service.ITemporaryService;

@Controller
@RequestMapping(path = "/register", produces = "application/json")
public class TemporaryController {

	@Autowired
	ITemporaryService temporaryService;

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ResponseEntity<?> saveTempDetails(HttpServletRequest request,
			@RequestBody TemporaryBean temporaryBean) {
		StatusBean statusBean = new StatusBean();
		statusBean = temporaryService.saveTempDetails(temporaryBean);
		if (statusBean.getStatus()) {
			return new ResponseEntity<StatusBean>(statusBean, HttpStatus.OK);
		} else {
			return new ResponseEntity<StatusBean>(statusBean, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
