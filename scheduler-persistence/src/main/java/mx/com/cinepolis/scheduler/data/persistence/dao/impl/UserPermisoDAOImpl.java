package mx.com.cinepolis.scheduler.data.persistence.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.com.arquitectura.arquitectura.persistence.impl.BaseDAOImpl;
import mx.com.arquitectura.base.model.UserPermisoDO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserPermisoDAO;

public class UserPermisoDAOImpl extends BaseDAOImpl<UserPermisoDO, Long> implements UserPermisoDAO {
	
	 @Override
	    @PersistenceContext
	    public void setEntityManager(EntityManager entityManager) {
	        super.setEntityManager(entityManager);
	    }


}
