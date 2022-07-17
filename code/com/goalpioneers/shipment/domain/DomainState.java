/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
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
