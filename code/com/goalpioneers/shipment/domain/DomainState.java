package com.goalpioneers.shipment.domain;


import com.goalpioneers.shipment.domain.templates.DomainFacade;

/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class DomainState 
	implements DomainFacade
{
	public DomainState( Boolean keepLoopState )
	{
		this.setKeepLoop( keepLoopState );
	}
	
	
	// Variables
	private boolean keepLoop;
	
	//
	/**
	 * 
	 * @return
	 */
	@Override
	public boolean isToKeepLoop() 
	{
		return this.keepLoop;
	}
	
	/**
	 * 
	 * @param keepLoop
	 */
	@Override
	public void setKeepLoop( boolean keepLoop ) 
	{
		this.keepLoop = keepLoop;
	}
}
