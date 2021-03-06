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
@Table(name = "PRODUSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produse.findAll", query = "SELECT p FROM Produse p")
    , @NamedQuery(name = "Produse.findById", query = "SELECT p FROM Produse p WHERE p.id = :id")
    , @NamedQuery(name = "Produse.findByDenumire", query = "SELECT p FROM Produse p WHERE p.denumire = :denumire")
    , @NamedQuery(name = "Produse.findByCodBare", query = "SELECT p FROM Produse p WHERE p.codBare = :codBare")
    , @NamedQuery(name = "Produse.findByPret", query = "SELECT p FROM Produse p WHERE p.pret = :pret")
    , @NamedQuery(name = "Produse.findByIdStoc", query = "SELECT p FROM Produse p WHERE p.idStoc = :idStoc")})
public class Produse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DENUMIRE")
    private String denumire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "COD_BARE")
    private String codBare;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRET")
    private double pret;
    @Column(name = "ID_STOC")
    private Integer idStoc;

    public Produse() {
    }

    public Produse(Integer id) {
        this.id = id;
    }

    public Produse(Integer id, String denumire, String codBare, double pret) {
        this.id = id;
        this.denumire = denumire;
        this.codBare = codBare;
        this.pret = pret;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getCodBare() {
        return codBare;
    }

    public void setCodBare(String codBare) {
        this.codBare = codBare;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Integer getIdStoc() {
        return idStoc;
    }

    public void setIdStoc(Integer idStoc) {
        this.idStoc = idStoc;
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
        if (!(object instanceof Produse)) {
            return false;
        }
        Produse other = (Produse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Produse[ id=" + id + " ]";
    }
    
}
