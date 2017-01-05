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
import javax.persistence.CascadeType;
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
@Table(name = "rskmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rskmaster.findAll", query = "SELECT r FROM Rskmaster r")
    , @NamedQuery(name = "Rskmaster.findByFormnumber", query = "SELECT r FROM Rskmaster r WHERE r.formnumber = :formnumber")
    , @NamedQuery(name = "Rskmaster.findByRskid", query = "SELECT r FROM Rskmaster r WHERE r.rskid = :rskid")
    , @NamedQuery(name = "Rskmaster.findByRevnumber", query = "SELECT r FROM Rskmaster r WHERE r.revnumber = :revnumber")
    , @NamedQuery(name = "Rskmaster.findByRevdate", query = "SELECT r FROM Rskmaster r WHERE r.revdate = :revdate")
    , @NamedQuery(name = "Rskmaster.findByVesselcode", query = "SELECT r FROM Rskmaster r WHERE r.vesselcode = :vesselcode")
    , @NamedQuery(name = "Rskmaster.findByAssessmentdate", query = "SELECT r FROM Rskmaster r WHERE r.assessmentdate = :assessmentdate")
    , @NamedQuery(name = "Rskmaster.findByCategorycode", query = "SELECT r FROM Rskmaster r WHERE r.categorycode = :categorycode")
    , @NamedQuery(name = "Rskmaster.findByTaskname", query = "SELECT r FROM Rskmaster r WHERE r.taskname = :taskname")
    , @NamedQuery(name = "Rskmaster.findByLocationcode", query = "SELECT r FROM Rskmaster r WHERE r.locationcode = :locationcode")
    , @NamedQuery(name = "Rskmaster.findByPermitcode", query = "SELECT r FROM Rskmaster r WHERE r.permitcode = :permitcode")
    , @NamedQuery(name = "Rskmaster.findByEqpused", query = "SELECT r FROM Rskmaster r WHERE r.eqpused = :eqpused")
    , @NamedQuery(name = "Rskmaster.findByPersonsrankcode", query = "SELECT r FROM Rskmaster r WHERE r.personsrankcode = :personsrankcode")
    , @NamedQuery(name = "Rskmaster.findByHeadrankcode", query = "SELECT r FROM Rskmaster r WHERE r.headrankcode = :headrankcode")
    , @NamedQuery(name = "Rskmaster.findByHazardcount", query = "SELECT r FROM Rskmaster r WHERE r.hazardcount = :hazardcount")
    , @NamedQuery(name = "Rskmaster.findByCmpcomment", query = "SELECT r FROM Rskmaster r WHERE r.cmpcomment = :cmpcomment")
    , @NamedQuery(name = "Rskmaster.findByJobcommencedate", query = "SELECT r FROM Rskmaster r WHERE r.jobcommencedate = :jobcommencedate")
    , @NamedQuery(name = "Rskmaster.findByJobcompleteddate", query = "SELECT r FROM Rskmaster r WHERE r.jobcompleteddate = :jobcompleteddate")
    , @NamedQuery(name = "Rskmaster.findByIsAdequate", query = "SELECT r FROM Rskmaster r WHERE r.isAdequate = :isAdequate")
    , @NamedQuery(name = "Rskmaster.findByJobComments", query = "SELECT r FROM Rskmaster r WHERE r.jobComments = :jobComments")
    , @NamedQuery(name = "Rskmaster.findByIstemplate", query = "SELECT r FROM Rskmaster r WHERE r.istemplate = :istemplate")
    , @NamedQuery(name = "Rskmaster.findByCurrankid", query = "SELECT r FROM Rskmaster r WHERE r.currankid = :currankid")
    , @NamedQuery(name = "Rskmaster.findByActiveStatus", query = "SELECT r FROM Rskmaster r WHERE r.activeStatus = :activeStatus")
    , @NamedQuery(name = "Rskmaster.findByCrdate", query = "SELECT r FROM Rskmaster r WHERE r.crdate = :crdate")})
public class Rskmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "formnumber")
    private String formnumber;
    @Id
    @Basic(optional = false)
    @Column(name = "rskid")
    private String rskid;
    @Column(name = "revnumber")
    private String revnumber;
    @Column(name = "revdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revdate;
    @Column(name = "vesselcode")
    private String vesselcode;
    @Column(name = "assessmentdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assessmentdate;
    @Column(name = "categorycode")
    private String categorycode;
    @Column(name = "taskname")
    private String taskname;
    @Column(name = "locationcode")
    private String locationcode;
    @Column(name = "permitcode")
    private String permitcode;
    @Column(name = "eqpused")
    private String eqpused;
    @Column(name = "personsrankcode")
    private String personsrankcode;
    @Column(name = "headrankcode")
    private String headrankcode;
    @Column(name = "hazardcount")
    private Integer hazardcount;
    @Column(name = "cmpcomment")
    private String cmpcomment;
    @Column(name = "jobcommencedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobcommencedate;
    @Column(name = "jobcompleteddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobcompleteddate;
    @Column(name = "isAdequate")
    private String isAdequate;
    @Column(name = "jobComments")
    private String jobComments;
    @Column(name = "istemplate")
    private String istemplate;
    @Column(name = "currankid")
    private String currankid;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @OneToMany(mappedBy = "rskid")
    private List<Rskwfhistory> rskwfhistoryList;
	@OneToMany(mappedBy = "rskid", cascade = CascadeType.ALL)
    private List<Rskinitialrisk> rskinitialriskList;

    public Rskmaster() {
    }

    public Rskmaster(String rskid) {
        this.rskid = rskid;
    }

    public String getFormnumber() {
        return formnumber;
    }

    public void setFormnumber(String formnumber) {
        this.formnumber = formnumber;
    }

    public String getRskid() {
        return rskid;
    }

    public void setRskid(String rskid) {
        this.rskid = rskid;
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

    public Date getAssessmentdate() {
        return assessmentdate;
    }

    public void setAssessmentdate(Date assessmentdate) {
        this.assessmentdate = assessmentdate;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getLocationcode() {
        return locationcode;
    }

    public void setLocationcode(String locationcode) {
        this.locationcode = locationcode;
    }

    public String getPermitcode() {
        return permitcode;
    }

    public void setPermitcode(String permitcode) {
        this.permitcode = permitcode;
    }

    public String getEqpused() {
        return eqpused;
    }

    public void setEqpused(String eqpused) {
        this.eqpused = eqpused;
    }

    public String getPersonsrankcode() {
        return personsrankcode;
    }

    public void setPersonsrankcode(String personsrankcode) {
        this.personsrankcode = personsrankcode;
    }

    public String getHeadrankcode() {
        return headrankcode;
    }

    public void setHeadrankcode(String headrankcode) {
        this.headrankcode = headrankcode;
    }

    public Integer getHazardcount() {
        return hazardcount;
    }

    public void setHazardcount(Integer hazardcount) {
        this.hazardcount = hazardcount;
    }

    public String getCmpcomment() {
        return cmpcomment;
    }

    public void setCmpcomment(String cmpcomment) {
        this.cmpcomment = cmpcomment;
    }

    public Date getJobcommencedate() {
        return jobcommencedate;
    }

    public void setJobcommencedate(Date jobcommencedate) {
        this.jobcommencedate = jobcommencedate;
    }

    public Date getJobcompleteddate() {
        return jobcompleteddate;
    }

    public void setJobcompleteddate(Date jobcompleteddate) {
        this.jobcompleteddate = jobcompleteddate;
    }

    public String getIsAdequate() {
        return isAdequate;
    }

    public void setIsAdequate(String isAdequate) {
        this.isAdequate = isAdequate;
    }

    public String getJobComments() {
        return jobComments;
    }

    public void setJobComments(String jobComments) {
        this.jobComments = jobComments;
    }

    public String getIstemplate() {
        return istemplate;
    }

    public void setIstemplate(String istemplate) {
        this.istemplate = istemplate;
    }

    public String getCurrankid() {
        return currankid;
    }

    public void setCurrankid(String currankid) {
        this.currankid = currankid;
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

    @XmlTransient
    public List<Rskwfhistory> getRskwfhistoryList() {
        return rskwfhistoryList;
    }

    public void setRskwfhistoryList(List<Rskwfhistory> rskwfhistoryList) {
        this.rskwfhistoryList = rskwfhistoryList;
    }

    @XmlTransient
    public List<Rskinitialrisk> getRskinitialriskList() {
        return rskinitialriskList;
    }

    public void setRskinitialriskList(List<Rskinitialrisk> rskinitialriskList) {
        this.rskinitialriskList = rskinitialriskList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rskid != null ? rskid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rskmaster)) {
            return false;
        }
        Rskmaster other = (Rskmaster) object;
        if ((this.rskid == null && other.rskid != null) || (this.rskid != null && !this.rskid.equals(other.rskid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rskmaster[ rskid=" + rskid + " ]";
    }
    
}
