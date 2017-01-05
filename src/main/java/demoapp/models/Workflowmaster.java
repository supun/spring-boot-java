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
@Table(name = "workflowmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Workflowmaster.findAll", query = "SELECT w FROM Workflowmaster w")
    , @NamedQuery(name = "Workflowmaster.findByWfmid", query = "SELECT w FROM Workflowmaster w WHERE w.wfmid = :wfmid")
    , @NamedQuery(name = "Workflowmaster.findByFormid", query = "SELECT w FROM Workflowmaster w WHERE w.formid = :formid")
    , @NamedQuery(name = "Workflowmaster.findByFormname", query = "SELECT w FROM Workflowmaster w WHERE w.formname = :formname")
    , @NamedQuery(name = "Workflowmaster.findByActiveStatus", query = "SELECT w FROM Workflowmaster w WHERE w.activeStatus = :activeStatus")
    , @NamedQuery(name = "Workflowmaster.findByCrdate", query = "SELECT w FROM Workflowmaster w WHERE w.crdate = :crdate")
    , @NamedQuery(name = "Workflowmaster.findByCruser", query = "SELECT w FROM Workflowmaster w WHERE w.cruser = :cruser")
    , @NamedQuery(name = "Workflowmaster.findByUpddate", query = "SELECT w FROM Workflowmaster w WHERE w.upddate = :upddate")
    , @NamedQuery(name = "Workflowmaster.findByUpduser", query = "SELECT w FROM Workflowmaster w WHERE w.upduser = :upduser")})
public class Workflowmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "wfmid")
    private Integer wfmid;
    @Column(name = "formid")
    private String formid;
    @Column(name = "formname")
    private String formname;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "cruser")
    private String cruser;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;
    @Column(name = "upduser")
    private String upduser;
    @OneToMany(mappedBy = "wfmid")
    private List<Workflowdetail> workflowdetailList;

    public Workflowmaster() {
    }

    public Workflowmaster(Integer wfmid) {
        this.wfmid = wfmid;
    }

    public Integer getWfmid() {
        return wfmid;
    }

    public void setWfmid(Integer wfmid) {
        this.wfmid = wfmid;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        this.formname = formname;
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

    public String getCruser() {
        return cruser;
    }

    public void setCruser(String cruser) {
        this.cruser = cruser;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public String getUpduser() {
        return upduser;
    }

    public void setUpduser(String upduser) {
        this.upduser = upduser;
    }

    @XmlTransient
    public List<Workflowdetail> getWorkflowdetailList() {
        return workflowdetailList;
    }

    public void setWorkflowdetailList(List<Workflowdetail> workflowdetailList) {
        this.workflowdetailList = workflowdetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wfmid != null ? wfmid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workflowmaster)) {
            return false;
        }
        Workflowmaster other = (Workflowmaster) object;
        if ((this.wfmid == null && other.wfmid != null) || (this.wfmid != null && !this.wfmid.equals(other.wfmid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Workflowmaster[ wfmid=" + wfmid + " ]";
    }
    
}
