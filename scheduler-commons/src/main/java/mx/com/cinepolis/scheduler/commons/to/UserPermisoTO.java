package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class UserPermisoTO implements Serializable{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idPermiso;

	private String tipoPermiso;

	private String Permiso;
	


	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public String getTipoPermiso() {
		return tipoPermiso;
	}

	public void setTipoPermiso(String tipoPermiso) {
		this.tipoPermiso = tipoPermiso;
	}

	public String getPermiso() {
		return Permiso;
	}

	public void setPermiso(String permiso) {
		Permiso = permiso;
	}
	
	

}
