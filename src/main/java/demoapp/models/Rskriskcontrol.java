/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author supun
 */
@Entity
@Table(name = "rskriskcontrol")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Rskriskcontrol.findAll", query = "SELECT r FROM Rskriskcontrol r"), @NamedQuery(name = "Rskriskcontrol.findByRcid", query = "SELECT r FROM Rskriskcontrol r WHERE r.rskriskcontrolPK.rcid = :rcid"),
		@NamedQuery(name = "Rskriskcontrol.findByRcvslcode", query = "SELECT r FROM Rskriskcontrol r WHERE r.rskriskcontrolPK.rcvslcode = :rcvslcode"), @NamedQuery(name = "Rskriskcontrol.findByControltype", query = "SELECT r FROM Rskriskcontrol r WHERE r.controltype = :controltype"),
		@NamedQuery(name = "Rskriskcontrol.findByControlmeasure", query = "SELECT r FROM Rskriskcontrol r WHERE r.controlmeasure = :controlmeasure"), @NamedQuery(name = "Rskriskcontrol.findByFrequency", query = "SELECT r FROM Rskriskcontrol r WHERE r.frequency = :frequency"),
		@NamedQuery(name = "Rskriskcontrol.findByConsequence", query = "SELECT r FROM Rskriskcontrol r WHERE r.consequence = :consequence"), @NamedQuery(name = "Rskriskcontrol.findByRisklevel", query = "SELECT r FROM Rskriskcontrol r WHERE r.risklevel = :risklevel") })
public class Rskriskcontrol implements Serializable
{

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected RskriskcontrolPK rskriskcontrolPK;
	@Column(name = "controltype")
	private String controltype;
	@Column(name = "controlmeasure")
	private String controlmeasure;
	@Column(name = "frequency")
	private String frequency;
	@Column(name = "consequence")
	private String consequence;
	@Column(name = "risklevel")
	private String risklevel;

	// @JoinColumn(name = "hazardno", referencedColumnName = "hazardno")
	// @ManyToOne
	// private Rskinitialrisk hazardno;

	// @JoinColumn(name = "id", referencedColumnName = "id")
	// @ManyToOne(optional = false)
	// private Rskinitialrisk id;

	// @JoinColumn(name = "vslcode", referencedColumnName = "vslcode")
	/// @ManyToOne
	// private Rskinitialrisk vslcode;

	@JoinColumns({ @JoinColumn(name = "hazardno", referencedColumnName = "hazardno", nullable = false, updatable = false, insertable = true), @JoinColumn(name = "id", referencedColumnName = "id", nullable = false, updatable = false, insertable = true),
			@JoinColumn(name = "vslcode", referencedColumnName = "vslcode", nullable = false, updatable = false, insertable = true) })
	@ManyToOne(optional = false)
	private Rskinitialrisk rskinitialrisk;

	public Rskinitialrisk getRskinitialrisk()
	{
		return rskinitialrisk;
	}

	public void setRskinitialrisk( Rskinitialrisk rskinitialrisk )
	{
		this.rskinitialrisk = rskinitialrisk;
	}

	public Rskriskcontrol()
	{
	}

	public Rskriskcontrol( RskriskcontrolPK rskriskcontrolPK )
	{
		this.rskriskcontrolPK = rskriskcontrolPK;
	}

	public Rskriskcontrol( int rcid, String rcvslcode )
	{
		this.rskriskcontrolPK = new RskriskcontrolPK( rcid, rcvslcode );
	}

	public RskriskcontrolPK getRskriskcontrolPK()
	{
		return rskriskcontrolPK;
	}

	public void setRskriskcontrolPK( RskriskcontrolPK rskriskcontrolPK )
	{
		this.rskriskcontrolPK = rskriskcontrolPK;
	}

	public String getControltype()
	{
		return controltype;
	}

	public void setControltype( String controltype )
	{
		this.controltype = controltype;
	}

	public String getControlmeasure()
	{
		return controlmeasure;
	}

	public void setControlmeasure( String controlmeasure )
	{
		this.controlmeasure = controlmeasure;
	}

	public String getFrequency()
	{
		return frequency;
	}

	public void setFrequency( String frequency )
	{
		this.frequency = frequency;
	}

	public String getConsequence()
	{
		return consequence;
	}

	public void setConsequence( String consequence )
	{
		this.consequence = consequence;
	}

	public String getRisklevel()
	{
		return risklevel;
	}

	public void setRisklevel( String risklevel )
	{
		this.risklevel = risklevel;
	}

	/*
	 * public Rskinitialrisk getHazardno() { return hazardno; } public void setHazardno(Rskinitialrisk hazardno) { this.hazardno = hazardno; } public
	 * Rskinitialrisk getId() { return id; } public void setId(Rskinitialrisk id) { this.id = id; } public Rskinitialrisk getVslcode() { return
	 * vslcode; } public void setVslcode(Rskinitialrisk vslcode) { this.vslcode = vslcode; }
	 */

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += ( rskriskcontrolPK != null ? rskriskcontrolPK.hashCode() : 0 );
		return hash;
	}

	@Override
	public boolean equals( Object object )
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if ( !( object instanceof Rskriskcontrol ) )
		{
			return false;
		}
		Rskriskcontrol other = ( Rskriskcontrol ) object;
		if ( ( this.rskriskcontrolPK == null && other.rskriskcontrolPK != null ) || ( this.rskriskcontrolPK != null && !this.rskriskcontrolPK.equals( other.rskriskcontrolPK ) ) )
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "demoapp.models.Rskriskcontrol[ rskriskcontrolPK=" + rskriskcontrolPK + " ]";
	}

}
