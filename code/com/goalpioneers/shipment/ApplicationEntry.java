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
	public ApplicationEntry()
	{
		this( null );
	}
	
	/**
	 * 
	 */
	public ApplicationEntry( String[] arguments )
	{
		this.setApplication( 
			new Application() 
		);
		
		this.getApplication().insertionOfArguments( arguments );
	}
	
	//
	private Application application = null;
	
	
	// code
	/**
	 * The applications 3 phases. with specific purposes in mind.
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
	public static void main( String[] arguments )
	{
		ApplicationEntry entry = new ApplicationEntry( arguments );
		entry.run();
	}
}
