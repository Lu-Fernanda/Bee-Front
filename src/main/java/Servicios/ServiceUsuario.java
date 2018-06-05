
package Servicios;

import Facade.FacadeBilletera;
import ModeloDTO.*;
import Facade.FacadeUsuario;
import edu.sergioarboleda.rumbacoin.Billetera;
import edu.sergioarboleda.rumbacoin.Usuario;
import exception.ConexionException;
import genericDao.MetodosAleatorios;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
public class ServiceUsuario {
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UsuarioDTO registroUsuario(UsuarioDTO usu) throws ConexionException {
        
        FacadeUsuario facade =  new FacadeUsuario();
        FacadeBilletera facadeB= new FacadeBilletera();
        UsuarioDTO dto = null;
        BilleteraDTO bdto=null;
        MetodosAleatorios met= new MetodosAleatorios();
        
        Billetera billJPA=new Billetera();
        billJPA.setId(met.NumerosAleatorios());
        billJPA.setDinero(met.NumerosAleatorios());
        facadeB.save(billJPA);
        
        Usuario usuJPA = new Usuario();
        usuJPA.setId(usu.getId());
        usuJPA.setNombre(usu.getNombre());
        usuJPA.setIdBilletera(billJPA);
        facade.save(usuJPA);

        return dto;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<UsuarioDTO> getUsuario_JSON() throws ConexionException {
        List<UsuarioDTO> usuDTO = new ArrayList<UsuarioDTO>();
        FacadeUsuario facade = null;

        facade = new FacadeUsuario();
        List<Usuario> usuarios = facade.findAll();
        
        for (Usuario usu : usuarios) {
            UsuarioDTO dto = new UsuarioDTO();
            dto.setId(usu.getId());
            dto.setNombre(usu.getNombre());
            dto.setBill(new BilleteraDTO(usu.getIdBilletera()));
            usuDTO.add(dto);
        }

        return usuDTO;
    }

    
    @GET
    @Path("/{cc}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UsuarioDTO getEmployee(@PathParam("cc") String cc) throws ConexionException {
        FacadeUsuario facade = null;
        UsuarioDTO dto = null;

        facade = new FacadeUsuario();
        Usuario usu = facade.get(Integer.parseInt(cc));
        dto = new UsuarioDTO();
        dto.setId(usu.getId());
        dto.setNombre(usu.getNombre());
        dto.setBill(new BilleteraDTO(usu.getIdBilletera()));
            
        return dto;
    }
    
   
}
