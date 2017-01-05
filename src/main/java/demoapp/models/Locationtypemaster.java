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
@Table(name = "locationtypemaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locationtypemaster.findAll", query = "SELECT l FROM Locationtypemaster l")
    , @NamedQuery(name = "Locationtypemaster.findByLoctypeid", query = "SELECT l FROM Locationtypemaster l WHERE l.loctypeid = :loctypeid")
    , @NamedQuery(name = "Locationtypemaster.findByLoctypename", query = "SELECT l FROM Locationtypemaster l WHERE l.loctypename = :loctypename")
    , @NamedQuery(name = "Locationtypemaster.findByActiveStatus", query = "SELECT l FROM Locationtypemaster l WHERE l.activeStatus = :activeStatus")
    , @NamedQuery(name = "Locationtypemaster.findByCruser", query = "SELECT l FROM Locationtypemaster l WHERE l.cruser = :cruser")
    , @NamedQuery(name = "Locationtypemaster.findByCrdate", query = "SELECT l FROM Locationtypemaster l WHERE l.crdate = :crdate")
    , @NamedQuery(name = "Locationtypemaster.findByUpduser", query = "SELECT l FROM Locationtypemaster l WHERE l.upduser = :upduser")
    , @NamedQuery(name = "Locationtypemaster.findByUpddate", query = "SELECT l FROM Locationtypemaster l WHERE l.upddate = :upddate")})
public class Locationtypemaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "loctypeid")
    private String loctypeid;
    @Column(name = "loctypename")
    private String loctypename;
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

    public Locationtypemaster() {
    }

    public Locationtypemaster(String loctypeid) {
        this.loctypeid = loctypeid;
    }

    public String getLoctypeid() {
        return loctypeid;
    }

    public void setLoctypeid(String loctypeid) {
        this.loctypeid = loctypeid;
    }

    public String getLoctypename() {
        return loctypename;
    }

    public void setLoctypename(String loctypename) {
        this.loctypename = loctypename;
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
        hash += (loctypeid != null ? loctypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locationtypemaster)) {
            return false;
        }
        Locationtypemaster other = (Locationtypemaster) object;
        if ((this.loctypeid == null && other.loctypeid != null) || (this.loctypeid != null && !this.loctypeid.equals(other.loctypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Locationtypemaster[ loctypeid=" + loctypeid + " ]";
    }
    
}
