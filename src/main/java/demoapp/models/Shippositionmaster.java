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
@Table(name = "shippositionmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shippositionmaster.findAll", query = "SELECT s FROM Shippositionmaster s")
    , @NamedQuery(name = "Shippositionmaster.findByShippositioncode", query = "SELECT s FROM Shippositionmaster s WHERE s.shippositioncode = :shippositioncode")
    , @NamedQuery(name = "Shippositionmaster.findByShippositiondesc", query = "SELECT s FROM Shippositionmaster s WHERE s.shippositiondesc = :shippositiondesc")
    , @NamedQuery(name = "Shippositionmaster.findByActiveStatus", query = "SELECT s FROM Shippositionmaster s WHERE s.activeStatus = :activeStatus")
    , @NamedQuery(name = "Shippositionmaster.findByCruser", query = "SELECT s FROM Shippositionmaster s WHERE s.cruser = :cruser")
    , @NamedQuery(name = "Shippositionmaster.findByCrdate", query = "SELECT s FROM Shippositionmaster s WHERE s.crdate = :crdate")
    , @NamedQuery(name = "Shippositionmaster.findByUpduser", query = "SELECT s FROM Shippositionmaster s WHERE s.upduser = :upduser")
    , @NamedQuery(name = "Shippositionmaster.findByUpddate", query = "SELECT s FROM Shippositionmaster s WHERE s.upddate = :upddate")})
public class Shippositionmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "shippositioncode")
    private String shippositioncode;
    @Column(name = "shippositiondesc")
    private String shippositiondesc;
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

    public Shippositionmaster() {
    }

    public Shippositionmaster(String shippositioncode) {
        this.shippositioncode = shippositioncode;
    }

    public String getShippositioncode() {
        return shippositioncode;
    }

    public void setShippositioncode(String shippositioncode) {
        this.shippositioncode = shippositioncode;
    }

    public String getShippositiondesc() {
        return shippositiondesc;
    }

    public void setShippositiondesc(String shippositiondesc) {
        this.shippositiondesc = shippositiondesc;
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
        hash += (shippositioncode != null ? shippositioncode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shippositionmaster)) {
            return false;
        }
        Shippositionmaster other = (Shippositionmaster) object;
        if ((this.shippositioncode == null && other.shippositioncode != null) || (this.shippositioncode != null && !this.shippositioncode.equals(other.shippositioncode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Shippositionmaster[ shippositioncode=" + shippositioncode + " ]";
    }
    
}
