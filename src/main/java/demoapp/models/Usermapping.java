/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "usermapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usermapping.findAll", query = "SELECT u FROM Usermapping u")
    , @NamedQuery(name = "Usermapping.findById", query = "SELECT u FROM Usermapping u WHERE u.usermappingPK.id = :id")
    , @NamedQuery(name = "Usermapping.findByUlid", query = "SELECT u FROM Usermapping u WHERE u.usermappingPK.ulid = :ulid")
    , @NamedQuery(name = "Usermapping.findByModuleid", query = "SELECT u FROM Usermapping u WHERE u.moduleid = :moduleid")
    , @NamedQuery(name = "Usermapping.findByParentmoduleid", query = "SELECT u FROM Usermapping u WHERE u.parentmoduleid = :parentmoduleid")
    , @NamedQuery(name = "Usermapping.findByActiveStatus", query = "SELECT u FROM Usermapping u WHERE u.activeStatus = :activeStatus")
    , @NamedQuery(name = "Usermapping.findByCruser", query = "SELECT u FROM Usermapping u WHERE u.cruser = :cruser")
    , @NamedQuery(name = "Usermapping.findByCrdate", query = "SELECT u FROM Usermapping u WHERE u.crdate = :crdate")
    , @NamedQuery(name = "Usermapping.findByUpduser", query = "SELECT u FROM Usermapping u WHERE u.upduser = :upduser")
    , @NamedQuery(name = "Usermapping.findByUpddate", query = "SELECT u FROM Usermapping u WHERE u.upddate = :upddate")})
public class Usermapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsermappingPK usermappingPK;
    @Column(name = "moduleid")
    private String moduleid;
    @Column(name = "parentmoduleid")
    private String parentmoduleid;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "cruser")
    private Integer cruser;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "upduser")
    private Integer upduser;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;

    public Usermapping() {
    }

    public Usermapping(UsermappingPK usermappingPK) {
        this.usermappingPK = usermappingPK;
    }

    public Usermapping(int id, int ulid) {
        this.usermappingPK = new UsermappingPK(id, ulid);
    }

    public UsermappingPK getUsermappingPK() {
        return usermappingPK;
    }

    public void setUsermappingPK(UsermappingPK usermappingPK) {
        this.usermappingPK = usermappingPK;
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    public String getParentmoduleid() {
        return parentmoduleid;
    }

    public void setParentmoduleid(String parentmoduleid) {
        this.parentmoduleid = parentmoduleid;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Integer getCruser() {
        return cruser;
    }

    public void setCruser(Integer cruser) {
        this.cruser = cruser;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public Integer getUpduser() {
        return upduser;
    }

    public void setUpduser(Integer upduser) {
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
        hash += (usermappingPK != null ? usermappingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usermapping)) {
            return false;
        }
        Usermapping other = (Usermapping) object;
        if ((this.usermappingPK == null && other.usermappingPK != null) || (this.usermappingPK != null && !this.usermappingPK.equals(other.usermappingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Usermapping[ usermappingPK=" + usermappingPK + " ]";
    }
    
}
