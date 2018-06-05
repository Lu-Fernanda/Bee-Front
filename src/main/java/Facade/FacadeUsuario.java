
package Facade;

import exception.ConexionException;
import genericdao.ServiceImpl;
import genericdao.SingletonConnection;
import javax.persistence.EntityManager;
import edu.sergioarboleda.rumbacoin.*;

public class FacadeUsuario extends ServiceImpl<Usuario> {
    
     public FacadeUsuario() throws ConexionException {
        super(Usuario.class);
        try{
             EntityManager em = SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
           throw new ConexionException("Problemas en la realizacion de conexion con la base de datos");
        }
    }
}
