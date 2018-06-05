/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sergioarboleda.rumbacoin;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author root
 */
@Entity
@Table(name = "parche")
public class Parche implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 35)
    @Column(name = "pswd")
    private String pswd;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "valorObjetivo")
    private Integer valorObjetivo;
    @Column(name = "valorMinimo")
    private Integer valorMinimo;
    @Column(name = "estado")
    private Boolean estado;
    @OneToMany(mappedBy = "idParche")
    private List<Transferencia> transferenciaList;
    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "idBilletera", referencedColumnName = "id")
    @ManyToOne
    private Billetera idBilletera;

    public Parche() {
    }

    public Parche(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
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

    public Integer getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(Integer valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public Integer getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Integer valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @XmlTransient
    @JsonIgnore
    public List<Transferencia> getTransferenciaList() {
        return transferenciaList;
    }

    public void setTransferenciaList(List<Transferencia> transferenciaList) {
        this.transferenciaList = transferenciaList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Billetera getIdBilletera() {
        return idBilletera;
    }

    public void setIdBilletera(Billetera idBilletera) {
        this.idBilletera = idBilletera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parche)) {
            return false;
        }
        Parche other = (Parche) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sergioarboleda.rumbacoin.Parche[ id=" + id + " ]";
    }
    
}
