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
@Table(name = "crewmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crewmaster.findAll", query = "SELECT c FROM Crewmaster c")
    , @NamedQuery(name = "Crewmaster.findByEmpid", query = "SELECT c FROM Crewmaster c WHERE c.empid = :empid")
    , @NamedQuery(name = "Crewmaster.findByEmpname", query = "SELECT c FROM Crewmaster c WHERE c.empname = :empname")
    , @NamedQuery(name = "Crewmaster.findByFirstname", query = "SELECT c FROM Crewmaster c WHERE c.firstname = :firstname")
    , @NamedQuery(name = "Crewmaster.findByLastname", query = "SELECT c FROM Crewmaster c WHERE c.lastname = :lastname")
    , @NamedQuery(name = "Crewmaster.findByMiddlename", query = "SELECT c FROM Crewmaster c WHERE c.middlename = :middlename")
    , @NamedQuery(name = "Crewmaster.findBySex", query = "SELECT c FROM Crewmaster c WHERE c.sex = :sex")
    , @NamedQuery(name = "Crewmaster.findByEmail", query = "SELECT c FROM Crewmaster c WHERE c.email = :email")
    , @NamedQuery(name = "Crewmaster.findByEpassword", query = "SELECT c FROM Crewmaster c WHERE c.epassword = :epassword")
    , @NamedQuery(name = "Crewmaster.findByLoginExpiry", query = "SELECT c FROM Crewmaster c WHERE c.loginExpiry = :loginExpiry")
    , @NamedQuery(name = "Crewmaster.findByLastlogindate", query = "SELECT c FROM Crewmaster c WHERE c.lastlogindate = :lastlogindate")
    , @NamedQuery(name = "Crewmaster.findByElanguage", query = "SELECT c FROM Crewmaster c WHERE c.elanguage = :elanguage")
    , @NamedQuery(name = "Crewmaster.findByChatenabled", query = "SELECT c FROM Crewmaster c WHERE c.chatenabled = :chatenabled")
    , @NamedQuery(name = "Crewmaster.findByDateofbirth", query = "SELECT c FROM Crewmaster c WHERE c.dateofbirth = :dateofbirth")
    , @NamedQuery(name = "Crewmaster.findByPlaceofbirth", query = "SELECT c FROM Crewmaster c WHERE c.placeofbirth = :placeofbirth")
    , @NamedQuery(name = "Crewmaster.findByNationality", query = "SELECT c FROM Crewmaster c WHERE c.nationality = :nationality")
    , @NamedQuery(name = "Crewmaster.findByPassportnumber", query = "SELECT c FROM Crewmaster c WHERE c.passportnumber = :passportnumber")
    , @NamedQuery(name = "Crewmaster.findByPassportexpiry", query = "SELECT c FROM Crewmaster c WHERE c.passportexpiry = :passportexpiry")
    , @NamedQuery(name = "Crewmaster.findByMediccertIssued", query = "SELECT c FROM Crewmaster c WHERE c.mediccertIssued = :mediccertIssued")
    , @NamedQuery(name = "Crewmaster.findByMediccertExpiry", query = "SELECT c FROM Crewmaster c WHERE c.mediccertExpiry = :mediccertExpiry")
    , @NamedQuery(name = "Crewmaster.findBySeamansNumber", query = "SELECT c FROM Crewmaster c WHERE c.seamansNumber = :seamansNumber")
    , @NamedQuery(name = "Crewmaster.findBySeamansExpiry", query = "SELECT c FROM Crewmaster c WHERE c.seamansExpiry = :seamansExpiry")
    , @NamedQuery(name = "Crewmaster.findByDoj", query = "SELECT c FROM Crewmaster c WHERE c.doj = :doj")
    , @NamedQuery(name = "Crewmaster.findByContractExpiry", query = "SELECT c FROM Crewmaster c WHERE c.contractExpiry = :contractExpiry")
    , @NamedQuery(name = "Crewmaster.findByRemarks", query = "SELECT c FROM Crewmaster c WHERE c.remarks = :remarks")
    , @NamedQuery(name = "Crewmaster.findByActiveStatus", query = "SELECT c FROM Crewmaster c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Crewmaster.findByCruser", query = "SELECT c FROM Crewmaster c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Crewmaster.findByCrdate", query = "SELECT c FROM Crewmaster c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Crewmaster.findByUpduser", query = "SELECT c FROM Crewmaster c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Crewmaster.findByUpddate", query = "SELECT c FROM Crewmaster c WHERE c.upddate = :upddate")})
public class Crewmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "empid")
    private String empid;
    @Column(name = "empname")
    private String empname;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "middlename")
    private String middlename;
    @Column(name = "sex")
    private Character sex;
    @Column(name = "email")
    private String email;
    @Column(name = "epassword")
    private String epassword;
    @Column(name = "login_expiry")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginExpiry;
    @Column(name = "lastlogindate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastlogindate;
    @Column(name = "elanguage")
    private String elanguage;
    @Column(name = "chatenabled")
    private Character chatenabled;
    @Column(name = "dateofbirth")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbirth;
    @Column(name = "placeofbirth")
    private String placeofbirth;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "passportnumber")
    private String passportnumber;
    @Column(name = "passportexpiry")
    @Temporal(TemporalType.TIMESTAMP)
    private Date passportexpiry;
    @Column(name = "mediccert_issued")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mediccertIssued;
    @Column(name = "mediccert_expiry")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mediccertExpiry;
    @Column(name = "seamans_number")
    private String seamansNumber;
    @Column(name = "seamans_expiry")
    @Temporal(TemporalType.TIMESTAMP)
    private Date seamansExpiry;
    @Column(name = "doj")
    @Temporal(TemporalType.TIMESTAMP)
    private Date doj;
    @Column(name = "contract_expiry")
    @Temporal(TemporalType.TIMESTAMP)
    private Date contractExpiry;
    @Column(name = "Remarks")
    private String remarks;
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
    @JoinColumn(name = "rankcode", referencedColumnName = "rankcode")
    @ManyToOne
    private Rankmaster rankcode;
    @JoinColumn(name = "vesselcode", referencedColumnName = "vesselcode")
    @ManyToOne
    private Vesselmaster vesselcode;

    public Crewmaster() {
    }

    public Crewmaster(String empid) {
        this.empid = empid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }

    public Date getLoginExpiry() {
        return loginExpiry;
    }

    public void setLoginExpiry(Date loginExpiry) {
        this.loginExpiry = loginExpiry;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public String getElanguage() {
        return elanguage;
    }

    public void setElanguage(String elanguage) {
        this.elanguage = elanguage;
    }

    public Character getChatenabled() {
        return chatenabled;
    }

    public void setChatenabled(Character chatenabled) {
        this.chatenabled = chatenabled;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassportnumber() {
        return passportnumber;
    }

    public void setPassportnumber(String passportnumber) {
        this.passportnumber = passportnumber;
    }

    public Date getPassportexpiry() {
        return passportexpiry;
    }

    public void setPassportexpiry(Date passportexpiry) {
        this.passportexpiry = passportexpiry;
    }

    public Date getMediccertIssued() {
        return mediccertIssued;
    }

    public void setMediccertIssued(Date mediccertIssued) {
        this.mediccertIssued = mediccertIssued;
    }

    public Date getMediccertExpiry() {
        return mediccertExpiry;
    }

    public void setMediccertExpiry(Date mediccertExpiry) {
        this.mediccertExpiry = mediccertExpiry;
    }

    public String getSeamansNumber() {
        return seamansNumber;
    }

    public void setSeamansNumber(String seamansNumber) {
        this.seamansNumber = seamansNumber;
    }

    public Date getSeamansExpiry() {
        return seamansExpiry;
    }

    public void setSeamansExpiry(Date seamansExpiry) {
        this.seamansExpiry = seamansExpiry;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Date getContractExpiry() {
        return contractExpiry;
    }

    public void setContractExpiry(Date contractExpiry) {
        this.contractExpiry = contractExpiry;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Rankmaster getRankcode() {
        return rankcode;
    }

    public void setRankcode(Rankmaster rankcode) {
        this.rankcode = rankcode;
    }

    public Vesselmaster getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(Vesselmaster vesselcode) {
        this.vesselcode = vesselcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empid != null ? empid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crewmaster)) {
            return false;
        }
        Crewmaster other = (Crewmaster) object;
        if ((this.empid == null && other.empid != null) || (this.empid != null && !this.empid.equals(other.empid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Crewmaster[ empid=" + empid + " ]";
    }
    
}
