/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.functionality.templates;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public abstract class SystemFunction 
{
	// Variables
		// System messages
	private boolean errorOccurred = false;
	
	private String errorMessage = null;
	
		// Debug
	private boolean isDebugging;
	
		// General options flags
	private boolean isMultithreadedEnabled;
	
	
	// Code
	/**
	 * 
	 */
	public abstract void initialise();
	
	/**
	 * 
	 */
	public abstract void execute();
	
	
	/**
	 * System check of the input parameters to make sure, that the state is valid to execute.
	 * if false an error is found.
	 * @return boolean
	 */
	public abstract boolean isValid();
	
	
	/**
	 * 
	 * @return
	 */
	public abstract boolean hasMultithreadingImplemented();
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public final boolean ifErrorOccurred() 
	{
		return this.errorOccurred;
	}
	
	/**
	 * 
	 * @return
	 */
	public final String getErrorMessage() 
	{
		return this.errorMessage;
	}
	
	/**
	 * 
	 * @param errorOccurred
	 */
	protected final void setErrorOccurred( boolean errorOccurred ) 
	{
		this.errorOccurred = errorOccurred;
	}
	
	/**
	 * 
	 * @param errorMessage
	 */
	protected final void setErrorMessage( String errorMessage ) 
	{
		this.errorMessage = errorMessage;
	}
	
	/**
	 * 
	 * @return
	 */
	public final boolean isDebugging() 
	{
		return isDebugging;
	}
	
	/**
	 * 
	 * @param debugging
	 */
	public final void setDebugging( boolean debugging ) 
	{
		isDebugging = debugging;
	}
	
	/**
	 * 
	 * @return
	 */
	public final boolean isMultithreadedEnabled() 
	{
		return isMultithreadedEnabled;
	}
	
	/**
	 * 
	 * @param multithreadedable
	 */
	protected final void setMultithreadedEnabled( boolean multithreadedable ) 
	{
		isMultithreadedEnabled = multithreadedable;
	}
	
}