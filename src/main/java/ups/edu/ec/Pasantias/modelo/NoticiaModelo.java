package ups.edu.ec.Pasantias.modelo;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Noticias")
public class NoticiaModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_noticia")
	private int id;
	
	@Column(name = "fecha_noticia")
	private Date fecha;
	
	@Column (name = "titulo_noticia")
	private String titulo;
	
	@Column (name = "contenido_noticia")
	private String contenido;
	
	@Column (name ="categoria_noticia")
	private String categoria;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private UsuarioModelo usuario;

	public UsuarioModelo getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModelo usuario) {
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	

}
