package br.com.FrontDWP.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.FrontDWP.model.Folder;
import br.com.FrontDWP.services.FolderResource;

@Controller
public class HomeController
{
	
	
	@Autowired
	FolderResource folderService;

   @RequestMapping("/")
   public String index()
   {	   
      return "home/index";
   }
   @RequestMapping("/bpm")
   public String bpm (){
	   
	   return "home/bpm";
   }
}
