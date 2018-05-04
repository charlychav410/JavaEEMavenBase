package mx.com.cinepolis.scheduler.service;

import java.util.List;
import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;

public interface CatalogService {
	   
			     
			    UserTO getUser();
			    
			    /**
			     * Retorna la lista de estados de un pais
			     * @param pais acepta un pais como String
			     * @return Lista de estados
			     */
			    List<CatalogsTO> getEstados(String pais);
			    
			    
			    /**
			     * 
			     * Retrorna la lista de los usuarios de la bd
			     * @return Lista de usuarios
			     */
			    
			    List<UserTO>getAllUsers();
			    
			    List<CatalogsTO> getLogin(String login);

}
