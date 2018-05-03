package mx.com.cinepolis.schedule.rest;

import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.facade.CatalogFacadeEJB;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * @author jrodriguez
 */
@Path("/catalog")
public class CatalogRest {

    @EJB
    private CatalogFacadeEJB catalogFacadeEJB;
    

    @GET
    @Produces("application/json")
    @Path("/user")
    public Response getSimpleCatalog()
    {
        UserTO userTO = catalogFacadeEJB.getSimpleUser();
        return Response.ok().entity(userTO).build();
    }
    
    @GET
    @Produces("application/json")
    @Path("/country")
    //country?pais=Mexico     llave pais     valor Mexico
    public Response getEstados(@Context UriInfo ui) {
    	
    	MultivaluedMap<String , String> queryParams= ui.getQueryParameters();
    	String pais = queryParams.getFirst("pais");
    	List<CatalogsTO> catalogsTOList = catalogFacadeEJB.getEstadoList(pais);
    	GenericEntity<List<CatalogsTO>> entity =
                new GenericEntity<List<CatalogsTO>>(catalogsTOList) {};
    	return Response.ok().entity(entity).build();
    }
    
    @GET
    @Produces("application/json")
    @Path("/users/{login}")
    public Response getLogin(@PathParam("login") String login) {
    	List<CatalogsTO> usersTOList = catalogFacadeEJB.getLogin(login);
    	GenericEntity<List<CatalogsTO>> entityLogin =
                new GenericEntity<List<CatalogsTO>>(usersTOList) {};
    	return Response.ok().entity(entityLogin).build();
    }
    
    
   /* @GET
    @Produces("application/json")
    @Path("/country/{pais}")
    public Response getEstados(@PathParam("pais")String pais) {
    	
    	List<CatalogsTO> catalogsTOList = catalogFacadeEJB.getEstadoList(pais);
    	GenericEntity<List<CatalogsTO>> entity =
                new GenericEntity<List<CatalogsTO>>(catalogsTOList) {};
    	return Response.ok().entity(entity).build();
    }*/
    
  
    
     @GET
     @Produces("application/json")
     @Path("/log")
     public Response getUser(@Context UriInfo uiu) {
     	
     	MultivaluedMap<String , String> queryParams= uiu.getQueryParameters();
     	String user = queryParams.getFirst("log");
     	String password = queryParams.getFirst("pass");
     	Boolean userCompair = catalogFacadeEJB.getUser(user, password);
     	
     	return Response.ok().entity(userCompair.toString()).build();
     }  

}
