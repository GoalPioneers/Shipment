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
	
	// Accessors
	public TravelProperty getProperty()
	{
		return this.property;
	}
	
	public void setProperty( TravelProperty property )
	{
		this.property = property;
	}
}
