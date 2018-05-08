package mx.com.cinepolis.scheduler.facade;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.cinepolis.scheduler.commons.to.UserSystemTO;
import mx.com.cinepolis.scheduler.service.UserSystemService;

@Stateless
@LocalBean
public class UserSystemFacadeEJB {
	
	 @Inject
	    UserSystemService userSystemService;
	 	
	  	
	
	 public List<UserSystemTO> getLoginUsers(String login){
    	return userSystemService.getLoginUsers(login);
    }
	 
	public void setSystemUsers(UserSystemTO userSystemTO){		
	    }
		
	
	public void deleteSystemUsers(UserSystemTO userSystemTO){
    }
	
	
	public void changeUsers(UserSystemTO userSystemTO){
		
    }
	
	
}
