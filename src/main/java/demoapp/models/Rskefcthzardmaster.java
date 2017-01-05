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
@Table(name = "rskefcthzardmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rskefcthzardmaster.findAll", query = "SELECT r FROM Rskefcthzardmaster r")
    , @NamedQuery(name = "Rskefcthzardmaster.findByEffhazardcode", query = "SELECT r FROM Rskefcthzardmaster r WHERE r.effhazardcode = :effhazardcode")
    , @NamedQuery(name = "Rskefcthzardmaster.findByEffectname", query = "SELECT r FROM Rskefcthzardmaster r WHERE r.effectname = :effectname")
    , @NamedQuery(name = "Rskefcthzardmaster.findByActiveStatus", query = "SELECT r FROM Rskefcthzardmaster r WHERE r.activeStatus = :activeStatus")
    , @NamedQuery(name = "Rskefcthzardmaster.findByCruser", query = "SELECT r FROM Rskefcthzardmaster r WHERE r.cruser = :cruser")
    , @NamedQuery(name = "Rskefcthzardmaster.findByCrdate", query = "SELECT r FROM Rskefcthzardmaster r WHERE r.crdate = :crdate")
    , @NamedQuery(name = "Rskefcthzardmaster.findByUpduser", query = "SELECT r FROM Rskefcthzardmaster r WHERE r.upduser = :upduser")
    , @NamedQuery(name = "Rskefcthzardmaster.findByUpddate", query = "SELECT r FROM Rskefcthzardmaster r WHERE r.upddate = :upddate")})
public class Rskefcthzardmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "effhazardcode")
    private String effhazardcode;
    @Column(name = "effectname")
    private String effectname;
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

    public Rskefcthzardmaster() {
    }

    public Rskefcthzardmaster(String effhazardcode) {
        this.effhazardcode = effhazardcode;
    }

    public String getEffhazardcode() {
        return effhazardcode;
    }

    public void setEffhazardcode(String effhazardcode) {
        this.effhazardcode = effhazardcode;
    }

    public String getEffectname() {
        return effectname;
    }

    public void setEffectname(String effectname) {
        this.effectname = effectname;
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
        hash += (effhazardcode != null ? effhazardcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rskefcthzardmaster)) {
            return false;
        }
        Rskefcthzardmaster other = (Rskefcthzardmaster) object;
        if ((this.effhazardcode == null && other.effhazardcode != null) || (this.effhazardcode != null && !this.effhazardcode.equals(other.effhazardcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rskefcthzardmaster[ effhazardcode=" + effhazardcode + " ]";
    }
    
}
