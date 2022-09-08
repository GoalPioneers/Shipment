	package main.java.com.goalpioneers.shipment.storage.algorithms.configuration;
	

	/**
	 *
	 */
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
		/**
		 *
		 * @return
		 */
		public TravelAlgorithmTypes getAlgorithm()
		{
			return this.algorithm;
		}
		
		/**
		 *
		 * @param algorithm
		 */
		public void setAlgorithm( TravelAlgorithmTypes algorithm )
		{
			this.algorithm = algorithm;
		}
		
		/**
		 *
		 * @return
		 */
		public TraverseType getTraverseType()
		{
			return this.traverseType;
		}
		
		/**
		 *
		 * @param traverseType
		 */
		public void setTraverseType( TraverseType traverseType )
		{
			this.traverseType = traverseType;
		}
	}
