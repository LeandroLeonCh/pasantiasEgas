package ups.edu.ec.Pasantias.servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ups.edu.ec.Pasantias.Trascient.LoginTrasient;
import ups.edu.ec.Pasantias.Trascient.UsuarioPersonaTrascient;
import ups.edu.ec.Pasantias.Trascient.ejemploTra;
import ups.edu.ec.Pasantias.on.PersonaOn;


@Path("/pasantiaServicios")
public class ServiciosRest {
	

	@Inject
	private PersonaOn persona;
	
	@GET
	@Path("devolver/")
	public Response sayHello() {
		return Response.ok("Hello world", MediaType.APPLICATION_JSON).build();
	}

	
	
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/crear")
	public LoginTrasient insertarDoctor(UsuarioPersonaTrascient dpt) throws Exception {
		System.out.println("llegue");
		System.out.println(dpt.getCedula());
	
		try {
			return persona.insertarUsuario(dpt);
			// "Ingresado correctamente";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Error: " + e.getMessage());
		}

	}
	
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path ("/probando")
	public ejemploTra ejemplo(ejemploTra dpt) throws Exception {
		System.out.println("llegue al servicio ejemplo");
		System.out.println(dpt.getNombre());
	
		return dpt;

	}
}
