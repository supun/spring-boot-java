/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "vesselcommunicationdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vesselcommunicationdetails.findAll", query = "SELECT v FROM Vesselcommunicationdetails v")
    , @NamedQuery(name = "Vesselcommunicationdetails.findByVesselcode", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.vesselcode = :vesselcode")
    , @NamedQuery(name = "Vesselcommunicationdetails.findByMmsino", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.mmsino = :mmsino")
    , @NamedQuery(name = "Vesselcommunicationdetails.findByAatdhldigits", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.aatdhldigits = :aatdhldigits")
    , @NamedQuery(name = "Vesselcommunicationdetails.findBySatTelex", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.satTelex = :satTelex")
    , @NamedQuery(name = "Vesselcommunicationdetails.findBySatVoice", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.satVoice = :satVoice")
    , @NamedQuery(name = "Vesselcommunicationdetails.findBySatFax", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.satFax = :satFax")
    , @NamedQuery(name = "Vesselcommunicationdetails.findBySatData", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.satData = :satData")
    , @NamedQuery(name = "Vesselcommunicationdetails.findBySatHsd", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.satHsd = :satHsd")
    , @NamedQuery(name = "Vesselcommunicationdetails.findBySatCid", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.satCid = :satCid")
    , @NamedQuery(name = "Vesselcommunicationdetails.findByJapanphonevoice", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.japanphonevoice = :japanphonevoice")
    , @NamedQuery(name = "Vesselcommunicationdetails.findByCellphone", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.cellphone = :cellphone")
    , @NamedQuery(name = "Vesselcommunicationdetails.findByIridiumphone", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.iridiumphone = :iridiumphone")
    , @NamedQuery(name = "Vesselcommunicationdetails.findBySatEmail", query = "SELECT v FROM Vesselcommunicationdetails v WHERE v.satEmail = :satEmail")})
public class Vesselcommunicationdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "vesselcode")
    private String vesselcode;
    @Column(name = "mmsino")
    private Integer mmsino;
    @Column(name = "aatdhldigits")
    private String aatdhldigits;
    @Column(name = "sat_telex")
    private String satTelex;
    @Column(name = "sat_voice")
    private String satVoice;
    @Column(name = "sat_fax")
    private String satFax;
    @Column(name = "sat_data")
    private String satData;
    @Column(name = "sat_hsd")
    private String satHsd;
    @Column(name = "sat_cid")
    private String satCid;
    @Column(name = "japanphonevoice")
    private String japanphonevoice;
    @Column(name = "cellphone")
    private String cellphone;
    @Column(name = "iridiumphone")
    private String iridiumphone;
    @Column(name = "sat_email")
    private String satEmail;

    public Vesselcommunicationdetails() {
    }

    public Vesselcommunicationdetails(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public String getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public Integer getMmsino() {
        return mmsino;
    }

    public void setMmsino(Integer mmsino) {
        this.mmsino = mmsino;
    }

    public String getAatdhldigits() {
        return aatdhldigits;
    }

    public void setAatdhldigits(String aatdhldigits) {
        this.aatdhldigits = aatdhldigits;
    }

    public String getSatTelex() {
        return satTelex;
    }

    public void setSatTelex(String satTelex) {
        this.satTelex = satTelex;
    }

    public String getSatVoice() {
        return satVoice;
    }

    public void setSatVoice(String satVoice) {
        this.satVoice = satVoice;
    }

    public String getSatFax() {
        return satFax;
    }

    public void setSatFax(String satFax) {
        this.satFax = satFax;
    }

    public String getSatData() {
        return satData;
    }

    public void setSatData(String satData) {
        this.satData = satData;
    }

    public String getSatHsd() {
        return satHsd;
    }

    public void setSatHsd(String satHsd) {
        this.satHsd = satHsd;
    }

    public String getSatCid() {
        return satCid;
    }

    public void setSatCid(String satCid) {
        this.satCid = satCid;
    }

    public String getJapanphonevoice() {
        return japanphonevoice;
    }

    public void setJapanphonevoice(String japanphonevoice) {
        this.japanphonevoice = japanphonevoice;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getIridiumphone() {
        return iridiumphone;
    }

    public void setIridiumphone(String iridiumphone) {
        this.iridiumphone = iridiumphone;
    }

    public String getSatEmail() {
        return satEmail;
    }

    public void setSatEmail(String satEmail) {
        this.satEmail = satEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vesselcode != null ? vesselcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vesselcommunicationdetails)) {
            return false;
        }
        Vesselcommunicationdetails other = (Vesselcommunicationdetails) object;
        if ((this.vesselcode == null && other.vesselcode != null) || (this.vesselcode != null && !this.vesselcode.equals(other.vesselcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Vesselcommunicationdetails[ vesselcode=" + vesselcode + " ]";
    }
    
}
