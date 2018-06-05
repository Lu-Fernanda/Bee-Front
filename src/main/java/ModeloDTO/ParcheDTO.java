/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDTO;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import edu.sergioarboleda.rumbacoin.Parche;
import edu.sergioarboleda.rumbacoin.Usuario;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */

@XmlRootElement(name = "Parche")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParcheDTO {
    
    private int id;
    private String pswd;
    private String nombre;
    private String descripcion;
    private int valorObjetivo;
    private int valorMinimo;
    private boolean estado;
    private UsuarioDTO idUsuario;

    public ParcheDTO() {
    }

    public ParcheDTO(Parche par) {
        this.id = par.getId();
        this.pswd = par.getPswd();
        this.nombre = par.getNombre();
        this.descripcion = par.getDescripcion();
        this.valorObjetivo = par.getValorObjetivo();
        this.valorMinimo = par.getValorMinimo();
        this.estado = par.getEstado();
        this.idUsuario=new UsuarioDTO(par.getIdUsuario());
    }
    
    public boolean isEstado() {
        return estado;
    }

    public UsuarioDTO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioDTO idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(int valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
    
    
    
            
    
}
