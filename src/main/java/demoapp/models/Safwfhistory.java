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
@Table(name = "safwfhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safwfhistory.findAll", query = "SELECT s FROM Safwfhistory s")
    , @NamedQuery(name = "Safwfhistory.findById", query = "SELECT s FROM Safwfhistory s WHERE s.id = :id")
    , @NamedQuery(name = "Safwfhistory.findByUserid", query = "SELECT s FROM Safwfhistory s WHERE s.userid = :userid")
    , @NamedQuery(name = "Safwfhistory.findByRoleid", query = "SELECT s FROM Safwfhistory s WHERE s.roleid = :roleid")
    , @NamedQuery(name = "Safwfhistory.findBySenddate", query = "SELECT s FROM Safwfhistory s WHERE s.senddate = :senddate")
    , @NamedQuery(name = "Safwfhistory.findByUpddate", query = "SELECT s FROM Safwfhistory s WHERE s.upddate = :upddate")
    , @NamedQuery(name = "Safwfhistory.findByFormstatus", query = "SELECT s FROM Safwfhistory s WHERE s.formstatus = :formstatus")})
public class Safwfhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
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
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safwfhistory() {
    }

    public Safwfhistory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Safwfhistory)) {
            return false;
        }
        Safwfhistory other = (Safwfhistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safwfhistory[ id=" + id + " ]";
    }
    
}
