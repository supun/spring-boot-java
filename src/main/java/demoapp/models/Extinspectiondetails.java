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
@Table(name = "extinspectiondetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extinspectiondetails.findAll", query = "SELECT e FROM Extinspectiondetails e")
    , @NamedQuery(name = "Extinspectiondetails.findByVslrefid", query = "SELECT e FROM Extinspectiondetails e WHERE e.vslrefid = :vslrefid")
    , @NamedQuery(name = "Extinspectiondetails.findByRefno", query = "SELECT e FROM Extinspectiondetails e WHERE e.refno = :refno")
    , @NamedQuery(name = "Extinspectiondetails.findByActioncode", query = "SELECT e FROM Extinspectiondetails e WHERE e.actioncode = :actioncode")
    , @NamedQuery(name = "Extinspectiondetails.findByNaturedeficode", query = "SELECT e FROM Extinspectiondetails e WHERE e.naturedeficode = :naturedeficode")
    , @NamedQuery(name = "Extinspectiondetails.findByDeficiencydetail", query = "SELECT e FROM Extinspectiondetails e WHERE e.deficiencydetail = :deficiencydetail")
    , @NamedQuery(name = "Extinspectiondetails.findByRootcausecode", query = "SELECT e FROM Extinspectiondetails e WHERE e.rootcausecode = :rootcausecode")
    , @NamedQuery(name = "Extinspectiondetails.findByImcorrection", query = "SELECT e FROM Extinspectiondetails e WHERE e.imcorrection = :imcorrection")
    , @NamedQuery(name = "Extinspectiondetails.findByLongtermaction", query = "SELECT e FROM Extinspectiondetails e WHERE e.longtermaction = :longtermaction")
    , @NamedQuery(name = "Extinspectiondetails.findByActionby", query = "SELECT e FROM Extinspectiondetails e WHERE e.actionby = :actionby")
    , @NamedQuery(name = "Extinspectiondetails.findByCategorycode", query = "SELECT e FROM Extinspectiondetails e WHERE e.categorycode = :categorycode")
    , @NamedQuery(name = "Extinspectiondetails.findBySubcate1code", query = "SELECT e FROM Extinspectiondetails e WHERE e.subcate1code = :subcate1code")
    , @NamedQuery(name = "Extinspectiondetails.findBySubcate2code", query = "SELECT e FROM Extinspectiondetails e WHERE e.subcate2code = :subcate2code")
    , @NamedQuery(name = "Extinspectiondetails.findByPlancompletedate", query = "SELECT e FROM Extinspectiondetails e WHERE e.plancompletedate = :plancompletedate")
    , @NamedQuery(name = "Extinspectiondetails.findByActualcompledate", query = "SELECT e FROM Extinspectiondetails e WHERE e.actualcompledate = :actualcompledate")
    , @NamedQuery(name = "Extinspectiondetails.findByFindingstatus", query = "SELECT e FROM Extinspectiondetails e WHERE e.findingstatus = :findingstatus")})
public class Extinspectiondetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "vslrefid")
    private String vslrefid;
    @Column(name = "refno")
    private String refno;
    @Column(name = "actioncode")
    private String actioncode;
    @Column(name = "naturedeficode")
    private String naturedeficode;
    @Column(name = "deficiencydetail")
    private String deficiencydetail;
    @Column(name = "rootcausecode")
    private String rootcausecode;
    @Column(name = "imcorrection")
    private String imcorrection;
    @Column(name = "longtermaction")
    private String longtermaction;
    @Column(name = "actionby")
    private String actionby;
    @Column(name = "categorycode")
    private String categorycode;
    @Column(name = "subcate1code")
    private String subcate1code;
    @Column(name = "subcate2code")
    private String subcate2code;
    @Column(name = "plancompletedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plancompletedate;
    @Column(name = "actualcompledate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualcompledate;
    @Column(name = "findingstatus")
    private String findingstatus;
    @OneToMany(mappedBy = "vslrefid")
    private List<Extinsformsdoc> extinsformsdocList;
    @JoinColumn(name = "extinsid", referencedColumnName = "extinsid")
    @ManyToOne
    private Extinspectionmaster extinsid;

    public Extinspectiondetails() {
    }

    public Extinspectiondetails(String vslrefid) {
        this.vslrefid = vslrefid;
    }

    public String getVslrefid() {
        return vslrefid;
    }

    public void setVslrefid(String vslrefid) {
        this.vslrefid = vslrefid;
    }

    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }

    public String getActioncode() {
        return actioncode;
    }

    public void setActioncode(String actioncode) {
        this.actioncode = actioncode;
    }

    public String getNaturedeficode() {
        return naturedeficode;
    }

    public void setNaturedeficode(String naturedeficode) {
        this.naturedeficode = naturedeficode;
    }

    public String getDeficiencydetail() {
        return deficiencydetail;
    }

    public void setDeficiencydetail(String deficiencydetail) {
        this.deficiencydetail = deficiencydetail;
    }

    public String getRootcausecode() {
        return rootcausecode;
    }

    public void setRootcausecode(String rootcausecode) {
        this.rootcausecode = rootcausecode;
    }

    public String getImcorrection() {
        return imcorrection;
    }

    public void setImcorrection(String imcorrection) {
        this.imcorrection = imcorrection;
    }

    public String getLongtermaction() {
        return longtermaction;
    }

    public void setLongtermaction(String longtermaction) {
        this.longtermaction = longtermaction;
    }

    public String getActionby() {
        return actionby;
    }

    public void setActionby(String actionby) {
        this.actionby = actionby;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getSubcate1code() {
        return subcate1code;
    }

    public void setSubcate1code(String subcate1code) {
        this.subcate1code = subcate1code;
    }

    public String getSubcate2code() {
        return subcate2code;
    }

    public void setSubcate2code(String subcate2code) {
        this.subcate2code = subcate2code;
    }

    public Date getPlancompletedate() {
        return plancompletedate;
    }

    public void setPlancompletedate(Date plancompletedate) {
        this.plancompletedate = plancompletedate;
    }

    public Date getActualcompledate() {
        return actualcompledate;
    }

    public void setActualcompledate(Date actualcompledate) {
        this.actualcompledate = actualcompledate;
    }

    public String getFindingstatus() {
        return findingstatus;
    }

    public void setFindingstatus(String findingstatus) {
        this.findingstatus = findingstatus;
    }

    @XmlTransient
    public List<Extinsformsdoc> getExtinsformsdocList() {
        return extinsformsdocList;
    }

    public void setExtinsformsdocList(List<Extinsformsdoc> extinsformsdocList) {
        this.extinsformsdocList = extinsformsdocList;
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
        hash += (vslrefid != null ? vslrefid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extinspectiondetails)) {
            return false;
        }
        Extinspectiondetails other = (Extinspectiondetails) object;
        if ((this.vslrefid == null && other.vslrefid != null) || (this.vslrefid != null && !this.vslrefid.equals(other.vslrefid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Extinspectiondetails[ vslrefid=" + vslrefid + " ]";
    }
    
}
