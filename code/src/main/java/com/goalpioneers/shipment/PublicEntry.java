/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package main.java.com.goalpioneers.shipment;

import main.java.com.goalpioneers.shipment.domain.Application;
import main.java.com.goalpioneers.shipment.facade.setup.SetupBuilder;
import main.java.com.goalpioneers.shipment.facade.setup.SetupFacade;
import main.java.com.goalpioneers.shipment.facade.setup.arguments.SetupByArguments;
import main.java.com.goalpioneers.shipment.facade.setup.cache.SetupByCache;
import main.java.com.goalpioneers.shipment.facade.setup.configuration.SetupByConfiguration;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class PublicEntry
{
	//
	public PublicEntry()
	{
		this( null );
		System.out.println("test");
	}
	
	/**
	 * 
	 */
	public PublicEntry( String[] arguments )
	{
		this.setApplication( 
			new Application() 
		);
		
		this.setBuilder(
			new SetupBuilder(
				this.getApplication()
			)
		);
		
		if( !( arguments == null ) )
		{
			// Set params
			SetupFacade sf = new SetupByArguments( arguments );
			this.getBuilder().add( sf );
		}
	}


	// Variables
	private Application application = null;
	
	private SetupBuilder builder = null;
	
	
	// code
	public final void setup()
	{
		this.getBuilder().add( new SetupByConfiguration() );
		this.getBuilder().add( new SetupByCache() );
		
		this.getBuilder().build();
	}
	
	/**
	 * The applications 3 phases. with specific purposes in mind.
	 */
	public final void run()
	{
		application.initialise();
		application.execution();
		application.clean();
	}
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public final Application getApplication() 
	{
		return this.application;
	}
	
	
	/**
	 * 
	 * @param application
	 */
	protected final void setApplication( Application application ) 
	{
		this.application = application;
	}
	
	/**
	 *
	 * @return
	 */
	public final SetupBuilder getBuilder()
	{
		return this.builder;
	}
	
	/**
	 *
	 * @param builder
	 */
	public final void setBuilder( SetupBuilder builder )
	{
		this.builder = builder;
	}
	
	
	// Entries
	/**
	 * 
	 * @param arguments
	 */
	public static void main( String[] arguments )
	{
		int size_of_args = arguments.length;
		PublicEntry entry = null;

		if( size_of_args == 0 )
		{
			entry = new PublicEntry();
		}
		else
		{
			entry = new PublicEntry( arguments );
		}
		
		entry.setup();
		entry.run();
	}
}
