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
@Table(name = "nrmispsychologymaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nrmispsychologymaster.findAll", query = "SELECT n FROM Nrmispsychologymaster n")
    , @NamedQuery(name = "Nrmispsychologymaster.findByPsychologycode", query = "SELECT n FROM Nrmispsychologymaster n WHERE n.psychologycode = :psychologycode")
    , @NamedQuery(name = "Nrmispsychologymaster.findByPsychologyname", query = "SELECT n FROM Nrmispsychologymaster n WHERE n.psychologyname = :psychologyname")
    , @NamedQuery(name = "Nrmispsychologymaster.findByActiveStatus", query = "SELECT n FROM Nrmispsychologymaster n WHERE n.activeStatus = :activeStatus")
    , @NamedQuery(name = "Nrmispsychologymaster.findByCruser", query = "SELECT n FROM Nrmispsychologymaster n WHERE n.cruser = :cruser")
    , @NamedQuery(name = "Nrmispsychologymaster.findByCrdate", query = "SELECT n FROM Nrmispsychologymaster n WHERE n.crdate = :crdate")
    , @NamedQuery(name = "Nrmispsychologymaster.findByUpduser", query = "SELECT n FROM Nrmispsychologymaster n WHERE n.upduser = :upduser")
    , @NamedQuery(name = "Nrmispsychologymaster.findByUpddate", query = "SELECT n FROM Nrmispsychologymaster n WHERE n.upddate = :upddate")})
public class Nrmispsychologymaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "psychologycode")
    private String psychologycode;
    @Column(name = "psychologyname")
    private String psychologyname;
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

    public Nrmispsychologymaster() {
    }

    public Nrmispsychologymaster(String psychologycode) {
        this.psychologycode = psychologycode;
    }

    public String getPsychologycode() {
        return psychologycode;
    }

    public void setPsychologycode(String psychologycode) {
        this.psychologycode = psychologycode;
    }

    public String getPsychologyname() {
        return psychologyname;
    }

    public void setPsychologyname(String psychologyname) {
        this.psychologyname = psychologyname;
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
        hash += (psychologycode != null ? psychologycode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nrmispsychologymaster)) {
            return false;
        }
        Nrmispsychologymaster other = (Nrmispsychologymaster) object;
        if ((this.psychologycode == null && other.psychologycode != null) || (this.psychologycode != null && !this.psychologycode.equals(other.psychologycode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nrmispsychologymaster[ psychologycode=" + psychologycode + " ]";
    }
    
}
