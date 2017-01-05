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
@Table(name = "controltypemaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Controltypemaster.findAll", query = "SELECT c FROM Controltypemaster c")
    , @NamedQuery(name = "Controltypemaster.findByCnttypecode", query = "SELECT c FROM Controltypemaster c WHERE c.cnttypecode = :cnttypecode")
    , @NamedQuery(name = "Controltypemaster.findByCnttypename", query = "SELECT c FROM Controltypemaster c WHERE c.cnttypename = :cnttypename")
    , @NamedQuery(name = "Controltypemaster.findByActiveStatus", query = "SELECT c FROM Controltypemaster c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Controltypemaster.findByCruser", query = "SELECT c FROM Controltypemaster c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Controltypemaster.findByCrdate", query = "SELECT c FROM Controltypemaster c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Controltypemaster.findByUpduser", query = "SELECT c FROM Controltypemaster c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Controltypemaster.findByUpddate", query = "SELECT c FROM Controltypemaster c WHERE c.upddate = :upddate")})
public class Controltypemaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cnttypecode")
    private String cnttypecode;
    @Column(name = "cnttypename")
    private String cnttypename;
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

    public Controltypemaster() {
    }

    public Controltypemaster(String cnttypecode) {
        this.cnttypecode = cnttypecode;
    }

    public String getCnttypecode() {
        return cnttypecode;
    }

    public void setCnttypecode(String cnttypecode) {
        this.cnttypecode = cnttypecode;
    }

    public String getCnttypename() {
        return cnttypename;
    }

    public void setCnttypename(String cnttypename) {
        this.cnttypename = cnttypename;
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
        hash += (cnttypecode != null ? cnttypecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controltypemaster)) {
            return false;
        }
        Controltypemaster other = (Controltypemaster) object;
        if ((this.cnttypecode == null && other.cnttypecode != null) || (this.cnttypecode != null && !this.cnttypecode.equals(other.cnttypecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Controltypemaster[ cnttypecode=" + cnttypecode + " ]";
    }
    
}
