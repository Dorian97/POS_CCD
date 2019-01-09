/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Clara
 */
@Entity
@Table(name = "ROL_USERI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolUseri.findAll", query = "SELECT r FROM RolUseri r")
    , @NamedQuery(name = "RolUseri.findById", query = "SELECT r FROM RolUseri r WHERE r.id = :id")
    , @NamedQuery(name = "RolUseri.findByRol", query = "SELECT r FROM RolUseri r WHERE r.rol = :rol")})
public class RolUseri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ROL")
    private String rol;

    public RolUseri() {
    }

    public RolUseri(Integer id) {
        this.id = id;
    }

    public RolUseri(Integer id, String rol) {
        this.id = id;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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
        if (!(object instanceof RolUseri)) {
            return false;
        }
        RolUseri other = (RolUseri) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RolUseri[ id=" + id + " ]";
    }
    
}
