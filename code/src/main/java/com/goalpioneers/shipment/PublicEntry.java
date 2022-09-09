/**
  * Author: Goal Pioneers, Kent v. Madsen
  * Contact: Kent.vejrup.madsen@goalpioneers.com
  * Company: Goal-Pioneers, 41157089
  * Links
  ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
  ** Issues: https://github.com/GoalPioneers/Shipment/issues
  */
	package main.java.com.goalpioneers.shipment;


	/**
	 * @author Kent vejrup Madsen
	 * @author Goal Pioneers
	 */
	public class PublicEntry
	{
		// Entries
		/**
		 *
		 * @param arguments
		 */
		public static void main( String[] arguments )
		{
			BusAPI bus;
			
			if( arguments.length == 0 )
			{
				bus = new ApplicationBus( null );
			}
			else
			{
				bus = new ApplicationBus( arguments );
			}
			
			bus.setup();
			bus.run();
		}
	}
