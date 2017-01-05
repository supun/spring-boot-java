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
@Table(name = "nearmissmatrix")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmissmatrix.findAll", query = "SELECT n FROM Nearmissmatrix n")
    , @NamedQuery(name = "Nearmissmatrix.findById", query = "SELECT n FROM Nearmissmatrix n WHERE n.id = :id")
    , @NamedQuery(name = "Nearmissmatrix.findByRiskfrom", query = "SELECT n FROM Nearmissmatrix n WHERE n.riskfrom = :riskfrom")
    , @NamedQuery(name = "Nearmissmatrix.findByRiskfactor", query = "SELECT n FROM Nearmissmatrix n WHERE n.riskfactor = :riskfactor")
    , @NamedQuery(name = "Nearmissmatrix.findByConsequence", query = "SELECT n FROM Nearmissmatrix n WHERE n.consequence = :consequence")
    , @NamedQuery(name = "Nearmissmatrix.findByProbablilty", query = "SELECT n FROM Nearmissmatrix n WHERE n.probablilty = :probablilty")
    , @NamedQuery(name = "Nearmissmatrix.findByPotentialrisk", query = "SELECT n FROM Nearmissmatrix n WHERE n.potentialrisk = :potentialrisk")})
public class Nearmissmatrix implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "riskfrom")
    private String riskfrom;
    @Column(name = "riskfactor")
    private String riskfactor;
    @Column(name = "consequence")
    private Integer consequence;
    @Column(name = "probablilty")
    private Integer probablilty;
    @Column(name = "potentialrisk")
    private String potentialrisk;
    @JoinColumn(name = "nrmid", referencedColumnName = "nrmid")
    @ManyToOne
    private Nearmissmaster nrmid;

    public Nearmissmatrix() {
    }

    public Nearmissmatrix(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRiskfrom() {
        return riskfrom;
    }

    public void setRiskfrom(String riskfrom) {
        this.riskfrom = riskfrom;
    }

    public String getRiskfactor() {
        return riskfactor;
    }

    public void setRiskfactor(String riskfactor) {
        this.riskfactor = riskfactor;
    }

    public Integer getConsequence() {
        return consequence;
    }

    public void setConsequence(Integer consequence) {
        this.consequence = consequence;
    }

    public Integer getProbablilty() {
        return probablilty;
    }

    public void setProbablilty(Integer probablilty) {
        this.probablilty = probablilty;
    }

    public String getPotentialrisk() {
        return potentialrisk;
    }

    public void setPotentialrisk(String potentialrisk) {
        this.potentialrisk = potentialrisk;
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
        if (!(object instanceof Nearmissmatrix)) {
            return false;
        }
        Nearmissmatrix other = (Nearmissmatrix) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmissmatrix[ id=" + id + " ]";
    }
    
}
