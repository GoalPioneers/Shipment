package main.java.com.goalpioneers.shipment.storage.algorithms.configuration;


public class TravelSettings
{
	/**
	 *
	 */
	public TravelSettings()
	{
	
	}
	
	// Variables
	private TravelAlgorithmTypes algorithm = TravelAlgorithmTypes.Search;
	
	// Accessors
	public TravelAlgorithmTypes getAlgorithm()
	{
		return this.algorithm;
	}
	
	public void setAlgorithm( TravelAlgorithmTypes algorithm)
	{
		this.algorithm = algorithm;
	}
}
