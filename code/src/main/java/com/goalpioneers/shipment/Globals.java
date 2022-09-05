package main.java.com.goalpioneers.shipment;

import main.java.com.goalpioneers.shipment.api.console.ConsoleFacade;


/**
 *
 */
public abstract class Globals
{
	// Variables
	private static ConsoleFacade consoleSingleton = null;
	
	/**
	 *
	 * @return
	 */
	public static ConsoleFacade getConsoleSingleton()
	{
		if( Globals.consoleSingleton == null )
		{
			Globals.consoleSingleton = new ConsoleFacade();
		}
		
		return Globals.consoleSingleton;
	}
	
	/**
	 *
	 * @param consoleSingleton
	 */
	public static void setConsoleSingleton( ConsoleFacade consoleSingleton )
	{
		Globals.consoleSingleton = consoleSingleton;
	}
}
