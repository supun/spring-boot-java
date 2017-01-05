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
@Table(name = "nearmissinvestigate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmissinvestigate.findAll", query = "SELECT n FROM Nearmissinvestigate n")
    , @NamedQuery(name = "Nearmissinvestigate.findById", query = "SELECT n FROM Nearmissinvestigate n WHERE n.id = :id")
    , @NamedQuery(name = "Nearmissinvestigate.findByProblem", query = "SELECT n FROM Nearmissinvestigate n WHERE n.problem = :problem")
    , @NamedQuery(name = "Nearmissinvestigate.findByDetails", query = "SELECT n FROM Nearmissinvestigate n WHERE n.details = :details")})
public class Nearmissinvestigate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "problem")
    private String problem;
    @Column(name = "details")
    private String details;
    @JoinColumn(name = "nrmid", referencedColumnName = "nrmid")
    @ManyToOne
    private Nearmissmaster nrmid;

    public Nearmissinvestigate() {
    }

    public Nearmissinvestigate(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Nearmissmaster getNrmid() {
        return nrmid;
    }

    public void setNrmid(Nearmissmaster nrmid) {
        this.nrmid = nrmid;
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
        if (!(object instanceof Nearmissinvestigate)) {
            return false;
        }
        Nearmissinvestigate other = (Nearmissinvestigate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmissinvestigate[ id=" + id + " ]";
    }
    
}
