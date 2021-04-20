package com.presenceweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.presenceweb.service.UserService;
import com.presenceweb.model.User;

@Controller

public class AdminController {
	   @GetMapping("/admin")
	   public String index() {
	      return "adminHome";
	   }
	   @GetMapping("/admin/userlist")
	   public String userList(Model model) {
		   
		   return "adminHome";
	   }
 

}
