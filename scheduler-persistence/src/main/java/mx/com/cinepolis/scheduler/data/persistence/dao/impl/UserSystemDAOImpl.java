package mx.com.cinepolis.scheduler.data.persistence.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.com.arquitectura.arquitectura.persistence.impl.BaseDAOImpl;
import mx.com.arquitectura.base.model.UserSystemDO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserSystemDAO;

public class UserSystemDAOImpl extends BaseDAOImpl<UserSystemDO, Long> implements UserSystemDAO{
	
	 @Override
	    @PersistenceContext
	    public void setEntityManager(EntityManager entityManager) {
	        super.setEntityManager(entityManager);
	    }


}
