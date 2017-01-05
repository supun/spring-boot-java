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
@Table(name = "drillreport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drillreport.findAll", query = "SELECT d FROM Drillreport d")
    , @NamedQuery(name = "Drillreport.findByFormnumber", query = "SELECT d FROM Drillreport d WHERE d.formnumber = :formnumber")
    , @NamedQuery(name = "Drillreport.findBySerialNumber", query = "SELECT d FROM Drillreport d WHERE d.serialNumber = :serialNumber")
    , @NamedQuery(name = "Drillreport.findByVessel", query = "SELECT d FROM Drillreport d WHERE d.vessel = :vessel")
    , @NamedQuery(name = "Drillreport.findByTimeofDrill", query = "SELECT d FROM Drillreport d WHERE d.timeofDrill = :timeofDrill")
    , @NamedQuery(name = "Drillreport.findByShipposition", query = "SELECT d FROM Drillreport d WHERE d.shipposition = :shipposition")
    , @NamedQuery(name = "Drillreport.findByDrillscenario", query = "SELECT d FROM Drillreport d WHERE d.drillscenario = :drillscenario")
    , @NamedQuery(name = "Drillreport.findByDrillparticipants", query = "SELECT d FROM Drillreport d WHERE d.drillparticipants = :drillparticipants")
    , @NamedQuery(name = "Drillreport.findByTypeofdrill", query = "SELECT d FROM Drillreport d WHERE d.typeofdrill = :typeofdrill")
    , @NamedQuery(name = "Drillreport.findByNameofmaster", query = "SELECT d FROM Drillreport d WHERE d.nameofmaster = :nameofmaster")
    , @NamedQuery(name = "Drillreport.findByDrillreportdate", query = "SELECT d FROM Drillreport d WHERE d.drillreportdate = :drillreportdate")
    , @NamedQuery(name = "Drillreport.findByRevisionno", query = "SELECT d FROM Drillreport d WHERE d.revisionno = :revisionno")
    , @NamedQuery(name = "Drillreport.findByStatus", query = "SELECT d FROM Drillreport d WHERE d.status = :status")
    , @NamedQuery(name = "Drillreport.findByCruser", query = "SELECT d FROM Drillreport d WHERE d.cruser = :cruser")
    , @NamedQuery(name = "Drillreport.findByCrdate", query = "SELECT d FROM Drillreport d WHERE d.crdate = :crdate")
    , @NamedQuery(name = "Drillreport.findByUpduser", query = "SELECT d FROM Drillreport d WHERE d.upduser = :upduser")
    , @NamedQuery(name = "Drillreport.findByUpddate", query = "SELECT d FROM Drillreport d WHERE d.upddate = :upddate")})
public class Drillreport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "formnumber")
    private String formnumber;
    @Column(name = "Serial Number")
    private String serialNumber;
    @Column(name = "Vessel")
    private String vessel;
    @Column(name = "Time of Drill")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeofDrill;
    @Column(name = "shipposition")
    private String shipposition;
    @Column(name = "drillscenario")
    private String drillscenario;
    @Column(name = "drillparticipants")
    private String drillparticipants;
    @Column(name = "typeofdrill")
    private String typeofdrill;
    @Column(name = "nameofmaster")
    private String nameofmaster;
    @Column(name = "drillreportdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date drillreportdate;
    @Column(name = "revisionno")
    private String revisionno;
    @Column(name = "status")
    private Character status;
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

    public Drillreport() {
    }

    public Drillreport(String formnumber) {
        this.formnumber = formnumber;
    }

    public String getFormnumber() {
        return formnumber;
    }

    public void setFormnumber(String formnumber) {
        this.formnumber = formnumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    public Date getTimeofDrill() {
        return timeofDrill;
    }

    public void setTimeofDrill(Date timeofDrill) {
        this.timeofDrill = timeofDrill;
    }

    public String getShipposition() {
        return shipposition;
    }

    public void setShipposition(String shipposition) {
        this.shipposition = shipposition;
    }

    public String getDrillscenario() {
        return drillscenario;
    }

    public void setDrillscenario(String drillscenario) {
        this.drillscenario = drillscenario;
    }

    public String getDrillparticipants() {
        return drillparticipants;
    }

    public void setDrillparticipants(String drillparticipants) {
        this.drillparticipants = drillparticipants;
    }

    public String getTypeofdrill() {
        return typeofdrill;
    }

    public void setTypeofdrill(String typeofdrill) {
        this.typeofdrill = typeofdrill;
    }

    public String getNameofmaster() {
        return nameofmaster;
    }

    public void setNameofmaster(String nameofmaster) {
        this.nameofmaster = nameofmaster;
    }

    public Date getDrillreportdate() {
        return drillreportdate;
    }

    public void setDrillreportdate(Date drillreportdate) {
        this.drillreportdate = drillreportdate;
    }

    public String getRevisionno() {
        return revisionno;
    }

    public void setRevisionno(String revisionno) {
        this.revisionno = revisionno;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
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
        hash += (formnumber != null ? formnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drillreport)) {
            return false;
        }
        Drillreport other = (Drillreport) object;
        if ((this.formnumber == null && other.formnumber != null) || (this.formnumber != null && !this.formnumber.equals(other.formnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Drillreport[ formnumber=" + formnumber + " ]";
    }
    
}
