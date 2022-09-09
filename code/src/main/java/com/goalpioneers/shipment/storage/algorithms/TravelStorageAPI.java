	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.storage.algorithms;
	
	import main.java.com.goalpioneers.annotations.copyright;
	import main.java.com.goalpioneers.shipment.storage.algorithms.configuration.TravelProperty;
	import main.java.com.goalpioneers.shipment.storage.algorithms.configuration.TravelSettings;
	import main.java.com.goalpioneers.shipment.storage.algorithms.implementation.SearcherImplementation;
	import main.java.com.goalpioneers.shipment.storage.algorithms.implementation.TravelAlgorithm;
	import main.java.com.goalpioneers.shipment.storage.algorithms.implementation.WatcherImplementation;
	
	
	/**
	 * @author Kent vejrup Madsen
	 * @author Goal Pioneers
	 */
	@copyright()
	public class TravelStorageAPI
	{
		/**
		 *
		 * @param root
		 */
		// Constructors
		public TravelStorageAPI( String root )
		{
			this.property = new TravelProperty( root );
			this.settings = new TravelSettings();
			this.algorithm = null;
			
		}
		
		// Variables
		private TravelProperty property;
		
		private TravelSettings settings;
		
		private TravelAlgorithm algorithm;
		
		
		// Codes
		/**
		 *
		 */
		public void setup()
		{
			switch ( this.settings.getAlgorithm() )
			{
				case Watch:
					this.setup_watcher();
					break;
					
				case Search:
					this.setup_searcher();
					break;
				
				case None:
					System.out.println("");
				
				default:
					break;
			}
		}
		
		/**
		 *
		 */
		private void setup_searcher()
		{
			this.setAlgorithm( new SearcherImplementation() );
		}
		
		/**
		 *
		 */
		private void setup_watcher()
		{
			this.setAlgorithm( new WatcherImplementation() );
		}
		
		// Accessors
		/**
		 *
		 * @return
		 */
		public TravelProperty getProperty()
		{
			return this.property;
		}
		
		/**
		 *
		 * @return
		 */
		public TravelSettings getSettings()
		{
			return this.settings;
		}
		
		/**
		 *
		 * @param property
		 */
		public void setProperty( TravelProperty property )
		{
			this.property = property;
		}
		
		/**
		 *
		 * @param settings
		 */
		public void setSettings( TravelSettings settings )
		{
			this.settings = settings;
		}
		
		/**
		 *
		 * @return
		 */
		public TravelAlgorithm getAlgorithm()
		{
			return this.algorithm;
		}
		
		/**
		 *
		 * @param algorithm
		 */
		protected void setAlgorithm( TravelAlgorithm algorithm )
		{
			this.algorithm = algorithm;
		}
		
		
		/**
		 *
		 * @return
		 */
		@Override
		public final String toString()
		{
			return super.toString();
		}
	}
