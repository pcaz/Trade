package com.presenceweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.presenceweb.service.UserService;
import com.presenceweb.service.UserServiceImpl;
import com.presenceweb.various.UserAffich;
import com.presenceweb.model.User;
import com.presenceweb.repository.UserRepository;

@Controller
@RequestMapping(value= "/admin")
public class AdminController {
	
	  
	   @RequestMapping(value= "", method = RequestMethod.GET)
	   public String index() {
	      return "adminHome";
	   }  

@Autowired 
private UserServiceImpl userServiceImpl;
@RequestMapping(value="/userList", method = RequestMethod.GET)
	   public String userList(Model model) {
      List<UserAffich> us= new ArrayList<UserAffich>();
      
      us=userServiceImpl.findAll();
      

      model.addAttribute("mode", "userList");
	   model.addAttribute("users",us);
		   return "adminHome";
        }
@RequestMapping(value= "/userProfil" , method = RequestMethod.GET)
public String userProfil(Model model) {
/* List<User> ret= new ArrayList<User>();
ret=UserService.findAll();
*/
model.addAttribute("mode", "userProfil");
	   return "adminHome";
 }

@RequestMapping(value="/userMessage", method = RequestMethod.GET)
public String userMessage(Model model) {
/* List<User> ret= new ArrayList<User>();
ret=UserService.findAll();
*/
model.addAttribute("mode", "userMessage");
	   return "adminHome";
 }
}
