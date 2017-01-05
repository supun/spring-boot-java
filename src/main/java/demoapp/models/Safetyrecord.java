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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "safetyrecord")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetyrecord.findAll", query = "SELECT s FROM Safetyrecord s")
    , @NamedQuery(name = "Safetyrecord.findById", query = "SELECT s FROM Safetyrecord s WHERE s.id = :id")
    , @NamedQuery(name = "Safetyrecord.findByRecordtype", query = "SELECT s FROM Safetyrecord s WHERE s.recordtype = :recordtype")
    , @NamedQuery(name = "Safetyrecord.findByInjurydate", query = "SELECT s FROM Safetyrecord s WHERE s.injurydate = :injurydate")
    , @NamedQuery(name = "Safetyrecord.findByName", query = "SELECT s FROM Safetyrecord s WHERE s.name = :name")
    , @NamedQuery(name = "Safetyrecord.findByRoleid", query = "SELECT s FROM Safetyrecord s WHERE s.roleid = :roleid")
    , @NamedQuery(name = "Safetyrecord.findByInjurydetail", query = "SELECT s FROM Safetyrecord s WHERE s.injurydetail = :injurydetail")
    , @NamedQuery(name = "Safetyrecord.findByTreatment", query = "SELECT s FROM Safetyrecord s WHERE s.treatment = :treatment")
    , @NamedQuery(name = "Safetyrecord.findByLosttimeinjury", query = "SELECT s FROM Safetyrecord s WHERE s.losttimeinjury = :losttimeinjury")
    , @NamedQuery(name = "Safetyrecord.findByIslostitmeinjury", query = "SELECT s FROM Safetyrecord s WHERE s.islostitmeinjury = :islostitmeinjury")})
public class Safetyrecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "recordtype")
    private String recordtype;
    @Column(name = "injurydate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date injurydate;
    @Column(name = "name")
    private String name;
    @Column(name = "roleid")
    private String roleid;
    @Column(name = "injurydetail")
    private String injurydetail;
    @Column(name = "treatment")
    private String treatment;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "losttimeinjury")
    private Float losttimeinjury;
    @Column(name = "islostitmeinjury")
    private Character islostitmeinjury;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetyrecord() {
    }

    public Safetyrecord(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(String recordtype) {
        this.recordtype = recordtype;
    }

    public Date getInjurydate() {
        return injurydate;
    }

    public void setInjurydate(Date injurydate) {
        this.injurydate = injurydate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getInjurydetail() {
        return injurydetail;
    }

    public void setInjurydetail(String injurydetail) {
        this.injurydetail = injurydetail;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Float getLosttimeinjury() {
        return losttimeinjury;
    }

    public void setLosttimeinjury(Float losttimeinjury) {
        this.losttimeinjury = losttimeinjury;
    }

    public Character getIslostitmeinjury() {
        return islostitmeinjury;
    }

    public void setIslostitmeinjury(Character islostitmeinjury) {
        this.islostitmeinjury = islostitmeinjury;
    }

    public Safetymeetingmaster getSafid() {
        return safid;
    }

    public void setSafid(Safetymeetingmaster safid) {
        this.safid = safid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Safetyrecord)) {
            return false;
        }
        Safetyrecord other = (Safetyrecord) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetyrecord[ id=" + id + " ]";
    }
    
}
