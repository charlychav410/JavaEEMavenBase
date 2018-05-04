package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.service.CatalogService;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@LocalBean
public class CatalogFacadeEJB {

    @Inject
    CatalogService catalogService;
  	
   

    public UserTO getSimpleUser()
    {
        return catalogService.getUser();
    }
    
    public List<UserTO> getAllUSers(){
    	return catalogService.getAllUsers();
    }
    
    public List<CatalogsTO> getEstadoList(String pais){
    	return catalogService.getEstados(pais);
    }
    
    
    public List <CatalogsTO> getLogin(String login){
    	return catalogService.getLogin(login);
    }
    
  
 
	 

}
