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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "terminalmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Terminalmaster.findAll", query = "SELECT t FROM Terminalmaster t")
    , @NamedQuery(name = "Terminalmaster.findByTerminalcode", query = "SELECT t FROM Terminalmaster t WHERE t.terminalcode = :terminalcode")
    , @NamedQuery(name = "Terminalmaster.findByTerminalname", query = "SELECT t FROM Terminalmaster t WHERE t.terminalname = :terminalname")
    , @NamedQuery(name = "Terminalmaster.findByBerths", query = "SELECT t FROM Terminalmaster t WHERE t.berths = :berths")
    , @NamedQuery(name = "Terminalmaster.findByCranes", query = "SELECT t FROM Terminalmaster t WHERE t.cranes = :cranes")
    , @NamedQuery(name = "Terminalmaster.findByDraft", query = "SELECT t FROM Terminalmaster t WHERE t.draft = :draft")
    , @NamedQuery(name = "Terminalmaster.findByAirdraft", query = "SELECT t FROM Terminalmaster t WHERE t.airdraft = :airdraft")
    , @NamedQuery(name = "Terminalmaster.findByPilotin", query = "SELECT t FROM Terminalmaster t WHERE t.pilotin = :pilotin")
    , @NamedQuery(name = "Terminalmaster.findByPilotout", query = "SELECT t FROM Terminalmaster t WHERE t.pilotout = :pilotout")
    , @NamedQuery(name = "Terminalmaster.findByCranespeed", query = "SELECT t FROM Terminalmaster t WHERE t.cranespeed = :cranespeed")
    , @NamedQuery(name = "Terminalmaster.findByVslclosing", query = "SELECT t FROM Terminalmaster t WHERE t.vslclosing = :vslclosing")
    , @NamedQuery(name = "Terminalmaster.findByOprcode", query = "SELECT t FROM Terminalmaster t WHERE t.oprcode = :oprcode")
    , @NamedQuery(name = "Terminalmaster.findByTerminalCommonName", query = "SELECT t FROM Terminalmaster t WHERE t.terminalCommonName = :terminalCommonName")
    , @NamedQuery(name = "Terminalmaster.findByActiveStatus", query = "SELECT t FROM Terminalmaster t WHERE t.activeStatus = :activeStatus")
    , @NamedQuery(name = "Terminalmaster.findByCruser", query = "SELECT t FROM Terminalmaster t WHERE t.cruser = :cruser")
    , @NamedQuery(name = "Terminalmaster.findByCrdate", query = "SELECT t FROM Terminalmaster t WHERE t.crdate = :crdate")
    , @NamedQuery(name = "Terminalmaster.findByUdpuser", query = "SELECT t FROM Terminalmaster t WHERE t.udpuser = :udpuser")
    , @NamedQuery(name = "Terminalmaster.findByUpddate", query = "SELECT t FROM Terminalmaster t WHERE t.upddate = :upddate")})
public class Terminalmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "terminalcode")
    private String terminalcode;
    @Column(name = "terminalname")
    private String terminalname;
    @Column(name = "berths")
    private Integer berths;
    @Column(name = "cranes")
    private Integer cranes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "draft")
    private Double draft;
    @Column(name = "airdraft")
    private Double airdraft;
    @Column(name = "pilotin")
    private Double pilotin;
    @Column(name = "pilotout")
    private Double pilotout;
    @Column(name = "cranespeed")
    private Double cranespeed;
    @Column(name = "vslclosing")
    private Integer vslclosing;
    @Column(name = "oprcode")
    private String oprcode;
    @Column(name = "TerminalCommonName")
    private String terminalCommonName;
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
    @JoinColumn(name = "portcode", referencedColumnName = "portcode")
    @ManyToOne
    private Portmaster portcode;

    public Terminalmaster() {
    }

    public Terminalmaster(String terminalcode) {
        this.terminalcode = terminalcode;
    }

    public String getTerminalcode() {
        return terminalcode;
    }

    public void setTerminalcode(String terminalcode) {
        this.terminalcode = terminalcode;
    }

    public String getTerminalname() {
        return terminalname;
    }

    public void setTerminalname(String terminalname) {
        this.terminalname = terminalname;
    }

    public Integer getBerths() {
        return berths;
    }

    public void setBerths(Integer berths) {
        this.berths = berths;
    }

    public Integer getCranes() {
        return cranes;
    }

    public void setCranes(Integer cranes) {
        this.cranes = cranes;
    }

    public Double getDraft() {
        return draft;
    }

    public void setDraft(Double draft) {
        this.draft = draft;
    }

    public Double getAirdraft() {
        return airdraft;
    }

    public void setAirdraft(Double airdraft) {
        this.airdraft = airdraft;
    }

    public Double getPilotin() {
        return pilotin;
    }

    public void setPilotin(Double pilotin) {
        this.pilotin = pilotin;
    }

    public Double getPilotout() {
        return pilotout;
    }

    public void setPilotout(Double pilotout) {
        this.pilotout = pilotout;
    }

    public Double getCranespeed() {
        return cranespeed;
    }

    public void setCranespeed(Double cranespeed) {
        this.cranespeed = cranespeed;
    }

    public Integer getVslclosing() {
        return vslclosing;
    }

    public void setVslclosing(Integer vslclosing) {
        this.vslclosing = vslclosing;
    }

    public String getOprcode() {
        return oprcode;
    }

    public void setOprcode(String oprcode) {
        this.oprcode = oprcode;
    }

    public String getTerminalCommonName() {
        return terminalCommonName;
    }

    public void setTerminalCommonName(String terminalCommonName) {
        this.terminalCommonName = terminalCommonName;
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

    public Portmaster getPortcode() {
        return portcode;
    }

    public void setPortcode(Portmaster portcode) {
        this.portcode = portcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (terminalcode != null ? terminalcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Terminalmaster)) {
            return false;
        }
        Terminalmaster other = (Terminalmaster) object;
        if ((this.terminalcode == null && other.terminalcode != null) || (this.terminalcode != null && !this.terminalcode.equals(other.terminalcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Terminalmaster[ terminalcode=" + terminalcode + " ]";
    }
    
}
