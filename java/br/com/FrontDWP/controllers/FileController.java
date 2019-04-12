package br.com.FrontDWP.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
	
	@RequestMapping("/permissionfile")
	public String permissionfile(){
		
		
		return "home/permissionfile";
	}
	
	@RequestMapping("/datafile")
	public String datafile(){
		
		
		return "home/datafile";
	}
	
	@RequestMapping("/fileupload")
	public String fileupload(){
		
		
		return "home/fileupload";
	}

}
