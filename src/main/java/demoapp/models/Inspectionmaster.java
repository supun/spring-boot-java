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
@Table(name = "inspectionmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inspectionmaster.findAll", query = "SELECT i FROM Inspectionmaster i")
    , @NamedQuery(name = "Inspectionmaster.findByInspectioncode", query = "SELECT i FROM Inspectionmaster i WHERE i.inspectioncode = :inspectioncode")
    , @NamedQuery(name = "Inspectionmaster.findByInspectiontype", query = "SELECT i FROM Inspectionmaster i WHERE i.inspectiontype = :inspectiontype")
    , @NamedQuery(name = "Inspectionmaster.findByInspectionname", query = "SELECT i FROM Inspectionmaster i WHERE i.inspectionname = :inspectionname")
    , @NamedQuery(name = "Inspectionmaster.findByActiveStatus", query = "SELECT i FROM Inspectionmaster i WHERE i.activeStatus = :activeStatus")
    , @NamedQuery(name = "Inspectionmaster.findByCruser", query = "SELECT i FROM Inspectionmaster i WHERE i.cruser = :cruser")
    , @NamedQuery(name = "Inspectionmaster.findByCrdate", query = "SELECT i FROM Inspectionmaster i WHERE i.crdate = :crdate")
    , @NamedQuery(name = "Inspectionmaster.findByUpduser", query = "SELECT i FROM Inspectionmaster i WHERE i.upduser = :upduser")
    , @NamedQuery(name = "Inspectionmaster.findByUpddate", query = "SELECT i FROM Inspectionmaster i WHERE i.upddate = :upddate")})
public class Inspectionmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "inspectioncode")
    private String inspectioncode;
    @Column(name = "inspectiontype")
    private String inspectiontype;
    @Column(name = "inspectionname")
    private String inspectionname;
    @Column(name = "active_status")
    private Character activeStatus;
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

    public Inspectionmaster() {
    }

    public Inspectionmaster(String inspectioncode) {
        this.inspectioncode = inspectioncode;
    }

    public String getInspectioncode() {
        return inspectioncode;
    }

    public void setInspectioncode(String inspectioncode) {
        this.inspectioncode = inspectioncode;
    }

    public String getInspectiontype() {
        return inspectiontype;
    }

    public void setInspectiontype(String inspectiontype) {
        this.inspectiontype = inspectiontype;
    }

    public String getInspectionname() {
        return inspectionname;
    }

    public void setInspectionname(String inspectionname) {
        this.inspectionname = inspectionname;
    }

    public Character getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Character activeStatus) {
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
        hash += (inspectioncode != null ? inspectioncode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inspectionmaster)) {
            return false;
        }
        Inspectionmaster other = (Inspectionmaster) object;
        if ((this.inspectioncode == null && other.inspectioncode != null) || (this.inspectioncode != null && !this.inspectioncode.equals(other.inspectioncode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Inspectionmaster[ inspectioncode=" + inspectioncode + " ]";
    }
    
}
