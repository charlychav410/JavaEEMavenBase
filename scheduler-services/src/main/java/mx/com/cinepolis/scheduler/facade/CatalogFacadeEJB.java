package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.service.CatalogService;
import mx.com.cinepolis.scheduler.service.GitHubService;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@LocalBean
public class CatalogFacadeEJB {

    @Inject
    CatalogService catalogService;
  	
    @Inject
    GitHubService gitHubService;

    public UserTO getSimpleUser()
    {
        return catalogService.getUser();
    }
    
    public List<CatalogsTO> getEstadoList(String pais){
    	return catalogService.getEstados(pais);
    }
    
    
    public List <CatalogsTO> getLogin(String login){
    	return catalogService.getLogin(login);
    }
    
  
    
	public Boolean getUser(String user, String password)
	    {
	       return gitHubService.getUser(user, password);
	    }
	 

}
