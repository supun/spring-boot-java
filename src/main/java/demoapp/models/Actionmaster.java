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
@Table(name = "actionmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actionmaster.findAll", query = "SELECT a FROM Actionmaster a")
    , @NamedQuery(name = "Actionmaster.findByActioncode", query = "SELECT a FROM Actionmaster a WHERE a.actioncode = :actioncode")
    , @NamedQuery(name = "Actionmaster.findByActionname", query = "SELECT a FROM Actionmaster a WHERE a.actionname = :actionname")
    , @NamedQuery(name = "Actionmaster.findByActiondesc", query = "SELECT a FROM Actionmaster a WHERE a.actiondesc = :actiondesc")
    , @NamedQuery(name = "Actionmaster.findByActiveStatus", query = "SELECT a FROM Actionmaster a WHERE a.activeStatus = :activeStatus")
    , @NamedQuery(name = "Actionmaster.findByCruser", query = "SELECT a FROM Actionmaster a WHERE a.cruser = :cruser")
    , @NamedQuery(name = "Actionmaster.findByCrdate", query = "SELECT a FROM Actionmaster a WHERE a.crdate = :crdate")
    , @NamedQuery(name = "Actionmaster.findByUpduser", query = "SELECT a FROM Actionmaster a WHERE a.upduser = :upduser")
    , @NamedQuery(name = "Actionmaster.findByUpddate", query = "SELECT a FROM Actionmaster a WHERE a.upddate = :upddate")})
public class Actionmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "actioncode")
    private String actioncode;
    @Column(name = "actionname")
    private String actionname;
    @Column(name = "actiondesc")
    private String actiondesc;
    @Column(name = "active_status")
    private Character activeStatus;
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

    public Actionmaster() {
    }

    public Actionmaster(String actioncode) {
        this.actioncode = actioncode;
    }

    public String getActioncode() {
        return actioncode;
    }

    public void setActioncode(String actioncode) {
        this.actioncode = actioncode;
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname;
    }

    public String getActiondesc() {
        return actiondesc;
    }

    public void setActiondesc(String actiondesc) {
        this.actiondesc = actiondesc;
    }

    public Character getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Character activeStatus) {
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
        hash += (actioncode != null ? actioncode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actionmaster)) {
            return false;
        }
        Actionmaster other = (Actionmaster) object;
        if ((this.actioncode == null && other.actioncode != null) || (this.actioncode != null && !this.actioncode.equals(other.actioncode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Actionmaster[ actioncode=" + actioncode + " ]";
    }
    
}
