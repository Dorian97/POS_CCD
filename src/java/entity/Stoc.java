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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Clara
 */
@Entity
@Table(name = "STOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stoc.findAll", query = "SELECT s FROM Stoc s")
    , @NamedQuery(name = "Stoc.findById", query = "SELECT s FROM Stoc s WHERE s.id = :id")
    , @NamedQuery(name = "Stoc.findByStoc", query = "SELECT s FROM Stoc s WHERE s.stoc = :stoc")})
public class Stoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOC")
    private int stoc;

    public Stoc() {
    }

    public Stoc(Integer id) {
        this.id = id;
    }

    public Stoc(Integer id, int stoc) {
        this.id = id;
        this.stoc = stoc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
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
        if (!(object instanceof Stoc)) {
            return false;
        }
        Stoc other = (Stoc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Stoc[ id=" + id + " ]";
    }
    
}
