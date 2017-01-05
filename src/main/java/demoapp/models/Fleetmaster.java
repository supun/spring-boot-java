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
@Table(name = "fleetmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fleetmaster.findAll", query = "SELECT f FROM Fleetmaster f")
    , @NamedQuery(name = "Fleetmaster.findByFleetcode", query = "SELECT f FROM Fleetmaster f WHERE f.fleetcode = :fleetcode")
    , @NamedQuery(name = "Fleetmaster.findByFleetname", query = "SELECT f FROM Fleetmaster f WHERE f.fleetname = :fleetname")
    , @NamedQuery(name = "Fleetmaster.findByActiveStatus", query = "SELECT f FROM Fleetmaster f WHERE f.activeStatus = :activeStatus")
    , @NamedQuery(name = "Fleetmaster.findByCrdate", query = "SELECT f FROM Fleetmaster f WHERE f.crdate = :crdate")
    , @NamedQuery(name = "Fleetmaster.findByCruser", query = "SELECT f FROM Fleetmaster f WHERE f.cruser = :cruser")
    , @NamedQuery(name = "Fleetmaster.findByUpddate", query = "SELECT f FROM Fleetmaster f WHERE f.upddate = :upddate")
    , @NamedQuery(name = "Fleetmaster.findByUpduser", query = "SELECT f FROM Fleetmaster f WHERE f.upduser = :upduser")})
public class Fleetmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fleetcode")
    private String fleetcode;
    @Column(name = "fleetname")
    private String fleetname;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "cruser")
    private String cruser;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;
    @Column(name = "upduser")
    private String upduser;
    @OneToMany(mappedBy = "fleetcode")
    private List<Vesselmaster> vesselmasterList;

    public Fleetmaster() {
    }

    public Fleetmaster(String fleetcode) {
        this.fleetcode = fleetcode;
    }

    public String getFleetcode() {
        return fleetcode;
    }

    public void setFleetcode(String fleetcode) {
        this.fleetcode = fleetcode;
    }

    public String getFleetname() {
        return fleetname;
    }

    public void setFleetname(String fleetname) {
        this.fleetname = fleetname;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public String getCruser() {
        return cruser;
    }

    public void setCruser(String cruser) {
        this.cruser = cruser;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public String getUpduser() {
        return upduser;
    }

    public void setUpduser(String upduser) {
        this.upduser = upduser;
    }

    @XmlTransient
    public List<Vesselmaster> getVesselmasterList() {
        return vesselmasterList;
    }

    public void setVesselmasterList(List<Vesselmaster> vesselmasterList) {
        this.vesselmasterList = vesselmasterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fleetcode != null ? fleetcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fleetmaster)) {
            return false;
        }
        Fleetmaster other = (Fleetmaster) object;
        if ((this.fleetcode == null && other.fleetcode != null) || (this.fleetcode != null && !this.fleetcode.equals(other.fleetcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Fleetmaster[ fleetcode=" + fleetcode + " ]";
    }
    
}
