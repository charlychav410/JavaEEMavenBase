package mx.com.cinepolis.scheduler.service;

import java.util.List;

import mx.com.cinepolis.scheduler.commons.to.UserSystemTO;

public interface UserSystemService {

	

	List<UserSystemTO> getLoginUsers(String login);
	
	 List<UserSystemTO> getSystemUsers(int idUser);
	
	 void setSystemUsers( UserSystemTO userSystemTO);
	 
	 void deleteSystemUsers(UserSystemTO userSystemTO);
	
	 void changeUsers(UserSystemTO userSystemTO);
	 
	 
}
