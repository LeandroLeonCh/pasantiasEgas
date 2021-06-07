package ups.edu.ec.Pasantias.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import ups.edu.ec.Pasantias.modelo.*;
@Stateless
public class UsuarioDao {
	@PersistenceContext
	private EntityManager em;
	
	
	public void insertarUsuario(UsuarioModelo usuario) throws Exception {
		em.persist(usuario);
	}

	public void actualizarUsuario(UsuarioModelo usuario) throws Exception {
		em.merge(usuario);
	}
	
	public UsuarioModelo leerLogin(String usuario, String contrasena) {

		try {
			String jpql = "SELECT p FROM UsuarioModelo p WHERE p.usuario  = :usuario  AND p.contrasena = :contrasena";
			TypedQuery<UsuarioModelo> query = em.createQuery(jpql, UsuarioModelo.class);
			query.setParameter("usuario", usuario);
			query.setParameter("contrasena", contrasena);
			UsuarioModelo c = query.getSingleResult();
			return c;
		} catch (NoResultException e) {
			return null;
		}

	}
	
	
	public UsuarioModelo leerUsuariosDosParametros(String nombres, String apellidos) {
		try {
			String jpql = "SELECT p FROM UsuarioModelo p WHERE p.persona.nombres LIKE :nombres AND p.persona.apellidos LIKE :apellidos  ";
			TypedQuery<UsuarioModelo> query = em.createQuery(jpql, UsuarioModelo.class);
			query.setParameter("nombres",  nombres );
			query.setParameter("apellidos",  apellidos );
			UsuarioModelo c = query.getSingleResult();
			return c;
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public UsuarioModelo leerUsuariosPorNombre(String usuario) {
		return em.find(UsuarioModelo.class, usuario);
	}
	
	public List<UsuarioModelo> obtenerListaUsuarios(String nombres) throws Exception {
		
		String jpql = "SELECT p FROM UsuarioModelo p WHERE p.persona.nombres LIKE :nombres OR p.persona.apellidos LIKE :nombres  ";
		TypedQuery<UsuarioModelo> query = em.createQuery(jpql, UsuarioModelo.class);
		query.setParameter("nombres", "%" + nombres + "%");
		return query.getResultList();
	}

	public List<UsuarioModelo> obtenerUsuarios() throws Exception {
		String jpl = "SELECT p FROM UsuarioModelo p ";
		Query q = em.createQuery(jpl, UsuarioModelo.class);

		return q.getResultList();
	}
}
