package com.goalpioneers.shipment;

import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.io.arguments.ArgumentParserFacade;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class ApplicationEntry
{
	//
	/**
	 * 
	 */
	public ApplicationEntry()
	{
		this.setApplication( 
			new Application() 
		);
	}
	
	//
	private Application application = null;
	
	
	// code
	public void passArguments( String[] arguments )
	{
		ArgumentParserFacade facade = this.getApplication().getArgumentFacade();
		
	}
	
	/**
	 * 
	 */
	public void run()
	{
		this.getApplication().initialise();
		this.getApplication().execute();
		this.getApplication().gc();
	}
	
	
	//
	/**
	 * 
	 * @return
	 */
	public Application getApplication() 
	{
		return application;
	}
	
	
	/**
	 * 
	 * @param application
	 */
	public void setApplication( Application application ) 
	{
		this.application = application;
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		ApplicationEntry entry = new ApplicationEntry();
		entry.run();
	}
}
