package mx.com.arquitectura.base.model;

import javax.persistence.*;

@Entity
@Table(name ="K_USER")
public class UserSystemDO {
	 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_USER")
    private Long idUser;
    
    @Column(name = "USUARIO")
    private String user;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "PWD")
    private String 	password;
    
    @Column(name = "ID_PERMISO")
    private int permiso;

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPermiso() {
		return permiso;
	}

	public void setPermiso(int permiso) {
		this.permiso = permiso;
	}
    
    

}
