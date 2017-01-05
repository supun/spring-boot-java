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
@Table(name = "moduleindex")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Moduleindex.findAll", query = "SELECT m FROM Moduleindex m")
    , @NamedQuery(name = "Moduleindex.findById", query = "SELECT m FROM Moduleindex m WHERE m.id = :id")
    , @NamedQuery(name = "Moduleindex.findByIdxvalue", query = "SELECT m FROM Moduleindex m WHERE m.idxvalue = :idxvalue")
    , @NamedQuery(name = "Moduleindex.findByIdxprefix", query = "SELECT m FROM Moduleindex m WHERE m.idxprefix = :idxprefix")
    , @NamedQuery(name = "Moduleindex.findByFnyear", query = "SELECT m FROM Moduleindex m WHERE m.fnyear = :fnyear")
    , @NamedQuery(name = "Moduleindex.findByActiveStatus", query = "SELECT m FROM Moduleindex m WHERE m.activeStatus = :activeStatus")
    , @NamedQuery(name = "Moduleindex.findByIdxpatern", query = "SELECT m FROM Moduleindex m WHERE m.idxpatern = :idxpatern")
    , @NamedQuery(name = "Moduleindex.findByIsyearbased", query = "SELECT m FROM Moduleindex m WHERE m.isyearbased = :isyearbased")
    , @NamedQuery(name = "Moduleindex.findByCruser", query = "SELECT m FROM Moduleindex m WHERE m.cruser = :cruser")
    , @NamedQuery(name = "Moduleindex.findByCrdate", query = "SELECT m FROM Moduleindex m WHERE m.crdate = :crdate")
    , @NamedQuery(name = "Moduleindex.findByUpduser", query = "SELECT m FROM Moduleindex m WHERE m.upduser = :upduser")
    , @NamedQuery(name = "Moduleindex.findByUpddate", query = "SELECT m FROM Moduleindex m WHERE m.upddate = :upddate")})
public class Moduleindex implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idxvalue")
    private Integer idxvalue;
    @Column(name = "idxprefix")
    private String idxprefix;
    @Column(name = "fnyear")
    private Integer fnyear;
    @Column(name = "active_status")
    private String activeStatus;
    @Column(name = "idxpatern")
    private Integer idxpatern;
    @Column(name = "isyearbased")
    private Character isyearbased;
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
    @JoinColumn(name = "mdlcode", referencedColumnName = "mdlcode")
    @ManyToOne
    private Modulecreation mdlcode;

    public Moduleindex() {
    }

    public Moduleindex(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdxvalue() {
        return idxvalue;
    }

    public void setIdxvalue(Integer idxvalue) {
        this.idxvalue = idxvalue;
    }

    public String getIdxprefix() {
        return idxprefix;
    }

    public void setIdxprefix(String idxprefix) {
        this.idxprefix = idxprefix;
    }

    public Integer getFnyear() {
        return fnyear;
    }

    public void setFnyear(Integer fnyear) {
        this.fnyear = fnyear;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Integer getIdxpatern() {
        return idxpatern;
    }

    public void setIdxpatern(Integer idxpatern) {
        this.idxpatern = idxpatern;
    }

    public Character getIsyearbased() {
        return isyearbased;
    }

    public void setIsyearbased(Character isyearbased) {
        this.isyearbased = isyearbased;
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

    public Modulecreation getMdlcode() {
        return mdlcode;
    }

    public void setMdlcode(Modulecreation mdlcode) {
        this.mdlcode = mdlcode;
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
        if (!(object instanceof Moduleindex)) {
            return false;
        }
        Moduleindex other = (Moduleindex) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Moduleindex[ id=" + id + " ]";
    }
    
}
