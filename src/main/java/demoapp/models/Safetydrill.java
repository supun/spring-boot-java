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
@Table(name = "safetydrill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetydrill.findAll", query = "SELECT s FROM Safetydrill s")
    , @NamedQuery(name = "Safetydrill.findById", query = "SELECT s FROM Safetydrill s WHERE s.id = :id")
    , @NamedQuery(name = "Safetydrill.findByDrillname", query = "SELECT s FROM Safetydrill s WHERE s.drillname = :drillname")
    , @NamedQuery(name = "Safetydrill.findByDrilldate", query = "SELECT s FROM Safetydrill s WHERE s.drilldate = :drilldate")
    , @NamedQuery(name = "Safetydrill.findByLocation", query = "SELECT s FROM Safetydrill s WHERE s.location = :location")
    , @NamedQuery(name = "Safetydrill.findByLatlong", query = "SELECT s FROM Safetydrill s WHERE s.latlong = :latlong")})
public class Safetydrill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "drillname")
    private String drillname;
    @Column(name = "drilldate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date drilldate;
    @Column(name = "location")
    private String location;
    @Column(name = "latlong")
    private String latlong;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetydrill() {
    }

    public Safetydrill(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrillname() {
        return drillname;
    }

    public void setDrillname(String drillname) {
        this.drillname = drillname;
    }

    public Date getDrilldate() {
        return drilldate;
    }

    public void setDrilldate(Date drilldate) {
        this.drilldate = drilldate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLatlong() {
        return latlong;
    }

    public void setLatlong(String latlong) {
        this.latlong = latlong;
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
        if (!(object instanceof Safetydrill)) {
            return false;
        }
        Safetydrill other = (Safetydrill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetydrill[ id=" + id + " ]";
    }
    
}
