package com.goalpioneers.shipment.domain;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public interface DomainFacade
{
	/**
	 * 
	 * @param value
	 */
	public void setKeepLoop( boolean value );
	
	/**
	 * 
	 * @return
	 */
	public boolean isToKeepLoop();
}
