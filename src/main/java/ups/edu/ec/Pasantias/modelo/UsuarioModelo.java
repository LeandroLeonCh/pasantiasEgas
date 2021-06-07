package ups.edu.ec.Pasantias.modelo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Usuario")
public class UsuarioModelo {
	
	@Id
	@Column(name = "codigo_usuario")
	private String codigo;
	
	@Column(name = "nombre_usuario")
	private String usuario;
	
	@Column(name = "contrasena_usuario")
	private String contrasena;
	
	@Column (name = "bandera_usuario")
	private int bandera;
	
	@Column(name = "tipo_usuario")
	private String tipoUsuario;
	
	@Column(name = "token_usuario")
	private String token;
	

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "persona_prs_cedula")
	private PersonaModelo persona;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_noticia")
	private List<NoticiaModelo> noticias;

	
	
	public List<NoticiaModelo> getNoticias() {
		return noticias;
	}

	public void setNoticias(List<NoticiaModelo> noticias) {
		this.noticias = noticias;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getBandera() {
		return bandera;
	}

	public void setBandera(int bandera) {
		this.bandera = bandera;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public PersonaModelo getPersona() {
		return persona;
	}

	public void setPersona(PersonaModelo persona) {
		this.persona = persona;
	}
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
	

}
