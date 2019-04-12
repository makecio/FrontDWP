package br.com.FrontDWP.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.FrontDWP.model.File;
import br.com.FrontDWP.model.Folder;
import br.com.FrontDWP.services.FileResource;
import br.com.FrontDWP.services.FolderResource;

@Controller
public class GedController
{
	@Autowired
	FolderResource folderService;
	
	@Autowired
	FileResource fileService;

   @RequestMapping("/ged/index")
   public String index()
   {
	   	   
     	return "ged/index";
   }

   @RequestMapping("/ged/lsFolders")
   public String getFolders(Model lsfolder)
   {

   		List<Folder>lsfolders= new ArrayList<>();
	   
	    lsfolders=folderService.buscarfolder();
	   
	    System.out.println("Lista: "+lsfolders.get(0).getName());
	   
	    lsfolder.addAttribute("lsfolder",lsfolders);

	    return "ged/lsFolders";

   }
   
   @RequestMapping("/ged/fileupload")
   public String fileupload()
   {
   		
	    return "ged/fileupload";

   }
   
   @RequestMapping("/ged/lsFiles")
   public String getFilesId(Model lsfile, @RequestParam("id")int id)
   {

	   	
   		List<File>lsfiles= new ArrayList<>();
	    lsfiles=fileService.buscarfilefolderid(id);
	   
	    System.out.println("Lista: "+lsfiles.get(0).getName());
	   
	    lsfile.addAttribute("lsfiles",lsfiles);

	    return "ged/lsFiles";

   }

}