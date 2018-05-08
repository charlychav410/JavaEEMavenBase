package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class UserSystemTO implements Serializable {
	 
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idUser;

	private String user;

	private String name;
		
	private String password;
		
	private int idPermiso;
	

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	
	

}
