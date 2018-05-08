package mx.com.cinepolis.scheduler.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import mx.com.arquitectura.base.model.UserPermisoDO;
import mx.com.arquitectura.base.model.UserSystemDO;
import mx.com.cinepolis.scheduler.commons.to.UserPermisoTO;
import mx.com.cinepolis.scheduler.commons.to.UserSystemTO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserPermisoDAO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserSystemDAO;
import mx.com.cinepolis.scheduler.service.UserSystemService;

public class UserSystemServiceImpl implements UserSystemService {
	
	@Inject
	private UserSystemDAO userSystemDAO;
	
	@Inject
	private UserPermisoDAO userPermisoDAO;

	
	@Override
	public List<UserSystemTO> getLoginUsers(String login) {
		
		
		List<UserSystemDO> userSystemDOList= userSystemDAO.findByColumn("USER", UserSystemDO.class ,login );
		
		return userSystemDOList.
			stream().
			map(x-> new UserSystemTO(){{
			 setUser(x.getUser());
			 setPassword(x.getPassword());
			}}
			).collect(Collectors.toList());
	}

	@Override
	public List<UserSystemTO> getSystemUsers(int idUser) {
		return null;
	}

	@Override
	public void setSystemUsers(UserSystemTO userSystemTO) {
		
		UserSystemDO userSystemDO = new UserSystemDO();
	       userSystemDO.setUser(userSystemTO.getUser());
	       userSystemDO.setNombre(userSystemTO.getName());
	       userSystemDO.setPassword(userSystemTO.getPassword());
	       userSystemDO.setPassword(userSystemTO.getPassword());
	       userSystemDO.setPermiso(userSystemTO.getIdPermiso());
	       
	       userSystemDAO.create(userSystemDO);
	       
	       UserPermisoTO userPermisoTO = new UserPermisoTO();
	       
	    UserPermisoDO userPermisoDO = new UserPermisoDO();
	       userPermisoDO.setIdPermiso(userSystemTO.getIdPermiso());
	       userPermisoDO.setTipoPermiso(userPermisoTO.getPermiso());
	       if(userPermisoTO.getPermiso().equals("Invitado")) {
	    	   userPermisoDO.setPermiso("{\"Alta\":\"true\",\"Baja\":\"false\",\\\"Modificar\\\":\\\"false\\\"}");
	    		}
	       if(userPermisoTO.getPermiso().equals("Director")) {
	    	   userPermisoDO.setPermiso("{\"Alta\":\"true\",\"Baja\":\"true\",\\\"Modificar\\\":\\\"false\\\"}");
	    		}
	       if(userPermisoTO.getPermiso().equals("Administrador")) {
	    	   userPermisoDO.setPermiso("{\"Alta\":\"true\",\"Baja\":\"true\",\\\"Modificar\\\":\\\"true\\\"}");
	    		}
	       userPermisoDAO.create(userPermisoDO); 
	}
	
	@Override
	public void deleteSystemUsers(UserSystemTO userSystemTO) {
		userSystemDAO.delete(userSystemTO.getIdUser());		
	}
	

	@Override
	public void changeUsers(UserSystemTO userSystemTO) {
		UserSystemDO userSystemDO = new UserSystemDO();
	       userSystemDO.setNombre(userSystemTO.getName());
	       userSystemDO.setPassword(userSystemTO.getPassword());
	       userSystemDO.setPassword(userSystemTO.getPassword());
	       userSystemDO.setPermiso(userSystemTO.getIdPermiso());
	       userSystemDAO.update(userSystemDO);
	       
	       UserPermisoTO userPermisoTO = new UserPermisoTO();

	       
	    UserPermisoDO userPermisoDO = new UserPermisoDO();
	       userPermisoDO.setIdPermiso(userSystemTO.getIdPermiso());
	       userPermisoDO.setTipoPermiso(userPermisoTO.getPermiso());
	       if(userPermisoTO.getPermiso().equals("Invitado")) {
	    	   userPermisoDO.setPermiso("{\"Alta\":\"true\",\"Baja\":\"false\",\\\"Modificar\\\":\\\"false\\\"}");
	    		}
	       if(userPermisoTO.getPermiso().equals("Director")) {
	    	   userPermisoDO.setPermiso("{\"Alta\":\"true\",\"Baja\":\"true\",\\\"Modificar\\\":\\\"false\\\"}");
	    		}
	       if(userPermisoTO.getPermiso().equals("Administrador")) {
	    	   userPermisoDO.setPermiso("{\"Alta\":\"true\",\"Baja\":\"true\",\\\"Modificar\\\":\\\"true\\\"}");
	    		}
	       userPermisoDAO.update(userPermisoDO);
	}



}
