
package Facade;

import ModeloDTO.UsuarioDTO;
import edu.sergioarboleda.rumbacoin.Billetera;
import exception.ConexionException;
import genericdao.ServiceImpl;
import genericdao.SingletonConnection;
import javax.persistence.EntityManager;

public class FacadeBilletera extends ServiceImpl<Billetera> {
    
     public FacadeBilletera() throws ConexionException {
        super(Billetera.class);
        try{
             EntityManager em = SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
           throw new ConexionException("Problemas en la realizacion de conexion con la base de datos");
        }
    }
}
