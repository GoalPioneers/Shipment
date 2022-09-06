package main.java.com.goalpioneers.shipment.storage.algorithms;

import main.java.com.goalpioneers.shipment.storage.algorithms.configuration.TravelProperty;
import main.java.com.goalpioneers.shipment.storage.algorithms.configuration.TravelSettings;


public class TravelStorageAPI
{
	// Constructors
	public TravelStorageAPI( String root )
	{
		this.property = new TravelProperty( root );
		this.settings = new TravelSettings();
	}
	
	// Variables
	private TravelProperty property;
	
	private TravelSettings settings;
	
	// Codes
	public void setup()
	{
	
	}
	
	
	/**
	 *
	 * @return
	 */
	public boolean hasChildrenDirectories()
	{
		return false;
	}
	
	/**
	 *
	 * @return
	 */
	public boolean hasChildrenFiles()
	{
		return false;
	}
	
	// Accessors
	public TravelProperty getProperty()
	{
		return this.property;
	}
	
	public TravelSettings getSettings()
	{
		return this.settings;
	}
	
	public void setProperty( TravelProperty property )
	{
		this.property = property;
	}
	
	public void setSettings( TravelSettings settings )
	{
		this.settings = settings;
	}
}
