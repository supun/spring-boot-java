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
@Table(name = "vesselmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vesselmaster.findAll", query = "SELECT v FROM Vesselmaster v")
    , @NamedQuery(name = "Vesselmaster.findByVesselcode", query = "SELECT v FROM Vesselmaster v WHERE v.vesselcode = :vesselcode")
    , @NamedQuery(name = "Vesselmaster.findByVesselname", query = "SELECT v FROM Vesselmaster v WHERE v.vesselname = :vesselname")
    , @NamedQuery(name = "Vesselmaster.findByFlagname", query = "SELECT v FROM Vesselmaster v WHERE v.flagname = :flagname")
    , @NamedQuery(name = "Vesselmaster.findByNationalityrating", query = "SELECT v FROM Vesselmaster v WHERE v.nationalityrating = :nationalityrating")
    , @NamedQuery(name = "Vesselmaster.findByNationality", query = "SELECT v FROM Vesselmaster v WHERE v.nationality = :nationality")
    , @NamedQuery(name = "Vesselmaster.findByCbaCa", query = "SELECT v FROM Vesselmaster v WHERE v.cbaCa = :cbaCa")
    , @NamedQuery(name = "Vesselmaster.findByFormername", query = "SELECT v FROM Vesselmaster v WHERE v.formername = :formername")
    , @NamedQuery(name = "Vesselmaster.findByFinancialyearend", query = "SELECT v FROM Vesselmaster v WHERE v.financialyearend = :financialyearend")
    , @NamedQuery(name = "Vesselmaster.findByNameofownerPrincipal", query = "SELECT v FROM Vesselmaster v WHERE v.nameofownerPrincipal = :nameofownerPrincipal")
    , @NamedQuery(name = "Vesselmaster.findByNameofregisteredowner", query = "SELECT v FROM Vesselmaster v WHERE v.nameofregisteredowner = :nameofregisteredowner")
    , @NamedQuery(name = "Vesselmaster.findByInsurancehullmachineries", query = "SELECT v FROM Vesselmaster v WHERE v.insurancehullmachineries = :insurancehullmachineries")
    , @NamedQuery(name = "Vesselmaster.findByInsurancepi", query = "SELECT v FROM Vesselmaster v WHERE v.insurancepi = :insurancepi")
    , @NamedQuery(name = "Vesselmaster.findByActualprincipal", query = "SELECT v FROM Vesselmaster v WHERE v.actualprincipal = :actualprincipal")
    , @NamedQuery(name = "Vesselmaster.findByImono", query = "SELECT v FROM Vesselmaster v WHERE v.imono = :imono")
    , @NamedQuery(name = "Vesselmaster.findByOfficialno", query = "SELECT v FROM Vesselmaster v WHERE v.officialno = :officialno")
    , @NamedQuery(name = "Vesselmaster.findByCallsign", query = "SELECT v FROM Vesselmaster v WHERE v.callsign = :callsign")
    , @NamedQuery(name = "Vesselmaster.findByInternationalgrosston", query = "SELECT v FROM Vesselmaster v WHERE v.internationalgrosston = :internationalgrosston")
    , @NamedQuery(name = "Vesselmaster.findByInternationalnetton", query = "SELECT v FROM Vesselmaster v WHERE v.internationalnetton = :internationalnetton")
    , @NamedQuery(name = "Vesselmaster.findByClass1", query = "SELECT v FROM Vesselmaster v WHERE v.class1 = :class1")
    , @NamedQuery(name = "Vesselmaster.findByClassno", query = "SELECT v FROM Vesselmaster v WHERE v.classno = :classno")
    , @NamedQuery(name = "Vesselmaster.findByShipbulider", query = "SELECT v FROM Vesselmaster v WHERE v.shipbulider = :shipbulider")
    , @NamedQuery(name = "Vesselmaster.findByHullno", query = "SELECT v FROM Vesselmaster v WHERE v.hullno = :hullno")
    , @NamedQuery(name = "Vesselmaster.findByDateofbuilt", query = "SELECT v FROM Vesselmaster v WHERE v.dateofbuilt = :dateofbuilt")
    , @NamedQuery(name = "Vesselmaster.findByAge", query = "SELECT v FROM Vesselmaster v WHERE v.age = :age")
    , @NamedQuery(name = "Vesselmaster.findByRegisteredgrosston", query = "SELECT v FROM Vesselmaster v WHERE v.registeredgrosston = :registeredgrosston")
    , @NamedQuery(name = "Vesselmaster.findByRegisterednetton", query = "SELECT v FROM Vesselmaster v WHERE v.registerednetton = :registerednetton")
    , @NamedQuery(name = "Vesselmaster.findByLengthLoa", query = "SELECT v FROM Vesselmaster v WHERE v.lengthLoa = :lengthLoa")
    , @NamedQuery(name = "Vesselmaster.findByBreadth", query = "SELECT v FROM Vesselmaster v WHERE v.breadth = :breadth")
    , @NamedQuery(name = "Vesselmaster.findByDepth", query = "SELECT v FROM Vesselmaster v WHERE v.depth = :depth")
    , @NamedQuery(name = "Vesselmaster.findByDraft", query = "SELECT v FROM Vesselmaster v WHERE v.draft = :draft")
    , @NamedQuery(name = "Vesselmaster.findByDeadweight", query = "SELECT v FROM Vesselmaster v WHERE v.deadweight = :deadweight")
    , @NamedQuery(name = "Vesselmaster.findByCapacity", query = "SELECT v FROM Vesselmaster v WHERE v.capacity = :capacity")
    , @NamedQuery(name = "Vesselmaster.findByLastdrydockdate", query = "SELECT v FROM Vesselmaster v WHERE v.lastdrydockdate = :lastdrydockdate")
    , @NamedQuery(name = "Vesselmaster.findByNextdrydockdate", query = "SELECT v FROM Vesselmaster v WHERE v.nextdrydockdate = :nextdrydockdate")
    , @NamedQuery(name = "Vesselmaster.findByDeliverydate", query = "SELECT v FROM Vesselmaster v WHERE v.deliverydate = :deliverydate")
    , @NamedQuery(name = "Vesselmaster.findByActiveStatus", query = "SELECT v FROM Vesselmaster v WHERE v.activeStatus = :activeStatus")
    , @NamedQuery(name = "Vesselmaster.findByCruser", query = "SELECT v FROM Vesselmaster v WHERE v.cruser = :cruser")
    , @NamedQuery(name = "Vesselmaster.findByCrdate", query = "SELECT v FROM Vesselmaster v WHERE v.crdate = :crdate")
    , @NamedQuery(name = "Vesselmaster.findByUpduser", query = "SELECT v FROM Vesselmaster v WHERE v.upduser = :upduser")
    , @NamedQuery(name = "Vesselmaster.findByUpddate", query = "SELECT v FROM Vesselmaster v WHERE v.upddate = :upddate")})
public class Vesselmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "vesselcode")
    private String vesselcode;
    @Column(name = "vesselname")
    private String vesselname;
    @Column(name = "flagname")
    private String flagname;
    @Column(name = "nationalityrating")
    private String nationalityrating;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "cba_ca")
    private String cbaCa;
    @Column(name = "formername")
    private String formername;
    @Column(name = "financialyearend")
    private String financialyearend;
    @Column(name = "nameofowner_principal")
    private String nameofownerPrincipal;
    @Column(name = "nameofregisteredowner")
    private String nameofregisteredowner;
    @Column(name = "insurancehullmachineries")
    private String insurancehullmachineries;
    @Column(name = "insurancepi")
    private String insurancepi;
    @Column(name = "actualprincipal")
    private String actualprincipal;
    @Column(name = "imono")
    private String imono;
    @Column(name = "officialno")
    private String officialno;
    @Column(name = "callsign")
    private String callsign;
    @Column(name = "internationalgrosston")
    private String internationalgrosston;
    @Column(name = "internationalnetton")
    private String internationalnetton;
    @Column(name = "class")
    private String class1;
    @Column(name = "classno")
    private String classno;
    @Column(name = "shipbulider")
    private String shipbulider;
    @Column(name = "hullno")
    private String hullno;
    @Column(name = "dateofbuilt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbuilt;
    @Column(name = "age")
    private String age;
    @Column(name = "registeredgrosston")
    private String registeredgrosston;
    @Column(name = "registerednetton")
    private String registerednetton;
    @Column(name = "length_loa")
    private String lengthLoa;
    @Column(name = "breadth")
    private String breadth;
    @Column(name = "depth")
    private String depth;
    @Column(name = "draft")
    private String draft;
    @Column(name = "deadweight")
    private String deadweight;
    @Column(name = "capacity")
    private String capacity;
    @Column(name = "lastdrydockdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastdrydockdate;
    @Column(name = "nextdrydockdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextdrydockdate;
    @Column(name = "deliverydate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliverydate;
    @Column(name = "active_status")
    private String activeStatus;
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
    @JoinColumn(name = "fleetcode", referencedColumnName = "fleetcode")
    @ManyToOne
    private Fleetmaster fleetcode;
    @JoinColumn(name = "shorecode", referencedColumnName = "shorecode")
    @ManyToOne
    private Shoremaster shorecode;
    @OneToMany(mappedBy = "vesselcode")
    private List<Crewmaster> crewmasterList;

    public Vesselmaster() {
    }

    public Vesselmaster(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public String getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public String getVesselname() {
        return vesselname;
    }

    public void setVesselname(String vesselname) {
        this.vesselname = vesselname;
    }

    public String getFlagname() {
        return flagname;
    }

    public void setFlagname(String flagname) {
        this.flagname = flagname;
    }

    public String getNationalityrating() {
        return nationalityrating;
    }

    public void setNationalityrating(String nationalityrating) {
        this.nationalityrating = nationalityrating;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCbaCa() {
        return cbaCa;
    }

    public void setCbaCa(String cbaCa) {
        this.cbaCa = cbaCa;
    }

    public String getFormername() {
        return formername;
    }

    public void setFormername(String formername) {
        this.formername = formername;
    }

    public String getFinancialyearend() {
        return financialyearend;
    }

    public void setFinancialyearend(String financialyearend) {
        this.financialyearend = financialyearend;
    }

    public String getNameofownerPrincipal() {
        return nameofownerPrincipal;
    }

    public void setNameofownerPrincipal(String nameofownerPrincipal) {
        this.nameofownerPrincipal = nameofownerPrincipal;
    }

    public String getNameofregisteredowner() {
        return nameofregisteredowner;
    }

    public void setNameofregisteredowner(String nameofregisteredowner) {
        this.nameofregisteredowner = nameofregisteredowner;
    }

    public String getInsurancehullmachineries() {
        return insurancehullmachineries;
    }

    public void setInsurancehullmachineries(String insurancehullmachineries) {
        this.insurancehullmachineries = insurancehullmachineries;
    }

    public String getInsurancepi() {
        return insurancepi;
    }

    public void setInsurancepi(String insurancepi) {
        this.insurancepi = insurancepi;
    }

    public String getActualprincipal() {
        return actualprincipal;
    }

    public void setActualprincipal(String actualprincipal) {
        this.actualprincipal = actualprincipal;
    }

    public String getImono() {
        return imono;
    }

    public void setImono(String imono) {
        this.imono = imono;
    }

    public String getOfficialno() {
        return officialno;
    }

    public void setOfficialno(String officialno) {
        this.officialno = officialno;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getInternationalgrosston() {
        return internationalgrosston;
    }

    public void setInternationalgrosston(String internationalgrosston) {
        this.internationalgrosston = internationalgrosston;
    }

    public String getInternationalnetton() {
        return internationalnetton;
    }

    public void setInternationalnetton(String internationalnetton) {
        this.internationalnetton = internationalnetton;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getShipbulider() {
        return shipbulider;
    }

    public void setShipbulider(String shipbulider) {
        this.shipbulider = shipbulider;
    }

    public String getHullno() {
        return hullno;
    }

    public void setHullno(String hullno) {
        this.hullno = hullno;
    }

    public Date getDateofbuilt() {
        return dateofbuilt;
    }

    public void setDateofbuilt(Date dateofbuilt) {
        this.dateofbuilt = dateofbuilt;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRegisteredgrosston() {
        return registeredgrosston;
    }

    public void setRegisteredgrosston(String registeredgrosston) {
        this.registeredgrosston = registeredgrosston;
    }

    public String getRegisterednetton() {
        return registerednetton;
    }

    public void setRegisterednetton(String registerednetton) {
        this.registerednetton = registerednetton;
    }

    public String getLengthLoa() {
        return lengthLoa;
    }

    public void setLengthLoa(String lengthLoa) {
        this.lengthLoa = lengthLoa;
    }

    public String getBreadth() {
        return breadth;
    }

    public void setBreadth(String breadth) {
        this.breadth = breadth;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }

    public String getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(String deadweight) {
        this.deadweight = deadweight;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Date getLastdrydockdate() {
        return lastdrydockdate;
    }

    public void setLastdrydockdate(Date lastdrydockdate) {
        this.lastdrydockdate = lastdrydockdate;
    }

    public Date getNextdrydockdate() {
        return nextdrydockdate;
    }

    public void setNextdrydockdate(Date nextdrydockdate) {
        this.nextdrydockdate = nextdrydockdate;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
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

    public Fleetmaster getFleetcode() {
        return fleetcode;
    }

    public void setFleetcode(Fleetmaster fleetcode) {
        this.fleetcode = fleetcode;
    }

    public Shoremaster getShorecode() {
        return shorecode;
    }

    public void setShorecode(Shoremaster shorecode) {
        this.shorecode = shorecode;
    }

    @XmlTransient
    public List<Crewmaster> getCrewmasterList() {
        return crewmasterList;
    }

    public void setCrewmasterList(List<Crewmaster> crewmasterList) {
        this.crewmasterList = crewmasterList;
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
        if (!(object instanceof Vesselmaster)) {
            return false;
        }
        Vesselmaster other = (Vesselmaster) object;
        if ((this.vesselcode == null && other.vesselcode != null) || (this.vesselcode != null && !this.vesselcode.equals(other.vesselcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Vesselmaster[ vesselcode=" + vesselcode + " ]";
    }
    
}
