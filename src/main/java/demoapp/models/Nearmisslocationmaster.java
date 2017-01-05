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
import javax.persistence.Id;
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
@Table(name = "nearmisslocationmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmisslocationmaster.findAll", query = "SELECT n FROM Nearmisslocationmaster n")
    , @NamedQuery(name = "Nearmisslocationmaster.findByLoccode", query = "SELECT n FROM Nearmisslocationmaster n WHERE n.loccode = :loccode")
    , @NamedQuery(name = "Nearmisslocationmaster.findByLocname", query = "SELECT n FROM Nearmisslocationmaster n WHERE n.locname = :locname")
    , @NamedQuery(name = "Nearmisslocationmaster.findByActiveStatus", query = "SELECT n FROM Nearmisslocationmaster n WHERE n.activeStatus = :activeStatus")
    , @NamedQuery(name = "Nearmisslocationmaster.findByCruser", query = "SELECT n FROM Nearmisslocationmaster n WHERE n.cruser = :cruser")
    , @NamedQuery(name = "Nearmisslocationmaster.findByCrdate", query = "SELECT n FROM Nearmisslocationmaster n WHERE n.crdate = :crdate")
    , @NamedQuery(name = "Nearmisslocationmaster.findByUpduser", query = "SELECT n FROM Nearmisslocationmaster n WHERE n.upduser = :upduser")
    , @NamedQuery(name = "Nearmisslocationmaster.findByUpddate", query = "SELECT n FROM Nearmisslocationmaster n WHERE n.upddate = :upddate")})
public class Nearmisslocationmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "loccode")
    private String loccode;
    @Column(name = "locname")
    private String locname;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "cruser")
    private String cruser;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "upduser")
    private String upduser;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;

    public Nearmisslocationmaster() {
    }

    public Nearmisslocationmaster(String loccode) {
        this.loccode = loccode;
    }

    public String getLoccode() {
        return loccode;
    }

    public void setLoccode(String loccode) {
        this.loccode = loccode;
    }

    public String getLocname() {
        return locname;
    }

    public void setLocname(String locname) {
        this.locname = locname;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getCruser() {
        return cruser;
    }

    public void setCruser(String cruser) {
        this.cruser = cruser;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public String getUpduser() {
        return upduser;
    }

    public void setUpduser(String upduser) {
        this.upduser = upduser;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loccode != null ? loccode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nearmisslocationmaster)) {
            return false;
        }
        Nearmisslocationmaster other = (Nearmisslocationmaster) object;
        if ((this.loccode == null && other.loccode != null) || (this.loccode != null && !this.loccode.equals(other.loccode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmisslocationmaster[ loccode=" + loccode + " ]";
    }
    
}
