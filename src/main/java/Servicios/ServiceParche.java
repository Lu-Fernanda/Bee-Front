
package Servicios;

import Facade.FacadeBilletera;
import Facade.FacadeParche;
import ModeloDTO.*;
import Facade.FacadeUsuario;
import edu.sergioarboleda.rumbacoin.Billetera;
import edu.sergioarboleda.rumbacoin.Parche;
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

@Path("/parche")
public class ServiceParche{
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ParcheDTO registroParche(ParcheDTO p) throws ConexionException {
        
        FacadeParche facade =  new FacadeParche();
        FacadeUsuario facadeU= new FacadeUsuario();
        FacadeBilletera facadeB= new FacadeBilletera();
        
        UsuarioDTO dto = null;
        ParcheDTO pdto=null;
        BilleteraDTO bdto=null;
        MetodosAleatorios met= new MetodosAleatorios();
          
        Billetera billJPA=new Billetera();
        billJPA.setId(met.NumerosAleatorios());
        billJPA.setDinero(met.NumerosAleatorios());
        facadeB.save(billJPA);
        
        Parche parJPA= new Parche();
        
        parJPA.setPswd(met.generateString());
        parJPA.setNombre(p.getNombre());
        parJPA.setDescripcion(p.getDescripcion());
        parJPA.setValorObjetivo(p.getValorObjetivo());
        parJPA.setValorMinimo(p.getValorMinimo());
      
        
        facade.save(parJPA);
        
        return pdto;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<ParcheDTO> getParche_JSON() throws ConexionException {
        List<ParcheDTO> pDTO = new ArrayList<ParcheDTO>();
        FacadeParche facade = null;

        facade = new FacadeParche();
        List<Parche> parches = facade.findAll();
        
        for (Parche par : parches) {
            ParcheDTO dto = new ParcheDTO(par);
            pDTO.add(dto);
        }

        return pDTO;
    }

    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ParcheDTO getParche(@PathParam("id") String id) throws ConexionException {
        FacadeParche facade = null;
        ParcheDTO dto = null;

        facade = new FacadeParche();
        Parche par = facade.get(Integer.parseInt(id));
        dto = new ParcheDTO(par);

        return dto;
    }
    
   
}
