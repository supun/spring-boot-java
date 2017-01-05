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
@Table(name = "countrymaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Countrymaster.findAll", query = "SELECT c FROM Countrymaster c")
    , @NamedQuery(name = "Countrymaster.findByCountrycode", query = "SELECT c FROM Countrymaster c WHERE c.countrycode = :countrycode")
    , @NamedQuery(name = "Countrymaster.findByCountryname", query = "SELECT c FROM Countrymaster c WHERE c.countryname = :countryname")
    , @NamedQuery(name = "Countrymaster.findByActiveStatus", query = "SELECT c FROM Countrymaster c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Countrymaster.findByCruser", query = "SELECT c FROM Countrymaster c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Countrymaster.findByCrdate", query = "SELECT c FROM Countrymaster c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Countrymaster.findByUdpuser", query = "SELECT c FROM Countrymaster c WHERE c.udpuser = :udpuser")
    , @NamedQuery(name = "Countrymaster.findByUpddate", query = "SELECT c FROM Countrymaster c WHERE c.upddate = :upddate")})
public class Countrymaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "countrycode")
    private String countrycode;
    @Column(name = "countryname")
    private String countryname;
    @Column(name = "active_status")
    private Character activeStatus;
    @Column(name = "cruser")
    private String cruser;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "udpuser")
    private String udpuser;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;
    @OneToMany(mappedBy = "countrycode")
    private List<Portmaster> portmasterList;
    @OneToMany(mappedBy = "countrycode")
    private List<Terminalmaster> terminalmasterList;

    public Countrymaster() {
    }

    public Countrymaster(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
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

    public String getUdpuser() {
        return udpuser;
    }

    public void setUdpuser(String udpuser) {
        this.udpuser = udpuser;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    @XmlTransient
    public List<Portmaster> getPortmasterList() {
        return portmasterList;
    }

    public void setPortmasterList(List<Portmaster> portmasterList) {
        this.portmasterList = portmasterList;
    }

    @XmlTransient
    public List<Terminalmaster> getTerminalmasterList() {
        return terminalmasterList;
    }

    public void setTerminalmasterList(List<Terminalmaster> terminalmasterList) {
        this.terminalmasterList = terminalmasterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countrycode != null ? countrycode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Countrymaster)) {
            return false;
        }
        Countrymaster other = (Countrymaster) object;
        if ((this.countrycode == null && other.countrycode != null) || (this.countrycode != null && !this.countrycode.equals(other.countrycode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Countrymaster[ countrycode=" + countrycode + " ]";
    }
    
}
