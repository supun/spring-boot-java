/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "componentdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Componentdetails.findAll", query = "SELECT c FROM Componentdetails c")
    , @NamedQuery(name = "Componentdetails.findById", query = "SELECT c FROM Componentdetails c WHERE c.id = :id")})
public class Componentdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "compcode", referencedColumnName = "compcode")
    @ManyToOne
    private Componentcreation compcode;
    @JoinColumn(name = "mdlcode", referencedColumnName = "mdlcode")
    @ManyToOne
    private Modulecreation mdlcode;

    public Componentdetails() {
    }

    public Componentdetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Componentcreation getCompcode() {
        return compcode;
    }

    public void setCompcode(Componentcreation compcode) {
        this.compcode = compcode;
    }

    public Modulecreation getMdlcode() {
        return mdlcode;
    }

    public void setMdlcode(Modulecreation mdlcode) {
        this.mdlcode = mdlcode;
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
        if (!(object instanceof Componentdetails)) {
            return false;
        }
        Componentdetails other = (Componentdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Componentdetails[ id=" + id + " ]";
    }
    
}
