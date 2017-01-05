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
@Table(name = "rskhazardmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rskhazardmaster.findAll", query = "SELECT r FROM Rskhazardmaster r")
    , @NamedQuery(name = "Rskhazardmaster.findByHazardcode", query = "SELECT r FROM Rskhazardmaster r WHERE r.hazardcode = :hazardcode")
    , @NamedQuery(name = "Rskhazardmaster.findByHazardname", query = "SELECT r FROM Rskhazardmaster r WHERE r.hazardname = :hazardname")
    , @NamedQuery(name = "Rskhazardmaster.findByActiveStatus", query = "SELECT r FROM Rskhazardmaster r WHERE r.activeStatus = :activeStatus")
    , @NamedQuery(name = "Rskhazardmaster.findByCruser", query = "SELECT r FROM Rskhazardmaster r WHERE r.cruser = :cruser")
    , @NamedQuery(name = "Rskhazardmaster.findByCrdate", query = "SELECT r FROM Rskhazardmaster r WHERE r.crdate = :crdate")
    , @NamedQuery(name = "Rskhazardmaster.findByUpduser", query = "SELECT r FROM Rskhazardmaster r WHERE r.upduser = :upduser")
    , @NamedQuery(name = "Rskhazardmaster.findByUpddate", query = "SELECT r FROM Rskhazardmaster r WHERE r.upddate = :upddate")})
public class Rskhazardmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "hazardcode")
    private String hazardcode;
    @Column(name = "hazardname")
    private String hazardname;
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

    public Rskhazardmaster() {
    }

    public Rskhazardmaster(String hazardcode) {
        this.hazardcode = hazardcode;
    }

    public String getHazardcode() {
        return hazardcode;
    }

    public void setHazardcode(String hazardcode) {
        this.hazardcode = hazardcode;
    }

    public String getHazardname() {
        return hazardname;
    }

    public void setHazardname(String hazardname) {
        this.hazardname = hazardname;
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
        hash += (hazardcode != null ? hazardcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rskhazardmaster)) {
            return false;
        }
        Rskhazardmaster other = (Rskhazardmaster) object;
        if ((this.hazardcode == null && other.hazardcode != null) || (this.hazardcode != null && !this.hazardcode.equals(other.hazardcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rskhazardmaster[ hazardcode=" + hazardcode + " ]";
    }
    
}
