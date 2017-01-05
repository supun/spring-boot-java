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
@Table(name = "formstatusmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formstatusmaster.findAll", query = "SELECT f FROM Formstatusmaster f")
    , @NamedQuery(name = "Formstatusmaster.findByStatuscode", query = "SELECT f FROM Formstatusmaster f WHERE f.statuscode = :statuscode")
    , @NamedQuery(name = "Formstatusmaster.findByStatusdesc", query = "SELECT f FROM Formstatusmaster f WHERE f.statusdesc = :statusdesc")
    , @NamedQuery(name = "Formstatusmaster.findByCruser", query = "SELECT f FROM Formstatusmaster f WHERE f.cruser = :cruser")
    , @NamedQuery(name = "Formstatusmaster.findByCrdate", query = "SELECT f FROM Formstatusmaster f WHERE f.crdate = :crdate")
    , @NamedQuery(name = "Formstatusmaster.findByUpduser", query = "SELECT f FROM Formstatusmaster f WHERE f.upduser = :upduser")
    , @NamedQuery(name = "Formstatusmaster.findByUpddate", query = "SELECT f FROM Formstatusmaster f WHERE f.upddate = :upddate")})
public class Formstatusmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "statuscode")
    private String statuscode;
    @Column(name = "statusdesc")
    private String statusdesc;
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

    public Formstatusmaster() {
    }

    public Formstatusmaster(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc;
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
        hash += (statuscode != null ? statuscode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formstatusmaster)) {
            return false;
        }
        Formstatusmaster other = (Formstatusmaster) object;
        if ((this.statuscode == null && other.statuscode != null) || (this.statuscode != null && !this.statuscode.equals(other.statuscode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Formstatusmaster[ statuscode=" + statuscode + " ]";
    }
    
}
