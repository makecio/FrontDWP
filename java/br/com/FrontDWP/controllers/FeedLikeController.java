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
import br.com.FrontDWP.model.FeedLike;
import br.com.FrontDWP.services.FeedLikeResource;
import br.com.FrontDWP.services.FeedResource;

@Controller
public class FeedLikeController {
	
	@Autowired
	FeedLikeResource feedLikeService;
	
   @RequestMapping("/social/sendFeedLike")
   public @ResponseBody String sendFeedLike(FeedLike feedLike)
   {
   		
	   feedLike.setData(new Date().getTime());
	   feedLike.setDeleted(false);
	   feedLike.setHora(new Timestamp(System.currentTimeMillis()).getTime());
	   
	   FeedLike FeedLikeBD = new FeedLike();
	   FeedLikeBD = feedLikeService.buscarFeedLike(feedLike.getIdUser(), feedLike.getIdFeedComment());
	   GsonBuilder builder = new GsonBuilder(); 
	   
	   Gson gson = builder.create();
		 
	   if(FeedLikeBD == null){
		   return gson.toJson(feedLike);
	   }else{
		   return "1";
	   }

   }

   @RequestMapping("/social/getFeedLike")
   public @ResponseBody String getFeedLike(FeedLike f)
   {   
	   List<FeedLike> lsFeedLike = new ArrayList<FeedLike>();
	   lsFeedLike.add(f);
	   
	   GsonBuilder builder = new GsonBuilder(); 
	   
	   Gson gson = builder.create();
		 
	   return gson.toJson(lsFeedLike);

   }
   
}
