	/**
	 * Basic Console.
	 */
	package main.java.com.goalpioneers.shipment.api.console.ioi;
	
	
	/**
	 *
	 */
	public class IOBasicInterface
		implements IOInterface
	{
		/**
		 *
		 */
		public IOBasicInterface()
		{
			this.setProperties( new IOProperties());
		}
		
		// Variables
		private IOProperties properties = null;
		
		// Accessors
		/**
		 *
		 * @return
		 */
		public final IOProperties getProperties()
		{
			return this.properties;
		}
		
		/**
		 *
		 * @param properties
		 */
		public final void setProperties( IOProperties properties)
		{
			this.properties = properties;
		}
	}
