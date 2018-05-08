package mx.com.cinepolis.scheduler.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import mx.com.arquitectura.base.model.UserDO;
import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserDAO;
import mx.com.cinepolis.scheduler.service.CatalogService;

public class CatalogServiceImpl implements CatalogService{

	
	@Inject
	private UserDAO userDAO;
    /**
     * {@inheritDoc}
     */
   @Override
    public UserTO getUser() {
        UserTO userTO = new UserTO();
        userTO.setIdUser(1L);
        userTO.setName("Javier");
        userTO.setAvatarUrl("francisco.rodriguez@axity.com.mx");
        userTO.setLogin("jrodriguez");
        return userTO; 
    }
   @Override
   public void setUser(UserTO userTO) {
       
	 
	   UserDO userDO = new UserDO();
       userDO.setName(userTO.getName());
       userDO.setAvatarUrl(userTO.getAvatarUrl());
       userDO.setLogin(userTO.getLogin());
       userDAO.create(userDO);
   
   }
    
    @Override 
    public List<CatalogsTO> getEstados (String pais){
    	List<CatalogsTO> catalogsTOList = new ArrayList<>();
    	if(pais.equals("Mexico")) {
    		catalogsTOList.add(new CatalogsTO() {{
    		setId(1);
    		setName("Puebla");
    		}});
    		catalogsTOList.add(new CatalogsTO() {{
        		setId(2);
        		setName("Tlaxcala");
        		}});
    		catalogsTOList.add(new CatalogsTO() {{
        		setId(3);
        		setName("CDMX");
        		}});
    	}
    		else if(pais.equals("USA")) {
    		catalogsTOList.add(new CatalogsTO() {{
        		setId(1);
        		setName("California");
        		}});
    		catalogsTOList.add(new CatalogsTO() {{
        		setId(2);
        		setName("New York");
        		}});
    		catalogsTOList.add(new CatalogsTO() {{
        		setId(3);
        		setName("Texas");
        		}});
    		
    	}
    	
    	return catalogsTOList;
    }

	@Override
	public List<CatalogsTO> getLogin(String login) {
    	List<CatalogsTO> loginTOList = new ArrayList<>();
    	if(login.equals("charlychav410")) {
    		loginTOList.add(new CatalogsTO() {
			{ 
    		setNames("Carlos Pacheco");
    		setFollowers(2);
    		setFollowings(1);
    	
    		}});
    		}
		
		return loginTOList;
	}



	@Override
	public List<UserTO> getAllUsers() {
		List<UserDO> userDOList= userDAO.findAll();
		
		return userDOList.
			stream().
			map(x-> new UserTO(){{
			 setLogin(x.getLogin());
			 setFollowing(x.getFollowing());
			 setFollower(x.getFollowers());
			 setAvatarUrl(x.getAvatarUrl());
			 setName(x.getName());
			 setIdUser(x.getIdUser());
			 
			}}
			).collect(Collectors.toList());	
	}
	
	@Override
	public List<UserTO> findUsers() {
		List<UserDO> userDOList= userDAO.findAll();
		
		return userDOList.
			stream().
			map(x-> new UserTO(){{
			 setLogin(x.getLogin());
			 setFollowing(x.getFollowing());
			 setFollower(x.getFollowers());
			 setAvatarUrl(x.getAvatarUrl());
			 setName(x.getName());
			 setIdUser(x.getIdUser());
			 
			}}
			).collect(Collectors.toList());	
	}

	@Override
	public List<UserTO> setAllUsers() {

		
		
	List<UserTO> userTOList= new ArrayList<>();
		
		return null;
	}

}