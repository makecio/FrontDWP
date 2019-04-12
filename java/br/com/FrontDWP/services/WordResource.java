package br.com.FrontDWP.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/doc")
public class WordResource {
	
	private static final String FILE_PATH = "c:\\file.doc";

	@GET
	@Path("/get")
	@Produces("application/msword")
	public Response getFile() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=\"file_from_server.doc\"");
		return response.build();

	}

}
