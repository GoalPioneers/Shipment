package main.java.com.goalpioneers.shipment.facade;

import main.java.com.goalpioneers.shipment.api.console.ConsoleFacade;


/**
 *
 */
public abstract class GlobalFacades
{
	private static ConsoleFacade consoleSingleton = null;
	
	
	/**
	 *
	 * @return
	 */
	public static ConsoleFacade getConsoleSingleton()
	{
		if( GlobalFacades.consoleSingleton == null )
		{
			GlobalFacades.consoleSingleton = new ConsoleFacade();
		}
		
		return GlobalFacades.consoleSingleton;
	}
	
	/**
	 *
	 * @param consoleSingleton
	 */
	public static void setConsoleSingleton( ConsoleFacade consoleSingleton )
	{
		GlobalFacades.consoleSingleton = consoleSingleton;
	}
}
