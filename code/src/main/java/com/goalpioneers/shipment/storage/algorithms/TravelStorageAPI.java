	package main.java.com.goalpioneers.shipment.storage.algorithms;
	
	import main.java.com.goalpioneers.shipment.storage.algorithms.configuration.TravelProperty;
	import main.java.com.goalpioneers.shipment.storage.algorithms.configuration.TravelSettings;
	import main.java.com.goalpioneers.shipment.storage.algorithms.implementation.SearcherImplementation;
	import main.java.com.goalpioneers.shipment.storage.algorithms.implementation.TravelAlgorithm;
	import main.java.com.goalpioneers.shipment.storage.algorithms.implementation.WatcherImplementation;
	
	
	public class TravelStorageAPI
	{
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
		
		private void setup_searcher()
		{
			this.setAlgorithm( new SearcherImplementation() );
		}
		
		private void setup_watcher()
		{
			this.setAlgorithm( new WatcherImplementation() );
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
		
		public TravelAlgorithm getAlgorithm()
		{
			return this.algorithm;
		}
		
		
		protected void setAlgorithm( TravelAlgorithm algorithm )
		{
			this.algorithm = algorithm;
		}
	}
