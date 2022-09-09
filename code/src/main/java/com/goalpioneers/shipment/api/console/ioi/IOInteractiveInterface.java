	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.api.console.ioi;
	
	
	import main.java.com.goalpioneers.shipment.api.console.ConsoleType;
	
	/**
	 *
	 */
	public class IOInteractiveInterface
			implements IOInterface
	{
		/**
		 *
		 */
		public IOInteractiveInterface()
		{
		
		}
		
		@Override
		public ConsoleType getType()
		{
			return ConsoleType.Interactive;
		}
		
		//
		/**
		 *
		 * @return
		 */
		@Override
		public String toString()
		{
			return super.toString();
		}
	}
