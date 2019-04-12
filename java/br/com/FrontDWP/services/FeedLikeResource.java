package br.com.FrontDWP.services;


import java.util.Date;
import java.util.List;
import java.lang.reflect.Type;
import org.springframework.stereotype.Service;
import br.com.FrontDWP.util.ServicePath;
import br.com.FrontDWP.model.FeedLike;
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
public class FeedLikeResource {
	
	
public FeedLike buscarFeedLike(Long Id, Long IdFeedComment){
		
		
		Gson gson=null;
		String json=null;
		try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource(ServicePath.HOST+"/api/private/feedlike/findfeedlike/"+IdFeedComment+"/"+Id);

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			json = response.getEntity(String.class);
			
			
		
			
			GsonBuilder builder = new GsonBuilder(); 


			 gson = builder.create();
			
			
			System.out.println("Output from Server .... \n");
		

		  } catch (Exception e) {

			e.printStackTrace();

		  }
		
		return  gson.fromJson(json, new TypeToken<FeedLike>(){}.getType());	

	}


}


