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
@Table(name = "casualfactormaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casualfactormaster.findAll", query = "SELECT c FROM Casualfactormaster c")
    , @NamedQuery(name = "Casualfactormaster.findByRootid", query = "SELECT c FROM Casualfactormaster c WHERE c.rootid = :rootid")
    , @NamedQuery(name = "Casualfactormaster.findByRootcause", query = "SELECT c FROM Casualfactormaster c WHERE c.rootcause = :rootcause")
    , @NamedQuery(name = "Casualfactormaster.findByActiveStatus", query = "SELECT c FROM Casualfactormaster c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Casualfactormaster.findByCruser", query = "SELECT c FROM Casualfactormaster c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Casualfactormaster.findByCrdate", query = "SELECT c FROM Casualfactormaster c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Casualfactormaster.findByUpduser", query = "SELECT c FROM Casualfactormaster c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Casualfactormaster.findByUpddate", query = "SELECT c FROM Casualfactormaster c WHERE c.upddate = :upddate")})
public class Casualfactormaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rootid")
    private String rootid;
    @Column(name = "rootcause")
    private String rootcause;
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

    public Casualfactormaster() {
    }

    public Casualfactormaster(String rootid) {
        this.rootid = rootid;
    }

    public String getRootid() {
        return rootid;
    }

    public void setRootid(String rootid) {
        this.rootid = rootid;
    }

    public String getRootcause() {
        return rootcause;
    }

    public void setRootcause(String rootcause) {
        this.rootcause = rootcause;
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
        hash += (rootid != null ? rootid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casualfactormaster)) {
            return false;
        }
        Casualfactormaster other = (Casualfactormaster) object;
        if ((this.rootid == null && other.rootid != null) || (this.rootid != null && !this.rootid.equals(other.rootid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Casualfactormaster[ rootid=" + rootid + " ]";
    }
    
}
