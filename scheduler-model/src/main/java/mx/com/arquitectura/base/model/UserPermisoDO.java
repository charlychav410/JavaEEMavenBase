package mx.com.arquitectura.base.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="C_PERMISOS")
public class UserPermisoDO {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ID_PERMISO")
	    private int idPermiso;
	    
	    @Column(name = "TIPO_PERMISO")
	    private String tipoPermiso;
	    
	    @Column(name = "PERMISO")
	    private String permiso;

		public int getIdPermiso() {
			return idPermiso;
		}

		public void setIdPermiso(int i) {
			this.idPermiso = i;
		}

		public String getTipoPermiso() {
			return tipoPermiso;
		}

		public void setTipoPermiso(String tipoPermiso) {
			this.tipoPermiso = tipoPermiso;
		}

		public String getPermiso() {
			return permiso;
		}

		public void setPermiso(String permiso) {
			this.permiso = permiso;
		}
	    
	    

}
