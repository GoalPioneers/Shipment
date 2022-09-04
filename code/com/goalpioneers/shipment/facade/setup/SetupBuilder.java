package com.goalpioneers.shipment.facade.setup;

import java.util.ArrayList;
import java.util.List;


public class SetupBuilder
{
	public SetupBuilder()
	{
		this.setBuffers( new ArrayList <>() );
	}
	
	public void build()
		throws Exception
	{
	
	}
	
	public SetupFacade retrieveByIdentity(int idx)
	{
		return this.getBuffers().get( idx );
	}
	
	public void addSetup( SetupFacade facade )
	{
		this.getBuffers().add( facade );
	}
	
	public void removeSetupByIdentity( int setupIdx )
	{
		this.getBuffers().remove( setupIdx );
	}
	
	// Variables
	private List <SetupFacade> buffers = null;
	
	// Accessors
	public List <SetupFacade> getBuffers()
	{
		return this.buffers;
	}
	
	public void setBuffers( List <SetupFacade> buffers )
	{
		this.buffers = buffers;
	}
}
