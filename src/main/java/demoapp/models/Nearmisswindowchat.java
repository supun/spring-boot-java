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
@Table(name = "nearmisswindowchat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmisswindowchat.findAll", query = "SELECT n FROM Nearmisswindowchat n")
    , @NamedQuery(name = "Nearmisswindowchat.findById", query = "SELECT n FROM Nearmisswindowchat n WHERE n.id = :id")
    , @NamedQuery(name = "Nearmisswindowchat.findByCreatedOn", query = "SELECT n FROM Nearmisswindowchat n WHERE n.createdOn = :createdOn")
    , @NamedQuery(name = "Nearmisswindowchat.findByModifiedOn", query = "SELECT n FROM Nearmisswindowchat n WHERE n.modifiedOn = :modifiedOn")
    , @NamedQuery(name = "Nearmisswindowchat.findByMsg", query = "SELECT n FROM Nearmisswindowchat n WHERE n.msg = :msg")
    , @NamedQuery(name = "Nearmisswindowchat.findByNearMissRecordId", query = "SELECT n FROM Nearmisswindowchat n WHERE n.nearMissRecordId = :nearMissRecordId")
    , @NamedQuery(name = "Nearmisswindowchat.findByVesselCode", query = "SELECT n FROM Nearmisswindowchat n WHERE n.vesselCode = :vesselCode")})
public class Nearmisswindowchat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "msg")
    private String msg;
    @Column(name = "near_miss_record_id")
    private String nearMissRecordId;
    @Column(name = "vessel_code")
    private String vesselCode;

    public Nearmisswindowchat() {
    }

    public Nearmisswindowchat(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNearMissRecordId() {
        return nearMissRecordId;
    }

    public void setNearMissRecordId(String nearMissRecordId) {
        this.nearMissRecordId = nearMissRecordId;
    }

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
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
        if (!(object instanceof Nearmisswindowchat)) {
            return false;
        }
        Nearmisswindowchat other = (Nearmisswindowchat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmisswindowchat[ id=" + id + " ]";
    }
    
}
