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
@Table(name = "nearmissjobmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmissjobmaster.findAll", query = "SELECT n FROM Nearmissjobmaster n")
    , @NamedQuery(name = "Nearmissjobmaster.findByJobmastercode", query = "SELECT n FROM Nearmissjobmaster n WHERE n.jobmastercode = :jobmastercode")
    , @NamedQuery(name = "Nearmissjobmaster.findByJobmasterdesc", query = "SELECT n FROM Nearmissjobmaster n WHERE n.jobmasterdesc = :jobmasterdesc")
    , @NamedQuery(name = "Nearmissjobmaster.findByActiveStatus", query = "SELECT n FROM Nearmissjobmaster n WHERE n.activeStatus = :activeStatus")
    , @NamedQuery(name = "Nearmissjobmaster.findByCruser", query = "SELECT n FROM Nearmissjobmaster n WHERE n.cruser = :cruser")
    , @NamedQuery(name = "Nearmissjobmaster.findByCrdate", query = "SELECT n FROM Nearmissjobmaster n WHERE n.crdate = :crdate")
    , @NamedQuery(name = "Nearmissjobmaster.findByUpduser", query = "SELECT n FROM Nearmissjobmaster n WHERE n.upduser = :upduser")
    , @NamedQuery(name = "Nearmissjobmaster.findByUpddate", query = "SELECT n FROM Nearmissjobmaster n WHERE n.upddate = :upddate")})
public class Nearmissjobmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "jobmastercode")
    private String jobmastercode;
    @Column(name = "jobmasterdesc")
    private String jobmasterdesc;
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

    public Nearmissjobmaster() {
    }

    public Nearmissjobmaster(String jobmastercode) {
        this.jobmastercode = jobmastercode;
    }

    public String getJobmastercode() {
        return jobmastercode;
    }

    public void setJobmastercode(String jobmastercode) {
        this.jobmastercode = jobmastercode;
    }

    public String getJobmasterdesc() {
        return jobmasterdesc;
    }

    public void setJobmasterdesc(String jobmasterdesc) {
        this.jobmasterdesc = jobmasterdesc;
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
        hash += (jobmastercode != null ? jobmastercode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nearmissjobmaster)) {
            return false;
        }
        Nearmissjobmaster other = (Nearmissjobmaster) object;
        if ((this.jobmastercode == null && other.jobmastercode != null) || (this.jobmastercode != null && !this.jobmastercode.equals(other.jobmastercode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmissjobmaster[ jobmastercode=" + jobmastercode + " ]";
    }
    
}
