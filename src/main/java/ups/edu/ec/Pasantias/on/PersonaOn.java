package ups.edu.ec.Pasantias.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.Pasantias.modelo.*;
import ups.edu.ec.Pasantias.dao.*;
import ups.edu.ec.Pasantias.Trascient.*;


@Stateless
public class PersonaOn {

	
	@Inject
	private PersonaDao personaDao;
	
	@Inject
	private UsuarioDao usuarioDao;
	
	
	public LoginTrasient insertarUsuario(UsuarioPersonaTrascient objeto) throws Exception {
		LoginTrasient login  = new LoginTrasient();
		System.out.println("el usuario recibido es:" +objeto.getUsuario() );

		login.setUser(objeto.getUsuario());
		login.setPassword(objeto.getContrasena());
		if (validarDoctor(objeto)) {
			System.out.println("llegue");
			return login;
			
		} else {
			throw new Exception("Error");
		}

	}
	public boolean validarDoctor(UsuarioPersonaTrascient objeto) throws Exception {

		UsuarioModelo usuario = new UsuarioModelo();
		PersonaModelo persona = new PersonaModelo();

		persona.setCedula(objeto.getCedula());
		persona.setNombres(objeto.getNombres());
		persona.setApellidos(objeto.getApellidos());
		persona.setFechaNacimiento(objeto.getFechaNacimiento());

	
		usuario.setCodigo(objeto.getCodigoUsuario());
		usuario.setUsuario(objeto.getUsuario());
		usuario.setContrasena(objeto.getContrasena());
		usuario.setTipoUsuario(objeto.getTipoUsuario());
		usuario.setToken(objeto.getToken());
		usuario.setBandera(0);
		
		
		

		UsuarioModelo usuarioVerificacion = usuarioDao.leerUsuariosPorNombre(objeto.getCodigoUsuario());
		PersonaModelo personaVerificacion = personaDao.leerPersona(objeto.getCedula());
		
		
		if (personaVerificacion != null) {
			// throw new Exception("La persona con la cédula: "+objeto.+" ya existe!!");
			if (usuarioVerificacion != null) {
				throw new Exception("El doctor persona con el código: " + objeto.getCodigoUsuario() + " ya existe!!");

			} else {
		
				usuarioDao.insertarUsuario(usuario);
				return true;
			}
		} else {
			if (usuarioVerificacion != null) {
				throw new Exception("El doctor con el código: " + objeto.getCodigoUsuario() + " ya existe!!");
			} else {
				personaDao.insertarPersona(persona);
				usuario.setPersona(persona);
				usuarioDao.insertarUsuario(usuario);
				return true;
			}
		}

	}
	
	
	public List<UsuarioModelo> getNombres(String nombres) throws Exception{
		return usuarioDao.obtenerListaUsuarios(nombres);
	}
}
