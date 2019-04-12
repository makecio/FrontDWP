package br.com.FrontDWP.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SocialController
{

   @RequestMapping("/social/profile")
   public String profile()
   {
   		
	    return "social/profile";

   }
  
   
   @RequestMapping("/social/chat")
   public String chat()
   {
   		
	    return "social/chat";

   }

}