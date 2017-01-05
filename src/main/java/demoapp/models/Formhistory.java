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
@Table(name = "formhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formhistory.findAll", query = "SELECT f FROM Formhistory f")
    , @NamedQuery(name = "Formhistory.findById", query = "SELECT f FROM Formhistory f WHERE f.id = :id")
    , @NamedQuery(name = "Formhistory.findByFormno", query = "SELECT f FROM Formhistory f WHERE f.formno = :formno")
    , @NamedQuery(name = "Formhistory.findByRevno", query = "SELECT f FROM Formhistory f WHERE f.revno = :revno")
    , @NamedQuery(name = "Formhistory.findByStartdate", query = "SELECT f FROM Formhistory f WHERE f.startdate = :startdate")
    , @NamedQuery(name = "Formhistory.findByEnddate", query = "SELECT f FROM Formhistory f WHERE f.enddate = :enddate")})
public class Formhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "formno")
    private String formno;
    @Column(name = "revno")
    private String revno;
    @Column(name = "startdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "enddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @JoinColumn(name = "fmid", referencedColumnName = "fmid")
    @ManyToOne
    private Formmaster fmid;

    public Formhistory() {
    }

    public Formhistory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormno() {
        return formno;
    }

    public void setFormno(String formno) {
        this.formno = formno;
    }

    public String getRevno() {
        return revno;
    }

    public void setRevno(String revno) {
        this.revno = revno;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Formmaster getFmid() {
        return fmid;
    }

    public void setFmid(Formmaster fmid) {
        this.fmid = fmid;
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
        if (!(object instanceof Formhistory)) {
            return false;
        }
        Formhistory other = (Formhistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Formhistory[ id=" + id + " ]";
    }
    
}
