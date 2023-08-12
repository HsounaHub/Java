package com.ali.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class CounterController {
	@RequestMapping("/")
    public String index(HttpSession session) {
		
		if (session.getAttribute("count") == null) {
			// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
		}
			else {
			// increment the count by 1 using getAttribute and setAttribute
				int incrementedCount=(int) session.getAttribute("count")+1;
				session.setAttribute("count", incrementedCount);
			}
		return "index.jsp";
    }
	@RequestMapping("/counter")
    public String counter() {
        return "counter.jsp";
    }
}
