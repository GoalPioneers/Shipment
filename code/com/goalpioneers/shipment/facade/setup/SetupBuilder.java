package com.goalpioneers.shipment.facade.setup;

import java.util.ArrayList;
import java.util.Collections;
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
		this.sortByPriority();
		
		int idx;
		for( idx = 0;
			 idx < this.getBuffers().size();
			 idx ++)
		{
			SetupFacade facade = this.getBuffers().get( idx );
			
			if( !facade.setup() )
			{
				throw new Exception( "Setup failed:" );
				// Figure out what's wrong
				
			}
		}
	}
	
	protected void sortByPriority()
	{
		Collections.sort( this.getBuffers() );
	}
	
	public SetupFacade retrieveByIdentity( int idx )
	{
		return this.getBuffers().get( idx );
	}
	
	public void add( SetupFacade facade )
	{
		this.getBuffers().add( facade );
	}
	
	public void removeByIdentity( int setupIdx )
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
