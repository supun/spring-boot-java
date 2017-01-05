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
@Table(name = "nrmwfhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nrmwfhistory.findAll", query = "SELECT n FROM Nrmwfhistory n")
    , @NamedQuery(name = "Nrmwfhistory.findById", query = "SELECT n FROM Nrmwfhistory n WHERE n.id = :id")
    , @NamedQuery(name = "Nrmwfhistory.findByUserid", query = "SELECT n FROM Nrmwfhistory n WHERE n.userid = :userid")
    , @NamedQuery(name = "Nrmwfhistory.findByRankid", query = "SELECT n FROM Nrmwfhistory n WHERE n.rankid = :rankid")
    , @NamedQuery(name = "Nrmwfhistory.findBySenddate", query = "SELECT n FROM Nrmwfhistory n WHERE n.senddate = :senddate")
    , @NamedQuery(name = "Nrmwfhistory.findByUpddate", query = "SELECT n FROM Nrmwfhistory n WHERE n.upddate = :upddate")
    , @NamedQuery(name = "Nrmwfhistory.findByFormstatus", query = "SELECT n FROM Nrmwfhistory n WHERE n.formstatus = :formstatus")})
public class Nrmwfhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "userid")
    private String userid;
    @Column(name = "rankid")
    private String rankid;
    @Column(name = "senddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date senddate;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;
    @Column(name = "formstatus")
    private String formstatus;
    @JoinColumn(name = "nrmid", referencedColumnName = "nrmid")
    @ManyToOne
    private Nearmissmaster nrmid;

    public Nrmwfhistory() {
    }

    public Nrmwfhistory(Integer id) {
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

    public String getRankid() {
        return rankid;
    }

    public void setRankid(String rankid) {
        this.rankid = rankid;
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

    public String getFormstatus() {
        return formstatus;
    }

    public void setFormstatus(String formstatus) {
        this.formstatus = formstatus;
    }

    public Nearmissmaster getNrmid() {
        return nrmid;
    }

    public void setNrmid(Nearmissmaster nrmid) {
        this.nrmid = nrmid;
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
        if (!(object instanceof Nrmwfhistory)) {
            return false;
        }
        Nrmwfhistory other = (Nrmwfhistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nrmwfhistory[ id=" + id + " ]";
    }
    
}
