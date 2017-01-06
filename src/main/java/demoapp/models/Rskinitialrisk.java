/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author supun
 */
@Entity
@Table(name = "rskinitialrisk")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Rskinitialrisk.findAll", query = "SELECT r FROM Rskinitialrisk r"), @NamedQuery(name = "Rskinitialrisk.findById", query = "SELECT r FROM Rskinitialrisk r WHERE r.rskinitialriskPK.id = :id"),
		@NamedQuery(name = "Rskinitialrisk.findByVslcode", query = "SELECT r FROM Rskinitialrisk r WHERE r.rskinitialriskPK.vslcode = :vslcode"), @NamedQuery(name = "Rskinitialrisk.findByHazardno", query = "SELECT r FROM Rskinitialrisk r WHERE r.rskinitialriskPK.hazardno = :hazardno"),
		@NamedQuery(name = "Rskinitialrisk.findByActivity", query = "SELECT r FROM Rskinitialrisk r WHERE r.activity = :activity"), @NamedQuery(name = "Rskinitialrisk.findByHazardcode", query = "SELECT r FROM Rskinitialrisk r WHERE r.hazardcode = :hazardcode"),
		@NamedQuery(name = "Rskinitialrisk.findByEffhazardcode", query = "SELECT r FROM Rskinitialrisk r WHERE r.effhazardcode = :effhazardcode") })
public class Rskinitialrisk implements Serializable
{

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected RskinitialriskPK rskinitialriskPK;
	@Column(name = "activity")
	private String activity;
	@Column(name = "hazardcode")
	private String hazardcode;
	@Column(name = "effhazardcode")
	private String effhazardcode;

	// @OneToMany(mappedBy = "rskinitialrisk")
	// private List<Rskriskcontrol> rskriskcontrolList;

	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "rskinitialrisk")
	// private List<Rskriskcontrol> rskriskcontrolList1;

	// @OneToMany(mappedBy = "rskinitialrisk")
	// private List<Rskriskcontrol> rskriskcontrolList2;

	@OneToMany(mappedBy = "rskinitialrisk", cascade = CascadeType.ALL)
	private List<Rskriskcontrol> rskriskcontrolList;

	/*
	 * @OneToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	 * @JoinColumn(name="cid", referencedColumnName = "id")
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rskid", referencedColumnName = "rskid", nullable = false, updatable = false, insertable = true)
	private Rskmaster rskid;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * @JoinColumn(name = "tastockid", nullable = false, updatable = false, insertable = true) private TaStock taStock;
	 */
	/*
	 * @JoinColumns({ @JoinColumn(name = "PROFILE_ID", referencedColumnName = "PROFILE_ID", insertable = false, updatable = false), @JoinColumn(name =
	 * "ITEM_NO", referencedColumnName = "ITEM_NO", insertable = false, updatable = false) })
	 * @ManyToOne(optional = false, fetch = FetchType.LAZY) private CmsContentItem cmsContentItem;
	 */
	public Rskinitialrisk()
	{
	}

	public Rskinitialrisk( RskinitialriskPK rskinitialriskPK )
	{
		this.rskinitialriskPK = rskinitialriskPK;
	}

	public Rskinitialrisk( int id, String vslcode, String hazardno )
	{
		this.rskinitialriskPK = new RskinitialriskPK( id, vslcode, hazardno );
	}

	public RskinitialriskPK getRskinitialriskPK()
	{
		return rskinitialriskPK;
	}

	public void setRskinitialriskPK( RskinitialriskPK rskinitialriskPK )
	{
		this.rskinitialriskPK = rskinitialriskPK;
	}

	public String getActivity()
	{
		return activity;
	}

	public void setActivity( String activity )
	{
		this.activity = activity;
	}

	public String getHazardcode()
	{
		return hazardcode;
	}

	public void setHazardcode( String hazardcode )
	{
		this.hazardcode = hazardcode;
	}

	public String getEffhazardcode()
	{
		return effhazardcode;
	}

	public void setEffhazardcode( String effhazardcode )
	{
		this.effhazardcode = effhazardcode;
	}

	@XmlTransient
	public List<Rskriskcontrol> getRskriskcontrolList()
	{
		return rskriskcontrolList;
	}

	public void setRskriskcontrolList( List<Rskriskcontrol> rskriskcontrolList )
	{
		this.rskriskcontrolList = rskriskcontrolList;
	}

	/*
	 * @XmlTransient public List<Rskriskcontrol> getRskriskcontrolList1() { return rskriskcontrolList1; } public void setRskriskcontrolList1(
	 * List<Rskriskcontrol> rskriskcontrolList1 ) { this.rskriskcontrolList1 = rskriskcontrolList1; }
	 * @XmlTransient public List<Rskriskcontrol> getRskriskcontrolList2() { return rskriskcontrolList2; } public void setRskriskcontrolList2(
	 * List<Rskriskcontrol> rskriskcontrolList2 ) { this.rskriskcontrolList2 = rskriskcontrolList2; }
	 */

	public Rskmaster getRskid()
	{
		return rskid;
	}

	public void setRskid( Rskmaster rskid )
	{
		this.rskid = rskid;
	}

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += ( rskinitialriskPK != null ? rskinitialriskPK.hashCode() : 0 );
		return hash;
	}

	@Override
	public boolean equals( Object object )
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if ( !( object instanceof Rskinitialrisk ) )
		{
			return false;
		}
		Rskinitialrisk other = ( Rskinitialrisk ) object;
		if ( ( this.rskinitialriskPK == null && other.rskinitialriskPK != null ) || ( this.rskinitialriskPK != null && !this.rskinitialriskPK.equals( other.rskinitialriskPK ) ) )
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "demoapp.models.Rskinitialrisk[ rskinitialriskPK=" + rskinitialriskPK + " ]";
	}

}
