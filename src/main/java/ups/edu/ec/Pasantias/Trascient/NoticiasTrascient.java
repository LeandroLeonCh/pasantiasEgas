package ups.edu.ec.Pasantias.Trascient;

import java.util.Date;

import ups.edu.ec.Pasantias.modelo.*;

public class NoticiasTrascient {
	
	private int idNoticia;
	private Date fechaNoticia;
	private String tituloNoticia;
	private String contenidoNoticia;
	private String categoriaNoticia;
	private UsuarioModelo usuario;
	public int getIdNoticia() {
		return idNoticia;
	}
	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}
	public Date getFechaNoticia() {
		return fechaNoticia;
	}
	public void setFechaNoticia(Date fechaNoticia) {
		this.fechaNoticia = fechaNoticia;
	}
	public String getTituloNoticia() {
		return tituloNoticia;
	}
	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}
	public String getContenidoNoticia() {
		return contenidoNoticia;
	}
	public void setContenidoNoticia(String contenidoNoticia) {
		this.contenidoNoticia = contenidoNoticia;
	}
	public String getCategoriaNoticia() {
		return categoriaNoticia;
	}
	public void setCategoriaNoticia(String categoriaNoticia) {
		this.categoriaNoticia = categoriaNoticia;
	}
	public UsuarioModelo getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModelo usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "NoticiasTrascient [idNoticia=" + idNoticia + ", fechaNoticia=" + fechaNoticia + ", tituloNoticia="
				+ tituloNoticia + ", contenidoNoticia=" + contenidoNoticia + ", categoriaNoticia=" + categoriaNoticia
				+ ", usuario=" + usuario + "]";
	}
	
	
}
