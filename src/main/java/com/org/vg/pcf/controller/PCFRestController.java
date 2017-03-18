package com.org.vg.pcf.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.org.vg.pcf.domain.Fund;
import com.org.vg.pcf.service.FundService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PCFRestController {

@Autowired
FundService fundService;
    
	 @RequestMapping(value = "/fund", method = RequestMethod.GET)
	    public List<Fund> listFunds() {
	       /* ArrayList<String> funds = new ArrayList();
	        funds.add("500 SP Index Fund");
	        funds.add("Total Bond Market Index Fund");
	        funds.add("Short Term Active fund");
	        
	        return funds;*/
		 
		 return fundService.getFunds();
	    }
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public List list() {
	        return this.listFunds();
	    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public String handleUserAlreadyExistsException(Exception e) {
        return e.getMessage();
    }

}