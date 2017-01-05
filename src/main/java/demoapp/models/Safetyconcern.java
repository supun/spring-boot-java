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
@Table(name = "safetyconcern")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetyconcern.findAll", query = "SELECT s FROM Safetyconcern s")
    , @NamedQuery(name = "Safetyconcern.findById", query = "SELECT s FROM Safetyconcern s WHERE s.id = :id")
    , @NamedQuery(name = "Safetyconcern.findByAction", query = "SELECT s FROM Safetyconcern s WHERE s.action = :action")
    , @NamedQuery(name = "Safetyconcern.findByTargetdate", query = "SELECT s FROM Safetyconcern s WHERE s.targetdate = :targetdate")
    , @NamedQuery(name = "Safetyconcern.findBySafetyconcern", query = "SELECT s FROM Safetyconcern s WHERE s.safetyconcern = :safetyconcern")
    , @NamedQuery(name = "Safetyconcern.findByConcernstatus", query = "SELECT s FROM Safetyconcern s WHERE s.concernstatus = :concernstatus")
    , @NamedQuery(name = "Safetyconcern.findByAssigntouser", query = "SELECT s FROM Safetyconcern s WHERE s.assigntouser = :assigntouser")
    , @NamedQuery(name = "Safetyconcern.findByAssigntorank", query = "SELECT s FROM Safetyconcern s WHERE s.assigntorank = :assigntorank")})
public class Safetyconcern implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "action")
    private String action;
    @Column(name = "targetdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date targetdate;
    @Column(name = "safetyconcern")
    private String safetyconcern;
    @Column(name = "concernstatus")
    private Character concernstatus;
    @Column(name = "assigntouser")
    private String assigntouser;
    @Column(name = "assigntorank")
    private String assigntorank;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetyconcern() {
    }

    public Safetyconcern(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getTargetdate() {
        return targetdate;
    }

    public void setTargetdate(Date targetdate) {
        this.targetdate = targetdate;
    }

    public String getSafetyconcern() {
        return safetyconcern;
    }

    public void setSafetyconcern(String safetyconcern) {
        this.safetyconcern = safetyconcern;
    }

    public Character getConcernstatus() {
        return concernstatus;
    }

    public void setConcernstatus(Character concernstatus) {
        this.concernstatus = concernstatus;
    }

    public String getAssigntouser() {
        return assigntouser;
    }

    public void setAssigntouser(String assigntouser) {
        this.assigntouser = assigntouser;
    }

    public String getAssigntorank() {
        return assigntorank;
    }

    public void setAssigntorank(String assigntorank) {
        this.assigntorank = assigntorank;
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
        if (!(object instanceof Safetyconcern)) {
            return false;
        }
        Safetyconcern other = (Safetyconcern) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetyconcern[ id=" + id + " ]";
    }
    
}
