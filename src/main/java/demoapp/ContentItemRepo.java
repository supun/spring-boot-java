/**
Dharmarathne 
 * @since Jan 5, 2017
 */
package demoapp;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demoapp.models.Rskinitialrisk;
import demoapp.models.RskinitialriskPK;
import demoapp.models.Rskmaster;
import demoapp.models.Rskriskcontrol;
import demoapp.models.RskriskcontrolPK;

@Repository
@Transactional
public class ContentItemRepo
{
	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession()
	{
		return _sessionFactory.getCurrentSession();
	}

	public void save()
	{

		Rskmaster rskMasetr = new Rskmaster();
		rskMasetr.setRskid( "awygydyg" );
		rskMasetr.setVesselcode( "ELSA" );
		rskMasetr.setFormnumber( "form 1" );

		Rskinitialrisk rskInitialRisk = new Rskinitialrisk();
		rskInitialRisk.setActivity( "Test" );
		rskInitialRisk.setEffhazardcode( "SSS" );

		RskinitialriskPK pk = new RskinitialriskPK();
		pk.setVslcode( "ELSA" );
		pk.setHazardno( "3" );
		rskInitialRisk.setRskinitialriskPK( pk );

		Rskriskcontrol nnn = new Rskriskcontrol();
		nnn.setConsequence( "COSEQU" );
		nnn.setControlmeasure( "CONTROL MEASURE" );
		nnn.setRisklevel( "COSEQU" );
		// nnn.setConsequence( "COSEQU" );
		RskriskcontrolPK pkk = new RskriskcontrolPK();
		pkk.setRcvslcode( "ELSA" );
		nnn.setRskriskcontrolPK( pkk );

		List<Rskriskcontrol> list = new ArrayList<>();
		list.add( nnn );
		rskInitialRisk.setRskriskcontrolList( list );

		List<Rskinitialrisk> rskInitialRiskList = new ArrayList<>();
		rskInitialRiskList.add( rskInitialRisk );
		rskMasetr.setRskinitialriskList( rskInitialRiskList );
		getSession().save( rskMasetr );

		// Rskmaster rr = new Rskmaster();
		// getSession().save( rr );
	}
}
