	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
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
			this.setProperties( new IOProperties() );
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
		public final void setProperties( IOProperties properties )
		{
			this.properties = properties;
		}
	}
