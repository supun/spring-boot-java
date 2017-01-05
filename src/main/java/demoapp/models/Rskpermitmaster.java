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
@Table(name = "rskpermitmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rskpermitmaster.findAll", query = "SELECT r FROM Rskpermitmaster r")
    , @NamedQuery(name = "Rskpermitmaster.findByPermitcode", query = "SELECT r FROM Rskpermitmaster r WHERE r.permitcode = :permitcode")
    , @NamedQuery(name = "Rskpermitmaster.findByPermitname", query = "SELECT r FROM Rskpermitmaster r WHERE r.permitname = :permitname")
    , @NamedQuery(name = "Rskpermitmaster.findByActiveStatus", query = "SELECT r FROM Rskpermitmaster r WHERE r.activeStatus = :activeStatus")
    , @NamedQuery(name = "Rskpermitmaster.findByCruser", query = "SELECT r FROM Rskpermitmaster r WHERE r.cruser = :cruser")
    , @NamedQuery(name = "Rskpermitmaster.findByCrdate", query = "SELECT r FROM Rskpermitmaster r WHERE r.crdate = :crdate")
    , @NamedQuery(name = "Rskpermitmaster.findByUpduser", query = "SELECT r FROM Rskpermitmaster r WHERE r.upduser = :upduser")
    , @NamedQuery(name = "Rskpermitmaster.findByUpddate", query = "SELECT r FROM Rskpermitmaster r WHERE r.upddate = :upddate")})
public class Rskpermitmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "permitcode")
    private String permitcode;
    @Column(name = "permitname")
    private String permitname;
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

    public Rskpermitmaster() {
    }

    public Rskpermitmaster(String permitcode) {
        this.permitcode = permitcode;
    }

    public String getPermitcode() {
        return permitcode;
    }

    public void setPermitcode(String permitcode) {
        this.permitcode = permitcode;
    }

    public String getPermitname() {
        return permitname;
    }

    public void setPermitname(String permitname) {
        this.permitname = permitname;
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
        hash += (permitcode != null ? permitcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rskpermitmaster)) {
            return false;
        }
        Rskpermitmaster other = (Rskpermitmaster) object;
        if ((this.permitcode == null && other.permitcode != null) || (this.permitcode != null && !this.permitcode.equals(other.permitcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rskpermitmaster[ permitcode=" + permitcode + " ]";
    }
    
}
