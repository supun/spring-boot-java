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
@Table(name = "departmentmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departmentmaster.findAll", query = "SELECT d FROM Departmentmaster d")
    , @NamedQuery(name = "Departmentmaster.findByDepcode", query = "SELECT d FROM Departmentmaster d WHERE d.depcode = :depcode")
    , @NamedQuery(name = "Departmentmaster.findByDepname", query = "SELECT d FROM Departmentmaster d WHERE d.depname = :depname")
    , @NamedQuery(name = "Departmentmaster.findByActiveStatus", query = "SELECT d FROM Departmentmaster d WHERE d.activeStatus = :activeStatus")
    , @NamedQuery(name = "Departmentmaster.findByCruser", query = "SELECT d FROM Departmentmaster d WHERE d.cruser = :cruser")
    , @NamedQuery(name = "Departmentmaster.findByCrdate", query = "SELECT d FROM Departmentmaster d WHERE d.crdate = :crdate")
    , @NamedQuery(name = "Departmentmaster.findByUpduser", query = "SELECT d FROM Departmentmaster d WHERE d.upduser = :upduser")
    , @NamedQuery(name = "Departmentmaster.findByUpddate", query = "SELECT d FROM Departmentmaster d WHERE d.upddate = :upddate")})
public class Departmentmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "depcode")
    private String depcode;
    @Column(name = "depname")
    private String depname;
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
    @OneToMany(mappedBy = "depcode")
    private List<Rankdetails> rankdetailsList;

    public Departmentmaster() {
    }

    public Departmentmaster(String depcode) {
        this.depcode = depcode;
    }

    public String getDepcode() {
        return depcode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
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
        hash += (depcode != null ? depcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departmentmaster)) {
            return false;
        }
        Departmentmaster other = (Departmentmaster) object;
        if ((this.depcode == null && other.depcode != null) || (this.depcode != null && !this.depcode.equals(other.depcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Departmentmaster[ depcode=" + depcode + " ]";
    }
    
}
