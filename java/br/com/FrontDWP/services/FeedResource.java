package br.com.FrontDWP.services;


import java.util.Date;
import java.util.List;
import java.lang.reflect.Type;

import org.springframework.stereotype.Service;

import br.com.FrontDWP.util.ServicePath;
import br.com.FrontDWP.model.Feed;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


@Service
public class FeedResource {
	
	
public List<Feed> buscarFeeds(){
		
		
		Gson gson=null;
		String json=null;
		try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource(ServicePath.HOST+"/api/private/feed/findfeeds/");

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			json = response.getEntity(String.class);
			
			
		
			
			GsonBuilder builder = new GsonBuilder(); 

			// Register an adapter to manage the date types as long values -- PARSE DATE COMO LONG
			builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() { 
			   public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
			      return new Date(json.getAsJsonPrimitive().getAsLong()); 
			   } 
			});

			 gson = builder.create();
			
			
			System.out.println("Output from Server .... \n");
			//System.out.println(json);

		  } catch (Exception e) {

			e.printStackTrace();

		  }
		
		return  gson.fromJson(json, new TypeToken<List<Feed>>(){}.getType());	

	}


public Feed buscarFeedbyId(Long Id){
	
	
	Gson gson=null;
	String json=null;
	try {

		Client client = Client.create();

		WebResource webResource = client
		   .resource(ServicePath.HOST+"/api/private/feed/findbyfeedId/"+Id);

		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);

		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}

		json = response.getEntity(String.class);
		
		
	
		
		GsonBuilder builder = new GsonBuilder(); 

		// Register an adapter to manage the date types as long values -- PARSE DATE COMO LONG
		builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() { 
		   public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		      return new Date(json.getAsJsonPrimitive().getAsLong()); 
		   } 
		});

		 gson = builder.create();
		
		
		System.out.println("Output from Server .... \n");
		//System.out.println(json);

	  } catch (Exception e) {

		e.printStackTrace();

	  }
	
	return  gson.fromJson(json, new TypeToken<Feed>(){}.getType());	

}

}


