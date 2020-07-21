package rest;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
@Path("/Admin")
public class AdminEndpoint {
	   @GET
	   @Produces("text/plain")
	   public Response doGet() {
	       return Response.ok("Logged in").build();
	   }
}
