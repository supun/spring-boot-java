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
@Table(name = "rskwfhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rskwfhistory.findAll", query = "SELECT r FROM Rskwfhistory r")
    , @NamedQuery(name = "Rskwfhistory.findById", query = "SELECT r FROM Rskwfhistory r WHERE r.rskwfhistoryPK.id = :id")
    , @NamedQuery(name = "Rskwfhistory.findByVslcode", query = "SELECT r FROM Rskwfhistory r WHERE r.rskwfhistoryPK.vslcode = :vslcode")
    , @NamedQuery(name = "Rskwfhistory.findByUserid", query = "SELECT r FROM Rskwfhistory r WHERE r.userid = :userid")
    , @NamedQuery(name = "Rskwfhistory.findByRankid", query = "SELECT r FROM Rskwfhistory r WHERE r.rankid = :rankid")
    , @NamedQuery(name = "Rskwfhistory.findBySenddate", query = "SELECT r FROM Rskwfhistory r WHERE r.senddate = :senddate")
    , @NamedQuery(name = "Rskwfhistory.findByUpddate", query = "SELECT r FROM Rskwfhistory r WHERE r.upddate = :upddate")
    , @NamedQuery(name = "Rskwfhistory.findByFormstatus", query = "SELECT r FROM Rskwfhistory r WHERE r.formstatus = :formstatus")})
public class Rskwfhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RskwfhistoryPK rskwfhistoryPK;
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
    @JoinColumn(name = "rskid", referencedColumnName = "rskid")
    @ManyToOne
    private Rskmaster rskid;

    public Rskwfhistory() {
    }

    public Rskwfhistory(RskwfhistoryPK rskwfhistoryPK) {
        this.rskwfhistoryPK = rskwfhistoryPK;
    }

    public Rskwfhistory(int id, String vslcode) {
        this.rskwfhistoryPK = new RskwfhistoryPK(id, vslcode);
    }

    public RskwfhistoryPK getRskwfhistoryPK() {
        return rskwfhistoryPK;
    }

    public void setRskwfhistoryPK(RskwfhistoryPK rskwfhistoryPK) {
        this.rskwfhistoryPK = rskwfhistoryPK;
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

    public Rskmaster getRskid() {
        return rskid;
    }

    public void setRskid(Rskmaster rskid) {
        this.rskid = rskid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rskwfhistoryPK != null ? rskwfhistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rskwfhistory)) {
            return false;
        }
        Rskwfhistory other = (Rskwfhistory) object;
        if ((this.rskwfhistoryPK == null && other.rskwfhistoryPK != null) || (this.rskwfhistoryPK != null && !this.rskwfhistoryPK.equals(other.rskwfhistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rskwfhistory[ rskwfhistoryPK=" + rskwfhistoryPK + " ]";
    }
    
}
