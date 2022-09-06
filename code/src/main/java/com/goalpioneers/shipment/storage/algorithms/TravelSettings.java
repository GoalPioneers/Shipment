package main.java.com.goalpioneers.shipment.storage.algorithms;


public class TravelSettings
{
	/**
	 *
	 */
	public TravelSettings()
	{
	
	}
	
	// Variables
	private TravelAlgorithm algorithm = TravelAlgorithm.Search;
	
	// Accessors
	public TravelAlgorithm getAlgorithm()
	{
		return this.algorithm;
	}
	
	public void setAlgorithm( TravelAlgorithm algorithm )
	{
		this.algorithm = algorithm;
	}
}
