package com.ali.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
    public String hello(@RequestParam(value="name", required=false) String name,@RequestParam(value="last_name", required=false) String lastName,@RequestParam(value="times", required=false) int times) {
        if(name==null) {
        return "Hello Human!";	
        }else {
        	return (" Hello "+name+" "+lastName).repeat(times);
        }
		
    }
}
