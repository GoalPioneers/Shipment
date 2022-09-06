package main.java.com.goalpioneers.shipment.storage.algorithms;


public class TravelStorage
{
	// Constructors
	public TravelStorage( String root )
	{
		this.property = new TravelProperty( root );
		
	}
	
	// Variables
	private TravelProperty property = null;
	private TravelSettings settings = null;
	
	// Codes
	public void list()
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
