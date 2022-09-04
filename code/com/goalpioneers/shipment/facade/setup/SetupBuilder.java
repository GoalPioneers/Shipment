package com.goalpioneers.shipment.facade.setup;

import com.goalpioneers.shipment.domain.Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SetupBuilder
{
	public SetupBuilder( Application application )
	{
		this.setBuffers(
			new ArrayList <>()
		);
		
		this.setApplication( application );
	}
	
	
	// Variables
	private Application application = null;
	
	private List <SetupFacade> buffers = null;
	
	
	// Functions: Public
	public void build()
		//throws Exception
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
				//throw new Exception( "Setup failed:" );
				// Figure out what's wrong
				
			}
		}
	}
	
	public SetupFacade retrieveByIdentity( int idx )
	{
		return this.getBuffers().get( idx );
	}
	
	public void add( SetupFacade facade )
	{
		if( facade.getApplication() == null )
		{
			facade.setApplication(
				this.getApplication()
			);
		}
		
		this.getBuffers().add( facade );
	}
	
	public void removeByIdentity( int setupIdx )
	{
		this.getBuffers().remove( setupIdx );
	}
	
	
	// Sort
	protected void sortByPriority()
	{
		Collections.sort( this.getBuffers());
	}
	
	
	// Accessors
	public List <SetupFacade> getBuffers()
	{
		return this.buffers;
	}
	
	public Application getApplication()
	{
		return this.application;
	}
	
	public void setBuffers( List <SetupFacade> buffers )
	{
		this.buffers = buffers;
	}
	
	public void setApplication( Application application )
	{
		this.application = application;
	}
	
	
	@Override
	public final String toString()
	{
		int idx;
		
		for( idx = 0;
			 idx < this.buffers.size();
			 idx++ )
		{
			SetupFacade sf = this.buffers.get( idx );
			System.out.println(sf.getName());
		}
		
		return super.toString();
	}
}
