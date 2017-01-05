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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "portmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portmaster.findAll", query = "SELECT p FROM Portmaster p")
    , @NamedQuery(name = "Portmaster.findByPortcode", query = "SELECT p FROM Portmaster p WHERE p.portcode = :portcode")
    , @NamedQuery(name = "Portmaster.findByPortname", query = "SELECT p FROM Portmaster p WHERE p.portname = :portname")
    , @NamedQuery(name = "Portmaster.findByAreacode", query = "SELECT p FROM Portmaster p WHERE p.areacode = :areacode")
    , @NamedQuery(name = "Portmaster.findByRegion", query = "SELECT p FROM Portmaster p WHERE p.region = :region")
    , @NamedQuery(name = "Portmaster.findByPorttype", query = "SELECT p FROM Portmaster p WHERE p.porttype = :porttype")
    , @NamedQuery(name = "Portmaster.findByLatitude", query = "SELECT p FROM Portmaster p WHERE p.latitude = :latitude")
    , @NamedQuery(name = "Portmaster.findByLongitude", query = "SELECT p FROM Portmaster p WHERE p.longitude = :longitude")
    , @NamedQuery(name = "Portmaster.findByHemisphere", query = "SELECT p FROM Portmaster p WHERE p.hemisphere = :hemisphere")
    , @NamedQuery(name = "Portmaster.findByMeridian", query = "SELECT p FROM Portmaster p WHERE p.meridian = :meridian")
    , @NamedQuery(name = "Portmaster.findByActiveStatus", query = "SELECT p FROM Portmaster p WHERE p.activeStatus = :activeStatus")
    , @NamedQuery(name = "Portmaster.findByCruser", query = "SELECT p FROM Portmaster p WHERE p.cruser = :cruser")
    , @NamedQuery(name = "Portmaster.findByCrdate", query = "SELECT p FROM Portmaster p WHERE p.crdate = :crdate")
    , @NamedQuery(name = "Portmaster.findByUdpuser", query = "SELECT p FROM Portmaster p WHERE p.udpuser = :udpuser")
    , @NamedQuery(name = "Portmaster.findByUpddate", query = "SELECT p FROM Portmaster p WHERE p.upddate = :upddate")})
public class Portmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "portcode")
    private String portcode;
    @Column(name = "portname")
    private String portname;
    @Column(name = "areacode")
    private String areacode;
    @Column(name = "region")
    private String region;
    @Column(name = "porttype")
    private Character porttype;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "hemisphere")
    private Character hemisphere;
    @Column(name = "meridian")
    private Character meridian;
    @Column(name = "active_status")
    private String activeStatus;
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
    @JoinColumn(name = "countrycode", referencedColumnName = "countrycode")
    @ManyToOne
    private Countrymaster countrycode;
    @OneToMany(mappedBy = "portcode")
    private List<Terminalmaster> terminalmasterList;

    public Portmaster() {
    }

    public Portmaster(String portcode) {
        this.portcode = portcode;
    }

    public String getPortcode() {
        return portcode;
    }

    public void setPortcode(String portcode) {
        this.portcode = portcode;
    }

    public String getPortname() {
        return portname;
    }

    public void setPortname(String portname) {
        this.portname = portname;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Character getPorttype() {
        return porttype;
    }

    public void setPorttype(Character porttype) {
        this.porttype = porttype;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Character getHemisphere() {
        return hemisphere;
    }

    public void setHemisphere(Character hemisphere) {
        this.hemisphere = hemisphere;
    }

    public Character getMeridian() {
        return meridian;
    }

    public void setMeridian(Character meridian) {
        this.meridian = meridian;
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

    public Countrymaster getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(Countrymaster countrycode) {
        this.countrycode = countrycode;
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
        hash += (portcode != null ? portcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Portmaster)) {
            return false;
        }
        Portmaster other = (Portmaster) object;
        if ((this.portcode == null && other.portcode != null) || (this.portcode != null && !this.portcode.equals(other.portcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Portmaster[ portcode=" + portcode + " ]";
    }
    
}
