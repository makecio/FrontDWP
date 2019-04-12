package br.com.FrontDWP.controllers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import br.com.FrontDWP.model.FeedComment;
import br.com.FrontDWP.services.FeedCommentResource;

@Controller
public class FeedCommentController {
	
	@Autowired
	FeedCommentResource feedCommentService;
	
   @RequestMapping("/social/sendFeedComment")
   public @ResponseBody String sendFeedComment(FeedComment feedComment)
   {
   		
	   feedComment.setData(new Date().getTime());
	   feedComment.setDeleted(false);
	   feedComment.setHora(new Timestamp(System.currentTimeMillis()).getTime());
	   
	   GsonBuilder builder = new GsonBuilder(); 
	   
	   Gson gson = builder.create();
		 
	   return gson.toJson(feedComment);

   }
   
   @RequestMapping("/social/getFeedComment")
   public @ResponseBody String getFeedComment(FeedComment f)
   {
	   FeedComment feedComment = feedCommentService.buscarFeedCommentById(f.getId());
	   
	   feedComment.setDataView(new Date(feedComment.getData()));
	   feedComment.setHoraView(new Timestamp(feedComment.getHora()));
	   
	   List<FeedComment> lsFeedComment = new ArrayList<FeedComment>();
	   lsFeedComment.add(feedComment);
	   
	   GsonBuilder builder = new GsonBuilder(); 
	   
	   Gson gson = builder.create();
		 
	   return gson.toJson(lsFeedComment);

   }
   
}
