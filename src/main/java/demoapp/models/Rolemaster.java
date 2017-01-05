/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "rolemaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rolemaster.findAll", query = "SELECT r FROM Rolemaster r")
    , @NamedQuery(name = "Rolemaster.findByRolecode", query = "SELECT r FROM Rolemaster r WHERE r.rolecode = :rolecode")
    , @NamedQuery(name = "Rolemaster.findByRolename", query = "SELECT r FROM Rolemaster r WHERE r.rolename = :rolename")
    , @NamedQuery(name = "Rolemaster.findByCruser", query = "SELECT r FROM Rolemaster r WHERE r.cruser = :cruser")
    , @NamedQuery(name = "Rolemaster.findByCrdate", query = "SELECT r FROM Rolemaster r WHERE r.crdate = :crdate")
    , @NamedQuery(name = "Rolemaster.findByUpduser", query = "SELECT r FROM Rolemaster r WHERE r.upduser = :upduser")
    , @NamedQuery(name = "Rolemaster.findByUpddate", query = "SELECT r FROM Rolemaster r WHERE r.upddate = :upddate")
    , @NamedQuery(name = "Rolemaster.findByActiveStatus", query = "SELECT r FROM Rolemaster r WHERE r.activeStatus = :activeStatus")})
public class Rolemaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rolecode")
    private String rolecode;
    @Column(name = "rolename")
    private String rolename;
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
    @Column(name = "active_status")
    private String activeStatus;
    @OneToMany(mappedBy = "rolecode")
    private List<Rankdetails> rankdetailsList;

    public Rolemaster() {
    }

    public Rolemaster(String rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
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

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    @XmlTransient
    public List<Rankdetails> getRankdetailsList() {
        return rankdetailsList;
    }

    public void setRankdetailsList(List<Rankdetails> rankdetailsList) {
        this.rankdetailsList = rankdetailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolecode != null ? rolecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolemaster)) {
            return false;
        }
        Rolemaster other = (Rolemaster) object;
        if ((this.rolecode == null && other.rolecode != null) || (this.rolecode != null && !this.rolecode.equals(other.rolecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rolemaster[ rolecode=" + rolecode + " ]";
    }
    
}
