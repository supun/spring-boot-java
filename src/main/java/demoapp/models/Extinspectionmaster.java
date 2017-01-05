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
@Table(name = "extinspectionmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extinspectionmaster.findAll", query = "SELECT e FROM Extinspectionmaster e")
    , @NamedQuery(name = "Extinspectionmaster.findByExtinsid", query = "SELECT e FROM Extinspectionmaster e WHERE e.extinsid = :extinsid")
    , @NamedQuery(name = "Extinspectionmaster.findByFormnumber", query = "SELECT e FROM Extinspectionmaster e WHERE e.formnumber = :formnumber")
    , @NamedQuery(name = "Extinspectionmaster.findByRevnumber", query = "SELECT e FROM Extinspectionmaster e WHERE e.revnumber = :revnumber")
    , @NamedQuery(name = "Extinspectionmaster.findByRevdate", query = "SELECT e FROM Extinspectionmaster e WHERE e.revdate = :revdate")
    , @NamedQuery(name = "Extinspectionmaster.findByCaptaincode", query = "SELECT e FROM Extinspectionmaster e WHERE e.captaincode = :captaincode")
    , @NamedQuery(name = "Extinspectionmaster.findByChiefengcode", query = "SELECT e FROM Extinspectionmaster e WHERE e.chiefengcode = :chiefengcode")
    , @NamedQuery(name = "Extinspectionmaster.findByVesselcode", query = "SELECT e FROM Extinspectionmaster e WHERE e.vesselcode = :vesselcode")
    , @NamedQuery(name = "Extinspectionmaster.findByFlagname", query = "SELECT e FROM Extinspectionmaster e WHERE e.flagname = :flagname")
    , @NamedQuery(name = "Extinspectionmaster.findByFleetcode", query = "SELECT e FROM Extinspectionmaster e WHERE e.fleetcode = :fleetcode")
    , @NamedQuery(name = "Extinspectionmaster.findByInspectiontypecode", query = "SELECT e FROM Extinspectionmaster e WHERE e.inspectiontypecode = :inspectiontypecode")
    , @NamedQuery(name = "Extinspectionmaster.findByAuthoritycode", query = "SELECT e FROM Extinspectionmaster e WHERE e.authoritycode = :authoritycode")
    , @NamedQuery(name = "Extinspectionmaster.findByDeficiencycount", query = "SELECT e FROM Extinspectionmaster e WHERE e.deficiencycount = :deficiencycount")
    , @NamedQuery(name = "Extinspectionmaster.findByPlacetype", query = "SELECT e FROM Extinspectionmaster e WHERE e.placetype = :placetype")
    , @NamedQuery(name = "Extinspectionmaster.findByPlacecode", query = "SELECT e FROM Extinspectionmaster e WHERE e.placecode = :placecode")
    , @NamedQuery(name = "Extinspectionmaster.findByCountrycode", query = "SELECT e FROM Extinspectionmaster e WHERE e.countrycode = :countrycode")
    , @NamedQuery(name = "Extinspectionmaster.findByInspectiondate", query = "SELECT e FROM Extinspectionmaster e WHERE e.inspectiondate = :inspectiondate")
    , @NamedQuery(name = "Extinspectionmaster.findByComments", query = "SELECT e FROM Extinspectionmaster e WHERE e.comments = :comments")
    , @NamedQuery(name = "Extinspectionmaster.findByActiveStatus", query = "SELECT e FROM Extinspectionmaster e WHERE e.activeStatus = :activeStatus")
    , @NamedQuery(name = "Extinspectionmaster.findByCrdate", query = "SELECT e FROM Extinspectionmaster e WHERE e.crdate = :crdate")
    , @NamedQuery(name = "Extinspectionmaster.findByCurrrankid", query = "SELECT e FROM Extinspectionmaster e WHERE e.currrankid = :currrankid")})
public class Extinspectionmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "extinsid")
    private String extinsid;
    @Column(name = "formnumber")
    private String formnumber;
    @Column(name = "revnumber")
    private String revnumber;
    @Column(name = "revdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revdate;
    @Column(name = "captaincode")
    private String captaincode;
    @Column(name = "chiefengcode")
    private String chiefengcode;
    @Column(name = "vesselcode")
    private String vesselcode;
    @Column(name = "flagname")
    private String flagname;
    @Column(name = "fleetcode")
    private String fleetcode;
    @Column(name = "inspectiontypecode")
    private String inspectiontypecode;
    @Column(name = "authoritycode")
    private String authoritycode;
    @Column(name = "deficiencycount")
    private Integer deficiencycount;
    @Column(name = "placetype")
    private String placetype;
    @Column(name = "placecode")
    private String placecode;
    @Column(name = "countrycode")
    private String countrycode;
    @Column(name = "inspectiondate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inspectiondate;
    @Column(name = "comments")
    private String comments;
    @Column(name = "active_status")
    private Character activeStatus;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "currrankid")
    private String currrankid;
    @OneToMany(mappedBy = "extinsid")
    private List<Extinswfhistory> extinswfhistoryList;
    @OneToMany(mappedBy = "extinsid")
    private List<Extinspectiondetails> extinspectiondetailsList;

    public Extinspectionmaster() {
    }

    public Extinspectionmaster(String extinsid) {
        this.extinsid = extinsid;
    }

    public String getExtinsid() {
        return extinsid;
    }

    public void setExtinsid(String extinsid) {
        this.extinsid = extinsid;
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

    public String getCaptaincode() {
        return captaincode;
    }

    public void setCaptaincode(String captaincode) {
        this.captaincode = captaincode;
    }

    public String getChiefengcode() {
        return chiefengcode;
    }

    public void setChiefengcode(String chiefengcode) {
        this.chiefengcode = chiefengcode;
    }

    public String getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public String getFlagname() {
        return flagname;
    }

    public void setFlagname(String flagname) {
        this.flagname = flagname;
    }

    public String getFleetcode() {
        return fleetcode;
    }

    public void setFleetcode(String fleetcode) {
        this.fleetcode = fleetcode;
    }

    public String getInspectiontypecode() {
        return inspectiontypecode;
    }

    public void setInspectiontypecode(String inspectiontypecode) {
        this.inspectiontypecode = inspectiontypecode;
    }

    public String getAuthoritycode() {
        return authoritycode;
    }

    public void setAuthoritycode(String authoritycode) {
        this.authoritycode = authoritycode;
    }

    public Integer getDeficiencycount() {
        return deficiencycount;
    }

    public void setDeficiencycount(Integer deficiencycount) {
        this.deficiencycount = deficiencycount;
    }

    public String getPlacetype() {
        return placetype;
    }

    public void setPlacetype(String placetype) {
        this.placetype = placetype;
    }

    public String getPlacecode() {
        return placecode;
    }

    public void setPlacecode(String placecode) {
        this.placecode = placecode;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public Date getInspectiondate() {
        return inspectiondate;
    }

    public void setInspectiondate(Date inspectiondate) {
        this.inspectiondate = inspectiondate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Character getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Character activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public String getCurrrankid() {
        return currrankid;
    }

    public void setCurrrankid(String currrankid) {
        this.currrankid = currrankid;
    }

    @XmlTransient
    public List<Extinswfhistory> getExtinswfhistoryList() {
        return extinswfhistoryList;
    }

    public void setExtinswfhistoryList(List<Extinswfhistory> extinswfhistoryList) {
        this.extinswfhistoryList = extinswfhistoryList;
    }

    @XmlTransient
    public List<Extinspectiondetails> getExtinspectiondetailsList() {
        return extinspectiondetailsList;
    }

    public void setExtinspectiondetailsList(List<Extinspectiondetails> extinspectiondetailsList) {
        this.extinspectiondetailsList = extinspectiondetailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (extinsid != null ? extinsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extinspectionmaster)) {
            return false;
        }
        Extinspectionmaster other = (Extinspectionmaster) object;
        if ((this.extinsid == null && other.extinsid != null) || (this.extinsid != null && !this.extinsid.equals(other.extinsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Extinspectionmaster[ extinsid=" + extinsid + " ]";
    }
    
}
