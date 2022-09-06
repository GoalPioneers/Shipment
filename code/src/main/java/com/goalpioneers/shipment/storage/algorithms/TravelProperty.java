package main.java.com.goalpioneers.shipment.storage.algorithms;


public class TravelProperty
{
	public TravelProperty( String pathRoot )
	{
		this.setRoot( pathRoot );
	}
	
	private String root = null;
	
	public String getRoot()
	{
		return this.root;
	}
	
	public void setRoot( String root )
	{
		this.root = root;
	}
}
