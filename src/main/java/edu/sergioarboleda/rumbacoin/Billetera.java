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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author root
 */
@Entity
@Table(name = "billetera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billetera.findAll", query = "SELECT b FROM Billetera b"),
    @NamedQuery(name = "Billetera.findById", query = "SELECT b FROM Billetera b WHERE b.id = :id"),
    @NamedQuery(name = "Billetera.findByDinero", query = "SELECT b FROM Billetera b WHERE b.dinero = :dinero")})
public class Billetera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "dinero")
    private Integer dinero;
    @OneToMany(mappedBy = "idBilletera")
    private List<Parche> parcheList;
    @OneToMany(mappedBy = "idBilletera")
    private List<Usuario> usuarioList;

    public Billetera() {
    }

    public Billetera(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    @XmlTransient
    @JsonIgnore
    public List<Parche> getParcheList() {
        return parcheList;
    }

    public void setParcheList(List<Parche> parcheList) {
        this.parcheList = parcheList;
    }

    @XmlTransient
    @JsonIgnore
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
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
        if (!(object instanceof Billetera)) {
            return false;
        }
        Billetera other = (Billetera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sergioarboleda.rumbacoin.Billetera[ id=" + id + " ]";
    }
    
}
