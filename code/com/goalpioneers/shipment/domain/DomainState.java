package com.goalpioneers.shipment.domain;


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
	public boolean isKeepLoop() 
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
