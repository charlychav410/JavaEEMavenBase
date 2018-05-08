package mx.com.cinepolis.schedule.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.cinepolis.scheduler.commons.to.UserSystemTO;
import mx.com.cinepolis.scheduler.facade.UserSystemFacadeEJB;



@Path("/system")
public class UserSystemRest {
	
	 @EJB
	 private UserSystemFacadeEJB userSystemFacadeEJB;
	 
	 @GET
	    @Produces("application/json")
	    @Path("/login/{login}")
	    public Response getLoginUsers(@PathParam("login") String login)
	    {
		 List<UserSystemTO> userTO = userSystemFacadeEJB.getLoginUsers(login);
	        return Response.ok().entity(userTO).build();
	    	
	    }
	 
	 @POST
	    @Path("/alta")
	    @Consumes(MediaType.APPLICATION_JSON)
	    public void setSystemUser(UserSystemTO userSystemTO) {
		 userSystemFacadeEJB.setSystemUsers(userSystemTO);
	    }
	 
	 
	 
	 @POST
	    @Path("/baja")
	    @Consumes(MediaType.APPLICATION_JSON)
	    public void deleteSystemUser(UserSystemTO userSystemTO) {
		 userSystemFacadeEJB.deleteSystemUsers(userSystemTO);
	 }
	 
	
	 
	 @POST
	    @Path("/cambio")
	    @Consumes(MediaType.APPLICATION_JSON)
	    public void changeUsers(UserSystemTO userSystemTO) {
		 userSystemFacadeEJB.changeUsers(userSystemTO);
	    }
	
	
	
}
