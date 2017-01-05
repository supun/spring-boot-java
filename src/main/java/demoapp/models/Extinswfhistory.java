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
@Table(name = "extinswfhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extinswfhistory.findAll", query = "SELECT e FROM Extinswfhistory e")
    , @NamedQuery(name = "Extinswfhistory.findByVslhstid", query = "SELECT e FROM Extinswfhistory e WHERE e.vslhstid = :vslhstid")
    , @NamedQuery(name = "Extinswfhistory.findByUserid", query = "SELECT e FROM Extinswfhistory e WHERE e.userid = :userid")
    , @NamedQuery(name = "Extinswfhistory.findByRoleid", query = "SELECT e FROM Extinswfhistory e WHERE e.roleid = :roleid")
    , @NamedQuery(name = "Extinswfhistory.findBySenddate", query = "SELECT e FROM Extinswfhistory e WHERE e.senddate = :senddate")
    , @NamedQuery(name = "Extinswfhistory.findByUpddate", query = "SELECT e FROM Extinswfhistory e WHERE e.upddate = :upddate")
    , @NamedQuery(name = "Extinswfhistory.findByFormstatus", query = "SELECT e FROM Extinswfhistory e WHERE e.formstatus = :formstatus")})
public class Extinswfhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "vslhstid")
    private String vslhstid;
    @Column(name = "userid")
    private String userid;
    @Column(name = "roleid")
    private String roleid;
    @Column(name = "senddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date senddate;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;
    @Column(name = "formstatus")
    private Character formstatus;
    @JoinColumn(name = "extinsid", referencedColumnName = "extinsid")
    @ManyToOne
    private Extinspectionmaster extinsid;

    public Extinswfhistory() {
    }

    public Extinswfhistory(String vslhstid) {
        this.vslhstid = vslhstid;
    }

    public String getVslhstid() {
        return vslhstid;
    }

    public void setVslhstid(String vslhstid) {
        this.vslhstid = vslhstid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public Character getFormstatus() {
        return formstatus;
    }

    public void setFormstatus(Character formstatus) {
        this.formstatus = formstatus;
    }

    public Extinspectionmaster getExtinsid() {
        return extinsid;
    }

    public void setExtinsid(Extinspectionmaster extinsid) {
        this.extinsid = extinsid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vslhstid != null ? vslhstid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extinswfhistory)) {
            return false;
        }
        Extinswfhistory other = (Extinswfhistory) object;
        if ((this.vslhstid == null && other.vslhstid != null) || (this.vslhstid != null && !this.vslhstid.equals(other.vslhstid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Extinswfhistory[ vslhstid=" + vslhstid + " ]";
    }
    
}
