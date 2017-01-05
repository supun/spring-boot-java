/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "safetyoutstanding")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetyoutstanding.findAll", query = "SELECT s FROM Safetyoutstanding s")
    , @NamedQuery(name = "Safetyoutstanding.findById", query = "SELECT s FROM Safetyoutstanding s WHERE s.id = :id")
    , @NamedQuery(name = "Safetyoutstanding.findByOutstandingitems", query = "SELECT s FROM Safetyoutstanding s WHERE s.outstandingitems = :outstandingitems")
    , @NamedQuery(name = "Safetyoutstanding.findByTargetdate", query = "SELECT s FROM Safetyoutstanding s WHERE s.targetdate = :targetdate")})
public class Safetyoutstanding implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "outstandingitems")
    private String outstandingitems;
    @Column(name = "targetdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date targetdate;
    @JoinColumn(name = "ossafid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster ossafid;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetyoutstanding() {
    }

    public Safetyoutstanding(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutstandingitems() {
        return outstandingitems;
    }

    public void setOutstandingitems(String outstandingitems) {
        this.outstandingitems = outstandingitems;
    }

    public Date getTargetdate() {
        return targetdate;
    }

    public void setTargetdate(Date targetdate) {
        this.targetdate = targetdate;
    }

    public Safetymeetingmaster getOssafid() {
        return ossafid;
    }

    public void setOssafid(Safetymeetingmaster ossafid) {
        this.ossafid = ossafid;
    }

    public Safetymeetingmaster getSafid() {
        return safid;
    }

    public void setSafid(Safetymeetingmaster safid) {
        this.safid = safid;
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
        if (!(object instanceof Safetyoutstanding)) {
            return false;
        }
        Safetyoutstanding other = (Safetyoutstanding) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetyoutstanding[ id=" + id + " ]";
    }
    
}
