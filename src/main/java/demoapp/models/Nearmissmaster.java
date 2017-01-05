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
@Table(name = "nearmissmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmissmaster.findAll", query = "SELECT n FROM Nearmissmaster n")
    , @NamedQuery(name = "Nearmissmaster.findByNrmid", query = "SELECT n FROM Nearmissmaster n WHERE n.nrmid = :nrmid")
    , @NamedQuery(name = "Nearmissmaster.findByReportdate", query = "SELECT n FROM Nearmissmaster n WHERE n.reportdate = :reportdate")
    , @NamedQuery(name = "Nearmissmaster.findByVesselcode", query = "SELECT n FROM Nearmissmaster n WHERE n.vesselcode = :vesselcode")
    , @NamedQuery(name = "Nearmissmaster.findByImono", query = "SELECT n FROM Nearmissmaster n WHERE n.imono = :imono")
    , @NamedQuery(name = "Nearmissmaster.findByReportercode", query = "SELECT n FROM Nearmissmaster n WHERE n.reportercode = :reportercode")
    , @NamedQuery(name = "Nearmissmaster.findByRankcode", query = "SELECT n FROM Nearmissmaster n WHERE n.rankcode = :rankcode")
    , @NamedQuery(name = "Nearmissmaster.findByCompanycode", query = "SELECT n FROM Nearmissmaster n WHERE n.companycode = :companycode")
    , @NamedQuery(name = "Nearmissmaster.findByShiptype", query = "SELECT n FROM Nearmissmaster n WHERE n.shiptype = :shiptype")
    , @NamedQuery(name = "Nearmissmaster.findByShippostioncode", query = "SELECT n FROM Nearmissmaster n WHERE n.shippostioncode = :shippostioncode")
    , @NamedQuery(name = "Nearmissmaster.findByDeptcode", query = "SELECT n FROM Nearmissmaster n WHERE n.deptcode = :deptcode")
    , @NamedQuery(name = "Nearmissmaster.findByPersonconcernedcode", query = "SELECT n FROM Nearmissmaster n WHERE n.personconcernedcode = :personconcernedcode")
    , @NamedQuery(name = "Nearmissmaster.findByConcernedrankcode", query = "SELECT n FROM Nearmissmaster n WHERE n.concernedrankcode = :concernedrankcode")
    , @NamedQuery(name = "Nearmissmaster.findByYearofexp", query = "SELECT n FROM Nearmissmaster n WHERE n.yearofexp = :yearofexp")
    , @NamedQuery(name = "Nearmissmaster.findByRankyr", query = "SELECT n FROM Nearmissmaster n WHERE n.rankyr = :rankyr")
    , @NamedQuery(name = "Nearmissmaster.findByIncidentdate", query = "SELECT n FROM Nearmissmaster n WHERE n.incidentdate = :incidentdate")
    , @NamedQuery(name = "Nearmissmaster.findByLocationcode", query = "SELECT n FROM Nearmissmaster n WHERE n.locationcode = :locationcode")
    , @NamedQuery(name = "Nearmissmaster.findByCategorycode", query = "SELECT n FROM Nearmissmaster n WHERE n.categorycode = :categorycode")
    , @NamedQuery(name = "Nearmissmaster.findByJobcode", query = "SELECT n FROM Nearmissmaster n WHERE n.jobcode = :jobcode")
    , @NamedQuery(name = "Nearmissmaster.findByNearmissdetail", query = "SELECT n FROM Nearmissmaster n WHERE n.nearmissdetail = :nearmissdetail")
    , @NamedQuery(name = "Nearmissmaster.findByIncidentoutline", query = "SELECT n FROM Nearmissmaster n WHERE n.incidentoutline = :incidentoutline")
    , @NamedQuery(name = "Nearmissmaster.findByIncidentintent", query = "SELECT n FROM Nearmissmaster n WHERE n.incidentintent = :incidentintent")
    , @NamedQuery(name = "Nearmissmaster.findByWatswrong", query = "SELECT n FROM Nearmissmaster n WHERE n.watswrong = :watswrong")
    , @NamedQuery(name = "Nearmissmaster.findByEscalate", query = "SELECT n FROM Nearmissmaster n WHERE n.escalate = :escalate")
    , @NamedQuery(name = "Nearmissmaster.findByShare", query = "SELECT n FROM Nearmissmaster n WHERE n.share = :share")
    , @NamedQuery(name = "Nearmissmaster.findByIsmarkedsignificant", query = "SELECT n FROM Nearmissmaster n WHERE n.ismarkedsignificant = :ismarkedsignificant")
    , @NamedQuery(name = "Nearmissmaster.findByCrdate", query = "SELECT n FROM Nearmissmaster n WHERE n.crdate = :crdate")
    , @NamedQuery(name = "Nearmissmaster.findByActiveStatus", query = "SELECT n FROM Nearmissmaster n WHERE n.activeStatus = :activeStatus")
    , @NamedQuery(name = "Nearmissmaster.findByCurrankid", query = "SELECT n FROM Nearmissmaster n WHERE n.currankid = :currankid")
    , @NamedQuery(name = "Nearmissmaster.findByFormnumber", query = "SELECT n FROM Nearmissmaster n WHERE n.formnumber = :formnumber")
    , @NamedQuery(name = "Nearmissmaster.findByRevnumber", query = "SELECT n FROM Nearmissmaster n WHERE n.revnumber = :revnumber")
    , @NamedQuery(name = "Nearmissmaster.findByCause1", query = "SELECT n FROM Nearmissmaster n WHERE n.cause1 = :cause1")
    , @NamedQuery(name = "Nearmissmaster.findByCause2", query = "SELECT n FROM Nearmissmaster n WHERE n.cause2 = :cause2")
    , @NamedQuery(name = "Nearmissmaster.findByCasualfactor", query = "SELECT n FROM Nearmissmaster n WHERE n.casualfactor = :casualfactor")
    , @NamedQuery(name = "Nearmissmaster.findByRootcause", query = "SELECT n FROM Nearmissmaster n WHERE n.rootcause = :rootcause")
    , @NamedQuery(name = "Nearmissmaster.findByLessonlearnt", query = "SELECT n FROM Nearmissmaster n WHERE n.lessonlearnt = :lessonlearnt")
    , @NamedQuery(name = "Nearmissmaster.findByAdvisebydhead", query = "SELECT n FROM Nearmissmaster n WHERE n.advisebydhead = :advisebydhead")
    , @NamedQuery(name = "Nearmissmaster.findByAdvisebycaptain", query = "SELECT n FROM Nearmissmaster n WHERE n.advisebycaptain = :advisebycaptain")
    , @NamedQuery(name = "Nearmissmaster.findByCorrectiveaction", query = "SELECT n FROM Nearmissmaster n WHERE n.correctiveaction = :correctiveaction")
    , @NamedQuery(name = "Nearmissmaster.findBySicomment", query = "SELECT n FROM Nearmissmaster n WHERE n.sicomment = :sicomment")
    , @NamedQuery(name = "Nearmissmaster.findByRevdate", query = "SELECT n FROM Nearmissmaster n WHERE n.revdate = :revdate")})
public class Nearmissmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nrmid")
    private String nrmid;
    @Column(name = "reportdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reportdate;
    @Column(name = "vesselcode")
    private String vesselcode;
    @Column(name = "imono")
    private String imono;
    @Column(name = "reportercode")
    private String reportercode;
    @Column(name = "rankcode")
    private String rankcode;
    @Column(name = "companycode")
    private String companycode;
    @Column(name = "shiptype")
    private String shiptype;
    @Column(name = "shippostioncode")
    private String shippostioncode;
    @Column(name = "deptcode")
    private String deptcode;
    @Column(name = "personconcernedcode")
    private String personconcernedcode;
    @Column(name = "concernedrankcode")
    private String concernedrankcode;
    @Column(name = "yearofexp")
    private String yearofexp;
    @Column(name = "rankyr")
    private String rankyr;
    @Column(name = "incidentdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date incidentdate;
    @Column(name = "locationcode")
    private String locationcode;
    @Column(name = "categorycode")
    private String categorycode;
    @Column(name = "jobcode")
    private String jobcode;
    @Column(name = "nearmissdetail")
    private String nearmissdetail;
    @Column(name = "incidentoutline")
    private String incidentoutline;
    @Column(name = "incidentintent")
    private String incidentintent;
    @Column(name = "watswrong")
    private String watswrong;
    @Column(name = "escalate")
    private Character escalate;
    @Column(name = "share")
    private String share;
    @Column(name = "ismarkedsignificant")
    private String ismarkedsignificant;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "currankid")
    private String currankid;
    @Column(name = "formnumber")
    private String formnumber;
    @Column(name = "revnumber")
    private String revnumber;
    @Column(name = "cause1")
    private String cause1;
    @Column(name = "cause2")
    private String cause2;
    @Column(name = "casualfactor")
    private String casualfactor;
    @Column(name = "rootcause")
    private String rootcause;
    @Column(name = "lessonlearnt")
    private String lessonlearnt;
    @Column(name = "advisebydhead")
    private String advisebydhead;
    @Column(name = "advisebycaptain")
    private String advisebycaptain;
    @Column(name = "correctiveaction")
    private String correctiveaction;
    @Column(name = "sicomment")
    private String sicomment;
    @Column(name = "revdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revdate;
    @OneToMany(mappedBy = "nrmid")
    private List<Nearmissinvestigate> nearmissinvestigateList;
    @OneToMany(mappedBy = "nrmid")
    private List<Nrmwfhistory> nrmwfhistoryList;
    @OneToMany(mappedBy = "nrmid")
    private List<Nearmissmatrix> nearmissmatrixList;

    public Nearmissmaster() {
    }

    public Nearmissmaster(String nrmid) {
        this.nrmid = nrmid;
    }

    public String getNrmid() {
        return nrmid;
    }

    public void setNrmid(String nrmid) {
        this.nrmid = nrmid;
    }

    public Date getReportdate() {
        return reportdate;
    }

    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    public String getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public String getImono() {
        return imono;
    }

    public void setImono(String imono) {
        this.imono = imono;
    }

    public String getReportercode() {
        return reportercode;
    }

    public void setReportercode(String reportercode) {
        this.reportercode = reportercode;
    }

    public String getRankcode() {
        return rankcode;
    }

    public void setRankcode(String rankcode) {
        this.rankcode = rankcode;
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    public String getShiptype() {
        return shiptype;
    }

    public void setShiptype(String shiptype) {
        this.shiptype = shiptype;
    }

    public String getShippostioncode() {
        return shippostioncode;
    }

    public void setShippostioncode(String shippostioncode) {
        this.shippostioncode = shippostioncode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getPersonconcernedcode() {
        return personconcernedcode;
    }

    public void setPersonconcernedcode(String personconcernedcode) {
        this.personconcernedcode = personconcernedcode;
    }

    public String getConcernedrankcode() {
        return concernedrankcode;
    }

    public void setConcernedrankcode(String concernedrankcode) {
        this.concernedrankcode = concernedrankcode;
    }

    public String getYearofexp() {
        return yearofexp;
    }

    public void setYearofexp(String yearofexp) {
        this.yearofexp = yearofexp;
    }

    public String getRankyr() {
        return rankyr;
    }

    public void setRankyr(String rankyr) {
        this.rankyr = rankyr;
    }

    public Date getIncidentdate() {
        return incidentdate;
    }

    public void setIncidentdate(Date incidentdate) {
        this.incidentdate = incidentdate;
    }

    public String getLocationcode() {
        return locationcode;
    }

    public void setLocationcode(String locationcode) {
        this.locationcode = locationcode;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
    }

    public String getNearmissdetail() {
        return nearmissdetail;
    }

    public void setNearmissdetail(String nearmissdetail) {
        this.nearmissdetail = nearmissdetail;
    }

    public String getIncidentoutline() {
        return incidentoutline;
    }

    public void setIncidentoutline(String incidentoutline) {
        this.incidentoutline = incidentoutline;
    }

    public String getIncidentintent() {
        return incidentintent;
    }

    public void setIncidentintent(String incidentintent) {
        this.incidentintent = incidentintent;
    }

    public String getWatswrong() {
        return watswrong;
    }

    public void setWatswrong(String watswrong) {
        this.watswrong = watswrong;
    }

    public Character getEscalate() {
        return escalate;
    }

    public void setEscalate(Character escalate) {
        this.escalate = escalate;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getIsmarkedsignificant() {
        return ismarkedsignificant;
    }

    public void setIsmarkedsignificant(String ismarkedsignificant) {
        this.ismarkedsignificant = ismarkedsignificant;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getCurrankid() {
        return currankid;
    }

    public void setCurrankid(String currankid) {
        this.currankid = currankid;
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

    public String getCause1() {
        return cause1;
    }

    public void setCause1(String cause1) {
        this.cause1 = cause1;
    }

    public String getCause2() {
        return cause2;
    }

    public void setCause2(String cause2) {
        this.cause2 = cause2;
    }

    public String getCasualfactor() {
        return casualfactor;
    }

    public void setCasualfactor(String casualfactor) {
        this.casualfactor = casualfactor;
    }

    public String getRootcause() {
        return rootcause;
    }

    public void setRootcause(String rootcause) {
        this.rootcause = rootcause;
    }

    public String getLessonlearnt() {
        return lessonlearnt;
    }

    public void setLessonlearnt(String lessonlearnt) {
        this.lessonlearnt = lessonlearnt;
    }

    public String getAdvisebydhead() {
        return advisebydhead;
    }

    public void setAdvisebydhead(String advisebydhead) {
        this.advisebydhead = advisebydhead;
    }

    public String getAdvisebycaptain() {
        return advisebycaptain;
    }

    public void setAdvisebycaptain(String advisebycaptain) {
        this.advisebycaptain = advisebycaptain;
    }

    public String getCorrectiveaction() {
        return correctiveaction;
    }

    public void setCorrectiveaction(String correctiveaction) {
        this.correctiveaction = correctiveaction;
    }

    public String getSicomment() {
        return sicomment;
    }

    public void setSicomment(String sicomment) {
        this.sicomment = sicomment;
    }

    public Date getRevdate() {
        return revdate;
    }

    public void setRevdate(Date revdate) {
        this.revdate = revdate;
    }

    @XmlTransient
    public List<Nearmissinvestigate> getNearmissinvestigateList() {
        return nearmissinvestigateList;
    }

    public void setNearmissinvestigateList(List<Nearmissinvestigate> nearmissinvestigateList) {
        this.nearmissinvestigateList = nearmissinvestigateList;
    }

    @XmlTransient
    public List<Nrmwfhistory> getNrmwfhistoryList() {
        return nrmwfhistoryList;
    }

    public void setNrmwfhistoryList(List<Nrmwfhistory> nrmwfhistoryList) {
        this.nrmwfhistoryList = nrmwfhistoryList;
    }

    @XmlTransient
    public List<Nearmissmatrix> getNearmissmatrixList() {
        return nearmissmatrixList;
    }

    public void setNearmissmatrixList(List<Nearmissmatrix> nearmissmatrixList) {
        this.nearmissmatrixList = nearmissmatrixList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrmid != null ? nrmid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nearmissmaster)) {
            return false;
        }
        Nearmissmaster other = (Nearmissmaster) object;
        if ((this.nrmid == null && other.nrmid != null) || (this.nrmid != null && !this.nrmid.equals(other.nrmid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmissmaster[ nrmid=" + nrmid + " ]";
    }
    
}
