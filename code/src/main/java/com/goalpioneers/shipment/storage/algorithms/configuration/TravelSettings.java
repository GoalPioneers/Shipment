	package main.java.com.goalpioneers.shipment.storage.algorithms.configuration;
	
	
	public class TravelSettings
	{
		/**
		 *
		 */
		public TravelSettings()
		{
			this.setAlgorithm( TravelAlgorithmTypes.Search );
			this.setTraverseType( TraverseType.BreathFirst );
		}
		
		// Variables
		private TravelAlgorithmTypes algorithm;
		
		private TraverseType traverseType;
		
		// Accessors
		public TravelAlgorithmTypes getAlgorithm()
		{
			return this.algorithm;
		}
		
		public void setAlgorithm( TravelAlgorithmTypes algorithm)
		{
			this.algorithm = algorithm;
		}
		
		public TraverseType getTraverseType()
		{
			return this.traverseType;
		}
		
		public void setTraverseType(TraverseType traverseType)
		{
			this.traverseType = traverseType;
		}
	}
