/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDTO;

import edu.sergioarboleda.rumbacoin.Billetera;
import edu.sergioarboleda.rumbacoin.Usuario;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */

@XmlRootElement(name = "Usuario")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsuarioDTO {
    
    private int id;
    private BilleteraDTO bill;
    private String nombre;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Usuario usu) {
        this.id = usu.getId();
        this.bill = new BilleteraDTO(usu.getIdBilletera());
        this.nombre = usu.getNombre();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   

    public BilleteraDTO getBill() {
        return bill;
    }

    public void setBill(BilleteraDTO bill) {
        this.bill = bill;
    }
}

   
