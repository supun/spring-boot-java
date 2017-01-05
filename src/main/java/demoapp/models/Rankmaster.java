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
@Table(name = "rankmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rankmaster.findAll", query = "SELECT r FROM Rankmaster r")
    , @NamedQuery(name = "Rankmaster.findByRankcode", query = "SELECT r FROM Rankmaster r WHERE r.rankcode = :rankcode")
    , @NamedQuery(name = "Rankmaster.findByRankname", query = "SELECT r FROM Rankmaster r WHERE r.rankname = :rankname")
    , @NamedQuery(name = "Rankmaster.findByActiveStatus", query = "SELECT r FROM Rankmaster r WHERE r.activeStatus = :activeStatus")
    , @NamedQuery(name = "Rankmaster.findByCruser", query = "SELECT r FROM Rankmaster r WHERE r.cruser = :cruser")
    , @NamedQuery(name = "Rankmaster.findByCrdate", query = "SELECT r FROM Rankmaster r WHERE r.crdate = :crdate")
    , @NamedQuery(name = "Rankmaster.findByUpduser", query = "SELECT r FROM Rankmaster r WHERE r.upduser = :upduser")
    , @NamedQuery(name = "Rankmaster.findByUpddate", query = "SELECT r FROM Rankmaster r WHERE r.upddate = :upddate")})
public class Rankmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rankcode")
    private String rankcode;
    @Column(name = "rankname")
    private String rankname;
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
    @OneToMany(mappedBy = "rankcode")
    private List<Rankdetails> rankdetailsList;
    @OneToMany(mappedBy = "rankcode")
    private List<Crewmaster> crewmasterList;

    public Rankmaster() {
    }

    public Rankmaster(String rankcode) {
        this.rankcode = rankcode;
    }

    public String getRankcode() {
        return rankcode;
    }

    public void setRankcode(String rankcode) {
        this.rankcode = rankcode;
    }

    public String getRankname() {
        return rankname;
    }

    public void setRankname(String rankname) {
        this.rankname = rankname;
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

    @XmlTransient
    public List<Crewmaster> getCrewmasterList() {
        return crewmasterList;
    }

    public void setCrewmasterList(List<Crewmaster> crewmasterList) {
        this.crewmasterList = crewmasterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rankcode != null ? rankcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rankmaster)) {
            return false;
        }
        Rankmaster other = (Rankmaster) object;
        if ((this.rankcode == null && other.rankcode != null) || (this.rankcode != null && !this.rankcode.equals(other.rankcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rankmaster[ rankcode=" + rankcode + " ]";
    }
    
}
