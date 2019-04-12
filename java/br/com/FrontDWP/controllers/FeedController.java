package br.com.FrontDWP.controllers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.FrontDWP.model.Feed;
import br.com.FrontDWP.services.FeedResource;

@Controller
public class FeedController {
	
	@Autowired
	FeedResource feedService;
	
   @RequestMapping("/social/feed")
   public String feed(Model mFeed)
   {
   		List<Feed> lsFeeds = feedService.buscarFeeds();
   		for(Feed f: lsFeeds){
   			f.setDataView(new Date(f.getData()));
   			f.setHoraView(new Timestamp(f.getHora()));
   		}
   		
   		mFeed.addAttribute("lsFeed", lsFeeds);
	   
	    return "social/feed";

   }
   
   @RequestMapping("/social/sendFeed")
   public @ResponseBody String sendFeed(Feed feed)
   {
   		
	   feed.setData(new Date().getTime());
	   feed.setDeleted(false);
	   feed.setHora(new Timestamp(System.currentTimeMillis()).getTime());
	   
	   GsonBuilder builder = new GsonBuilder(); 
	   
	   Gson gson = builder.create();
		 
	   return gson.toJson(feed);

   }
   
   @RequestMapping("/social/getFeed")
   public @ResponseBody String getFeed(Feed f)
   {
	   Feed feed = feedService.buscarFeedbyId(f.getId());
	   
	   feed.setDataView(new Date(feed.getData()));
	   feed.setHoraView(new Timestamp(feed.getHora()));
	   
	   List<Feed> lsFeed = new ArrayList<Feed>();
	   lsFeed.add(feed);
	   
	   GsonBuilder builder = new GsonBuilder(); 
	   
	   Gson gson = builder.create();
		 
	   return gson.toJson(lsFeed);

   }
}
