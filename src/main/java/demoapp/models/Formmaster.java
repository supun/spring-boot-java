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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "formmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formmaster.findAll", query = "SELECT f FROM Formmaster f")
    , @NamedQuery(name = "Formmaster.findByFmid", query = "SELECT f FROM Formmaster f WHERE f.fmid = :fmid")
    , @NamedQuery(name = "Formmaster.findByActFormno", query = "SELECT f FROM Formmaster f WHERE f.actFormno = :actFormno")
    , @NamedQuery(name = "Formmaster.findByActRevno", query = "SELECT f FROM Formmaster f WHERE f.actRevno = :actRevno")
    , @NamedQuery(name = "Formmaster.findByReviseddate", query = "SELECT f FROM Formmaster f WHERE f.reviseddate = :reviseddate")
    , @NamedQuery(name = "Formmaster.findByActiveStatus", query = "SELECT f FROM Formmaster f WHERE f.activeStatus = :activeStatus")
    , @NamedQuery(name = "Formmaster.findByCrdate", query = "SELECT f FROM Formmaster f WHERE f.crdate = :crdate")
    , @NamedQuery(name = "Formmaster.findByCruser", query = "SELECT f FROM Formmaster f WHERE f.cruser = :cruser")
    , @NamedQuery(name = "Formmaster.findByUpddate", query = "SELECT f FROM Formmaster f WHERE f.upddate = :upddate")
    , @NamedQuery(name = "Formmaster.findByUpduser", query = "SELECT f FROM Formmaster f WHERE f.upduser = :upduser")})
public class Formmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fmid")
    private Integer fmid;
    @Column(name = "act_formno")
    private String actFormno;
    @Column(name = "act_revno")
    private String actRevno;
    @Column(name = "reviseddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reviseddate;
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
    @OneToMany(mappedBy = "fmid")
    private List<Formhistory> formhistoryList;
    @JoinColumn(name = "mdlcode", referencedColumnName = "mdlcode")
    @ManyToOne
    private Modulecreation mdlcode;

    public Formmaster() {
    }

    public Formmaster(Integer fmid) {
        this.fmid = fmid;
    }

    public Integer getFmid() {
        return fmid;
    }

    public void setFmid(Integer fmid) {
        this.fmid = fmid;
    }

    public String getActFormno() {
        return actFormno;
    }

    public void setActFormno(String actFormno) {
        this.actFormno = actFormno;
    }

    public String getActRevno() {
        return actRevno;
    }

    public void setActRevno(String actRevno) {
        this.actRevno = actRevno;
    }

    public Date getReviseddate() {
        return reviseddate;
    }

    public void setReviseddate(Date reviseddate) {
        this.reviseddate = reviseddate;
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
    public List<Formhistory> getFormhistoryList() {
        return formhistoryList;
    }

    public void setFormhistoryList(List<Formhistory> formhistoryList) {
        this.formhistoryList = formhistoryList;
    }

    public Modulecreation getMdlcode() {
        return mdlcode;
    }

    public void setMdlcode(Modulecreation mdlcode) {
        this.mdlcode = mdlcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fmid != null ? fmid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formmaster)) {
            return false;
        }
        Formmaster other = (Formmaster) object;
        if ((this.fmid == null && other.fmid != null) || (this.fmid != null && !this.fmid.equals(other.fmid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Formmaster[ fmid=" + fmid + " ]";
    }
    
}
