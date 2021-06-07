package ups.edu.ec.Pasantias.Trascient;

import java.util.Date;
import java.util.List;

public class UsuarioPersonaTrascient {
	
	private String cedula;
	private String nombres;
	private String apellidos;
	private Date fechaNacimiento;
	private String codigoUsuario;
	private String usuario;
	private String contrasena;
	private String tipoUsuario;
	private String token;
	private int bandera;
	private List<NoticiasTrascient> noticias;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
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
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getBandera() {
		return bandera;
	}
	public void setBandera(int bandera) {
		this.bandera = bandera;
	}
	public List<NoticiasTrascient> getNoticias() {
		return noticias;
	}
	public void setNoticias(List<NoticiasTrascient> noticias) {
		this.noticias = noticias;
	}
	@Override
	public String toString() {
		return "UsuarioPersonaTrascient [cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoUsuario=" + codigoUsuario + ", usuario=" + usuario
				+ ", contrasena=" + contrasena + ", tipoUsuario=" + tipoUsuario + ", token=" + token + ", bandera="
				+ bandera + ", noticias=" + noticias + "]";
	}
	

}
