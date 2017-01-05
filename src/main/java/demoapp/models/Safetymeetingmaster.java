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
@Table(name = "safetymeetingmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetymeetingmaster.findAll", query = "SELECT s FROM Safetymeetingmaster s")
    , @NamedQuery(name = "Safetymeetingmaster.findBySafid", query = "SELECT s FROM Safetymeetingmaster s WHERE s.safid = :safid")
    , @NamedQuery(name = "Safetymeetingmaster.findByFormnumber", query = "SELECT s FROM Safetymeetingmaster s WHERE s.formnumber = :formnumber")
    , @NamedQuery(name = "Safetymeetingmaster.findByRevnumber", query = "SELECT s FROM Safetymeetingmaster s WHERE s.revnumber = :revnumber")
    , @NamedQuery(name = "Safetymeetingmaster.findByRevdate", query = "SELECT s FROM Safetymeetingmaster s WHERE s.revdate = :revdate")
    , @NamedQuery(name = "Safetymeetingmaster.findByVesselcode", query = "SELECT s FROM Safetymeetingmaster s WHERE s.vesselcode = :vesselcode")
    , @NamedQuery(name = "Safetymeetingmaster.findBySafetymeetingdate", query = "SELECT s FROM Safetymeetingmaster s WHERE s.safetymeetingdate = :safetymeetingdate")
    , @NamedQuery(name = "Safetymeetingmaster.findByMeetingtype", query = "SELECT s FROM Safetymeetingmaster s WHERE s.meetingtype = :meetingtype")
    , @NamedQuery(name = "Safetymeetingmaster.findByOfcattendstatus", query = "SELECT s FROM Safetymeetingmaster s WHERE s.ofcattendstatus = :ofcattendstatus")
    , @NamedQuery(name = "Safetymeetingmaster.findByOfficeattendees", query = "SELECT s FROM Safetymeetingmaster s WHERE s.officeattendees = :officeattendees")
    , @NamedQuery(name = "Safetymeetingmaster.findByNonattendees", query = "SELECT s FROM Safetymeetingmaster s WHERE s.nonattendees = :nonattendees")
    , @NamedQuery(name = "Safetymeetingmaster.findByIsReviewed", query = "SELECT s FROM Safetymeetingmaster s WHERE s.isReviewed = :isReviewed")
    , @NamedQuery(name = "Safetymeetingmaster.findByHypochloritedate", query = "SELECT s FROM Safetymeetingmaster s WHERE s.hypochloritedate = :hypochloritedate")
    , @NamedQuery(name = "Safetymeetingmaster.findByPpm", query = "SELECT s FROM Safetymeetingmaster s WHERE s.ppm = :ppm")
    , @NamedQuery(name = "Safetymeetingmaster.findByCircular", query = "SELECT s FROM Safetymeetingmaster s WHERE s.circular = :circular")
    , @NamedQuery(name = "Safetymeetingmaster.findByFindchecklist", query = "SELECT s FROM Safetymeetingmaster s WHERE s.findchecklist = :findchecklist")
    , @NamedQuery(name = "Safetymeetingmaster.findByFindaudit", query = "SELECT s FROM Safetymeetingmaster s WHERE s.findaudit = :findaudit")
    , @NamedQuery(name = "Safetymeetingmaster.findByNewamendment", query = "SELECT s FROM Safetymeetingmaster s WHERE s.newamendment = :newamendment")
    , @NamedQuery(name = "Safetymeetingmaster.findByReviewhealth", query = "SELECT s FROM Safetymeetingmaster s WHERE s.reviewhealth = :reviewhealth")
    , @NamedQuery(name = "Safetymeetingmaster.findByReviewcomplaints", query = "SELECT s FROM Safetymeetingmaster s WHERE s.reviewcomplaints = :reviewcomplaints")
    , @NamedQuery(name = "Safetymeetingmaster.findByReviewrisk", query = "SELECT s FROM Safetymeetingmaster s WHERE s.reviewrisk = :reviewrisk")
    , @NamedQuery(name = "Safetymeetingmaster.findByActiveStatus", query = "SELECT s FROM Safetymeetingmaster s WHERE s.activeStatus = :activeStatus")
    , @NamedQuery(name = "Safetymeetingmaster.findByCrdate", query = "SELECT s FROM Safetymeetingmaster s WHERE s.crdate = :crdate")
    , @NamedQuery(name = "Safetymeetingmaster.findByGeneralcomments", query = "SELECT s FROM Safetymeetingmaster s WHERE s.generalcomments = :generalcomments")
    , @NamedQuery(name = "Safetymeetingmaster.findByPortsidedate", query = "SELECT s FROM Safetymeetingmaster s WHERE s.portsidedate = :portsidedate")
    , @NamedQuery(name = "Safetymeetingmaster.findByPortsideloccode", query = "SELECT s FROM Safetymeetingmaster s WHERE s.portsideloccode = :portsideloccode")
    , @NamedQuery(name = "Safetymeetingmaster.findByStarsidedate", query = "SELECT s FROM Safetymeetingmaster s WHERE s.starsidedate = :starsidedate")
    , @NamedQuery(name = "Safetymeetingmaster.findByStarsideloccode", query = "SELECT s FROM Safetymeetingmaster s WHERE s.starsideloccode = :starsideloccode")
    , @NamedQuery(name = "Safetymeetingmaster.findByCrhid", query = "SELECT s FROM Safetymeetingmaster s WHERE s.crhid = :crhid")
    , @NamedQuery(name = "Safetymeetingmaster.findByDrrid", query = "SELECT s FROM Safetymeetingmaster s WHERE s.drrid = :drrid")})
public class Safetymeetingmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "safid")
    private String safid;
    @Column(name = "formnumber")
    private String formnumber;
    @Column(name = "revnumber")
    private String revnumber;
    @Column(name = "revdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revdate;
    @Column(name = "vesselcode")
    private String vesselcode;
    @Column(name = "safetymeetingdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date safetymeetingdate;
    @Column(name = "meetingtype")
    private Character meetingtype;
    @Column(name = "ofcattendstatus")
    private Character ofcattendstatus;
    @Column(name = "officeattendees")
    private String officeattendees;
    @Column(name = "nonattendees")
    private String nonattendees;
    @Column(name = "isReviewed")
    private Character isReviewed;
    @Column(name = "hypochloritedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hypochloritedate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PPM")
    private Float ppm;
    @Column(name = "circular")
    private String circular;
    @Column(name = "findchecklist")
    private String findchecklist;
    @Column(name = "findaudit")
    private String findaudit;
    @Column(name = "newamendment")
    private String newamendment;
    @Column(name = "reviewhealth")
    private String reviewhealth;
    @Column(name = "reviewcomplaints")
    private String reviewcomplaints;
    @Column(name = "reviewrisk")
    private String reviewrisk;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "generalcomments")
    private String generalcomments;
    @Column(name = "portsidedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date portsidedate;
    @Column(name = "portsideloccode")
    private String portsideloccode;
    @Column(name = "starsidedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date starsidedate;
    @Column(name = "starsideloccode")
    private String starsideloccode;
    @Column(name = "crhid")
    private String crhid;
    @Column(name = "drrid")
    private String drrid;
    @OneToMany(mappedBy = "safid")
    private List<Safetycommittee> safetycommitteeList;
    @OneToMany(mappedBy = "safid")
    private List<Safetyoffice> safetyofficeList;
    @OneToMany(mappedBy = "safid")
    private List<Safetytraining> safetytrainingList;
    @OneToMany(mappedBy = "ossafid")
    private List<Safetyoutstanding> safetyoutstandingList;
    @OneToMany(mappedBy = "safid")
    private List<Safetyoutstanding> safetyoutstandingList1;
    @OneToMany(mappedBy = "safid")
    private List<Safetydrill> safetydrillList;
    @OneToMany(mappedBy = "safid")
    private List<Safetymeetingtopics> safetymeetingtopicsList;
    @OneToMany(mappedBy = "safid")
    private List<Safetyconcern> safetyconcernList;
    @OneToMany(mappedBy = "safid")
    private List<Safwfhistory> safwfhistoryList;
    @OneToMany(mappedBy = "safid")
    private List<Safetyrecord> safetyrecordList;

    public Safetymeetingmaster() {
    }

    public Safetymeetingmaster(String safid) {
        this.safid = safid;
    }

    public String getSafid() {
        return safid;
    }

    public void setSafid(String safid) {
        this.safid = safid;
    }

    public String getFormnumber() {
        return formnumber;
    }

    public void setFormnumber(String formnumber) {
        this.formnumber = formnumber;
    }

    public String getRevnumber() {
        return revnumber;
    }

    public void setRevnumber(String revnumber) {
        this.revnumber = revnumber;
    }

    public Date getRevdate() {
        return revdate;
    }

    public void setRevdate(Date revdate) {
        this.revdate = revdate;
    }

    public String getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public Date getSafetymeetingdate() {
        return safetymeetingdate;
    }

    public void setSafetymeetingdate(Date safetymeetingdate) {
        this.safetymeetingdate = safetymeetingdate;
    }

    public Character getMeetingtype() {
        return meetingtype;
    }

    public void setMeetingtype(Character meetingtype) {
        this.meetingtype = meetingtype;
    }

    public Character getOfcattendstatus() {
        return ofcattendstatus;
    }

    public void setOfcattendstatus(Character ofcattendstatus) {
        this.ofcattendstatus = ofcattendstatus;
    }

    public String getOfficeattendees() {
        return officeattendees;
    }

    public void setOfficeattendees(String officeattendees) {
        this.officeattendees = officeattendees;
    }

    public String getNonattendees() {
        return nonattendees;
    }

    public void setNonattendees(String nonattendees) {
        this.nonattendees = nonattendees;
    }

    public Character getIsReviewed() {
        return isReviewed;
    }

    public void setIsReviewed(Character isReviewed) {
        this.isReviewed = isReviewed;
    }

    public Date getHypochloritedate() {
        return hypochloritedate;
    }

    public void setHypochloritedate(Date hypochloritedate) {
        this.hypochloritedate = hypochloritedate;
    }

    public Float getPpm() {
        return ppm;
    }

    public void setPpm(Float ppm) {
        this.ppm = ppm;
    }

    public String getCircular() {
        return circular;
    }

    public void setCircular(String circular) {
        this.circular = circular;
    }

    public String getFindchecklist() {
        return findchecklist;
    }

    public void setFindchecklist(String findchecklist) {
        this.findchecklist = findchecklist;
    }

    public String getFindaudit() {
        return findaudit;
    }

    public void setFindaudit(String findaudit) {
        this.findaudit = findaudit;
    }

    public String getNewamendment() {
        return newamendment;
    }

    public void setNewamendment(String newamendment) {
        this.newamendment = newamendment;
    }

    public String getReviewhealth() {
        return reviewhealth;
    }

    public void setReviewhealth(String reviewhealth) {
        this.reviewhealth = reviewhealth;
    }

    public String getReviewcomplaints() {
        return reviewcomplaints;
    }

    public void setReviewcomplaints(String reviewcomplaints) {
        this.reviewcomplaints = reviewcomplaints;
    }

    public String getReviewrisk() {
        return reviewrisk;
    }

    public void setReviewrisk(String reviewrisk) {
        this.reviewrisk = reviewrisk;
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

    public String getGeneralcomments() {
        return generalcomments;
    }

    public void setGeneralcomments(String generalcomments) {
        this.generalcomments = generalcomments;
    }

    public Date getPortsidedate() {
        return portsidedate;
    }

    public void setPortsidedate(Date portsidedate) {
        this.portsidedate = portsidedate;
    }

    public String getPortsideloccode() {
        return portsideloccode;
    }

    public void setPortsideloccode(String portsideloccode) {
        this.portsideloccode = portsideloccode;
    }

    public Date getStarsidedate() {
        return starsidedate;
    }

    public void setStarsidedate(Date starsidedate) {
        this.starsidedate = starsidedate;
    }

    public String getStarsideloccode() {
        return starsideloccode;
    }

    public void setStarsideloccode(String starsideloccode) {
        this.starsideloccode = starsideloccode;
    }

    public String getCrhid() {
        return crhid;
    }

    public void setCrhid(String crhid) {
        this.crhid = crhid;
    }

    public String getDrrid() {
        return drrid;
    }

    public void setDrrid(String drrid) {
        this.drrid = drrid;
    }

    @XmlTransient
    public List<Safetycommittee> getSafetycommitteeList() {
        return safetycommitteeList;
    }

    public void setSafetycommitteeList(List<Safetycommittee> safetycommitteeList) {
        this.safetycommitteeList = safetycommitteeList;
    }

    @XmlTransient
    public List<Safetyoffice> getSafetyofficeList() {
        return safetyofficeList;
    }

    public void setSafetyofficeList(List<Safetyoffice> safetyofficeList) {
        this.safetyofficeList = safetyofficeList;
    }

    @XmlTransient
    public List<Safetytraining> getSafetytrainingList() {
        return safetytrainingList;
    }

    public void setSafetytrainingList(List<Safetytraining> safetytrainingList) {
        this.safetytrainingList = safetytrainingList;
    }

    @XmlTransient
    public List<Safetyoutstanding> getSafetyoutstandingList() {
        return safetyoutstandingList;
    }

    public void setSafetyoutstandingList(List<Safetyoutstanding> safetyoutstandingList) {
        this.safetyoutstandingList = safetyoutstandingList;
    }

    @XmlTransient
    public List<Safetyoutstanding> getSafetyoutstandingList1() {
        return safetyoutstandingList1;
    }

    public void setSafetyoutstandingList1(List<Safetyoutstanding> safetyoutstandingList1) {
        this.safetyoutstandingList1 = safetyoutstandingList1;
    }

    @XmlTransient
    public List<Safetydrill> getSafetydrillList() {
        return safetydrillList;
    }

    public void setSafetydrillList(List<Safetydrill> safetydrillList) {
        this.safetydrillList = safetydrillList;
    }

    @XmlTransient
    public List<Safetymeetingtopics> getSafetymeetingtopicsList() {
        return safetymeetingtopicsList;
    }

    public void setSafetymeetingtopicsList(List<Safetymeetingtopics> safetymeetingtopicsList) {
        this.safetymeetingtopicsList = safetymeetingtopicsList;
    }

    @XmlTransient
    public List<Safetyconcern> getSafetyconcernList() {
        return safetyconcernList;
    }

    public void setSafetyconcernList(List<Safetyconcern> safetyconcernList) {
        this.safetyconcernList = safetyconcernList;
    }

    @XmlTransient
    public List<Safwfhistory> getSafwfhistoryList() {
        return safwfhistoryList;
    }

    public void setSafwfhistoryList(List<Safwfhistory> safwfhistoryList) {
        this.safwfhistoryList = safwfhistoryList;
    }

    @XmlTransient
    public List<Safetyrecord> getSafetyrecordList() {
        return safetyrecordList;
    }

    public void setSafetyrecordList(List<Safetyrecord> safetyrecordList) {
        this.safetyrecordList = safetyrecordList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (safid != null ? safid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Safetymeetingmaster)) {
            return false;
        }
        Safetymeetingmaster other = (Safetymeetingmaster) object;
        if ((this.safid == null && other.safid != null) || (this.safid != null && !this.safid.equals(other.safid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetymeetingmaster[ safid=" + safid + " ]";
    }
    
}
