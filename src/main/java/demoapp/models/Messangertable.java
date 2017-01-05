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
@Table(name = "messangertable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messangertable.findAll", query = "SELECT m FROM Messangertable m")
    , @NamedQuery(name = "Messangertable.findByReferenceno", query = "SELECT m FROM Messangertable m WHERE m.referenceno = :referenceno")
    , @NamedQuery(name = "Messangertable.findById", query = "SELECT m FROM Messangertable m WHERE m.id = :id")
    , @NamedQuery(name = "Messangertable.findByUserid", query = "SELECT m FROM Messangertable m WHERE m.userid = :userid")
    , @NamedQuery(name = "Messangertable.findByMessagedescription", query = "SELECT m FROM Messangertable m WHERE m.messagedescription = :messagedescription")
    , @NamedQuery(name = "Messangertable.findByMessagedate", query = "SELECT m FROM Messangertable m WHERE m.messagedate = :messagedate")
    , @NamedQuery(name = "Messangertable.findByMessagefrom", query = "SELECT m FROM Messangertable m WHERE m.messagefrom = :messagefrom")
    , @NamedQuery(name = "Messangertable.findByVesselcode", query = "SELECT m FROM Messangertable m WHERE m.vesselcode = :vesselcode")
    , @NamedQuery(name = "Messangertable.findByModuleid", query = "SELECT m FROM Messangertable m WHERE m.moduleid = :moduleid")
    , @NamedQuery(name = "Messangertable.findByIsRead", query = "SELECT m FROM Messangertable m WHERE m.isRead = :isRead")
    , @NamedQuery(name = "Messangertable.findByStatus", query = "SELECT m FROM Messangertable m WHERE m.status = :status")})
public class Messangertable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "referenceno")
    private String referenceno;
    @Column(name = "id")
    private Integer id;
    @Column(name = "userid")
    private String userid;
    @Column(name = "messagedescription")
    private String messagedescription;
    @Column(name = "messagedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messagedate;
    @Column(name = "messagefrom")
    private String messagefrom;
    @Column(name = "vesselcode")
    private String vesselcode;
    @Column(name = "moduleid")
    private String moduleid;
    @Column(name = "isRead")
    private Character isRead;
    @Column(name = "status")
    private String status;

    public Messangertable() {
    }

    public Messangertable(String referenceno) {
        this.referenceno = referenceno;
    }

    public String getReferenceno() {
        return referenceno;
    }

    public void setReferenceno(String referenceno) {
        this.referenceno = referenceno;
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

    public String getMessagedescription() {
        return messagedescription;
    }

    public void setMessagedescription(String messagedescription) {
        this.messagedescription = messagedescription;
    }

    public Date getMessagedate() {
        return messagedate;
    }

    public void setMessagedate(Date messagedate) {
        this.messagedate = messagedate;
    }

    public String getMessagefrom() {
        return messagefrom;
    }

    public void setMessagefrom(String messagefrom) {
        this.messagefrom = messagefrom;
    }

    public String getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    public Character getIsRead() {
        return isRead;
    }

    public void setIsRead(Character isRead) {
        this.isRead = isRead;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referenceno != null ? referenceno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messangertable)) {
            return false;
        }
        Messangertable other = (Messangertable) object;
        if ((this.referenceno == null && other.referenceno != null) || (this.referenceno != null && !this.referenceno.equals(other.referenceno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Messangertable[ referenceno=" + referenceno + " ]";
    }
    
}
