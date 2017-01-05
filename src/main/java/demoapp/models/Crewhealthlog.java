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
@Table(name = "crewhealthlog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crewhealthlog.findAll", query = "SELECT c FROM Crewhealthlog c")
    , @NamedQuery(name = "Crewhealthlog.findBySerialnumber", query = "SELECT c FROM Crewhealthlog c WHERE c.serialnumber = :serialnumber")
    , @NamedQuery(name = "Crewhealthlog.findByFormnumber", query = "SELECT c FROM Crewhealthlog c WHERE c.formnumber = :formnumber")
    , @NamedQuery(name = "Crewhealthlog.findByVessel", query = "SELECT c FROM Crewhealthlog c WHERE c.vessel = :vessel")
    , @NamedQuery(name = "Crewhealthlog.findByRole", query = "SELECT c FROM Crewhealthlog c WHERE c.role = :role")
    , @NamedQuery(name = "Crewhealthlog.findByName", query = "SELECT c FROM Crewhealthlog c WHERE c.name = :name")
    , @NamedQuery(name = "Crewhealthlog.findByAge", query = "SELECT c FROM Crewhealthlog c WHERE c.age = :age")
    , @NamedQuery(name = "Crewhealthlog.findByNationality", query = "SELECT c FROM Crewhealthlog c WHERE c.nationality = :nationality")
    , @NamedQuery(name = "Crewhealthlog.findBySex", query = "SELECT c FROM Crewhealthlog c WHERE c.sex = :sex")
    , @NamedQuery(name = "Crewhealthlog.findByHeightmtrs", query = "SELECT c FROM Crewhealthlog c WHERE c.heightmtrs = :heightmtrs")
    , @NamedQuery(name = "Crewhealthlog.findByWeightmtrs", query = "SELECT c FROM Crewhealthlog c WHERE c.weightmtrs = :weightmtrs")
    , @NamedQuery(name = "Crewhealthlog.findByBloodpressure", query = "SELECT c FROM Crewhealthlog c WHERE c.bloodpressure = :bloodpressure")
    , @NamedQuery(name = "Crewhealthlog.findByPulserate", query = "SELECT c FROM Crewhealthlog c WHERE c.pulserate = :pulserate")
    , @NamedQuery(name = "Crewhealthlog.findByDatehealth", query = "SELECT c FROM Crewhealthlog c WHERE c.datehealth = :datehealth")
    , @NamedQuery(name = "Crewhealthlog.findByBloodPressureLevelSecurity", query = "SELECT c FROM Crewhealthlog c WHERE c.bloodPressureLevelSecurity = :bloodPressureLevelSecurity")
    , @NamedQuery(name = "Crewhealthlog.findByUrinalysis", query = "SELECT c FROM Crewhealthlog c WHERE c.urinalysis = :urinalysis")
    , @NamedQuery(name = "Crewhealthlog.findByBodymassindex", query = "SELECT c FROM Crewhealthlog c WHERE c.bodymassindex = :bodymassindex")
    , @NamedQuery(name = "Crewhealthlog.findByBmicondition", query = "SELECT c FROM Crewhealthlog c WHERE c.bmicondition = :bmicondition")
    , @NamedQuery(name = "Crewhealthlog.findByNecknarrowestcm", query = "SELECT c FROM Crewhealthlog c WHERE c.necknarrowestcm = :necknarrowestcm")
    , @NamedQuery(name = "Crewhealthlog.findByWaist", query = "SELECT c FROM Crewhealthlog c WHERE c.waist = :waist")
    , @NamedQuery(name = "Crewhealthlog.findByBodyfat", query = "SELECT c FROM Crewhealthlog c WHERE c.bodyfat = :bodyfat")
    , @NamedQuery(name = "Crewhealthlog.findByBodyfatevaluation", query = "SELECT c FROM Crewhealthlog c WHERE c.bodyfatevaluation = :bodyfatevaluation")
    , @NamedQuery(name = "Crewhealthlog.findByWhatisyoutargetbmi", query = "SELECT c FROM Crewhealthlog c WHERE c.whatisyoutargetbmi = :whatisyoutargetbmi")
    , @NamedQuery(name = "Crewhealthlog.findByMedicalofficername", query = "SELECT c FROM Crewhealthlog c WHERE c.medicalofficername = :medicalofficername")
    , @NamedQuery(name = "Crewhealthlog.findByMastername", query = "SELECT c FROM Crewhealthlog c WHERE c.mastername = :mastername")
    , @NamedQuery(name = "Crewhealthlog.findByActiveStatus", query = "SELECT c FROM Crewhealthlog c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Crewhealthlog.findByCruser", query = "SELECT c FROM Crewhealthlog c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Crewhealthlog.findByCrdate", query = "SELECT c FROM Crewhealthlog c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Crewhealthlog.findByUpduser", query = "SELECT c FROM Crewhealthlog c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Crewhealthlog.findByUpddate", query = "SELECT c FROM Crewhealthlog c WHERE c.upddate = :upddate")})
public class Crewhealthlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "serialnumber")
    private String serialnumber;
    @Column(name = "formnumber")
    private String formnumber;
    @Column(name = "vessel")
    private String vessel;
    @Column(name = "role")
    private String role;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private String age;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "sex")
    private String sex;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "heightmtrs")
    private Float heightmtrs;
    @Column(name = "weightmtrs")
    private Float weightmtrs;
    @Column(name = "bloodpressure")
    private Float bloodpressure;
    @Column(name = "pulserate")
    private Float pulserate;
    @Column(name = "datehealth")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datehealth;
    @Column(name = "Blood Pressure Level Security")
    private Integer bloodPressureLevelSecurity;
    @Column(name = "urinalysis")
    private String urinalysis;
    @Column(name = "bodymassindex")
    private Integer bodymassindex;
    @Column(name = "bmicondition")
    private String bmicondition;
    @Column(name = "necknarrowestcm")
    private Float necknarrowestcm;
    @Column(name = "waist")
    private Float waist;
    @Column(name = "bodyfat")
    private String bodyfat;
    @Column(name = "bodyfatevaluation")
    private Float bodyfatevaluation;
    @Column(name = "whatisyoutargetbmi")
    private String whatisyoutargetbmi;
    @Column(name = "medicalofficername")
    private String medicalofficername;
    @Column(name = "mastername")
    private String mastername;
    @Column(name = "active_status")
    private String activeStatus;
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

    public Crewhealthlog() {
    }

    public Crewhealthlog(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getFormnumber() {
        return formnumber;
    }

    public void setFormnumber(String formnumber) {
        this.formnumber = formnumber;
    }

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Float getHeightmtrs() {
        return heightmtrs;
    }

    public void setHeightmtrs(Float heightmtrs) {
        this.heightmtrs = heightmtrs;
    }

    public Float getWeightmtrs() {
        return weightmtrs;
    }

    public void setWeightmtrs(Float weightmtrs) {
        this.weightmtrs = weightmtrs;
    }

    public Float getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(Float bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public Float getPulserate() {
        return pulserate;
    }

    public void setPulserate(Float pulserate) {
        this.pulserate = pulserate;
    }

    public Date getDatehealth() {
        return datehealth;
    }

    public void setDatehealth(Date datehealth) {
        this.datehealth = datehealth;
    }

    public Integer getBloodPressureLevelSecurity() {
        return bloodPressureLevelSecurity;
    }

    public void setBloodPressureLevelSecurity(Integer bloodPressureLevelSecurity) {
        this.bloodPressureLevelSecurity = bloodPressureLevelSecurity;
    }

    public String getUrinalysis() {
        return urinalysis;
    }

    public void setUrinalysis(String urinalysis) {
        this.urinalysis = urinalysis;
    }

    public Integer getBodymassindex() {
        return bodymassindex;
    }

    public void setBodymassindex(Integer bodymassindex) {
        this.bodymassindex = bodymassindex;
    }

    public String getBmicondition() {
        return bmicondition;
    }

    public void setBmicondition(String bmicondition) {
        this.bmicondition = bmicondition;
    }

    public Float getNecknarrowestcm() {
        return necknarrowestcm;
    }

    public void setNecknarrowestcm(Float necknarrowestcm) {
        this.necknarrowestcm = necknarrowestcm;
    }

    public Float getWaist() {
        return waist;
    }

    public void setWaist(Float waist) {
        this.waist = waist;
    }

    public String getBodyfat() {
        return bodyfat;
    }

    public void setBodyfat(String bodyfat) {
        this.bodyfat = bodyfat;
    }

    public Float getBodyfatevaluation() {
        return bodyfatevaluation;
    }

    public void setBodyfatevaluation(Float bodyfatevaluation) {
        this.bodyfatevaluation = bodyfatevaluation;
    }

    public String getWhatisyoutargetbmi() {
        return whatisyoutargetbmi;
    }

    public void setWhatisyoutargetbmi(String whatisyoutargetbmi) {
        this.whatisyoutargetbmi = whatisyoutargetbmi;
    }

    public String getMedicalofficername() {
        return medicalofficername;
    }

    public void setMedicalofficername(String medicalofficername) {
        this.medicalofficername = medicalofficername;
    }

    public String getMastername() {
        return mastername;
    }

    public void setMastername(String mastername) {
        this.mastername = mastername;
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
        hash += (serialnumber != null ? serialnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crewhealthlog)) {
            return false;
        }
        Crewhealthlog other = (Crewhealthlog) object;
        if ((this.serialnumber == null && other.serialnumber != null) || (this.serialnumber != null && !this.serialnumber.equals(other.serialnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Crewhealthlog[ serialnumber=" + serialnumber + " ]";
    }
    
}
