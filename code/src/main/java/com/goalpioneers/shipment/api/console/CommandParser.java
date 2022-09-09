	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.api.console;
	
	import main.java.com.goalpioneers.annotations.copyright;
	import main.java.com.goalpioneers.shipment.api.console.commands.SetupCommandOptions;
	
	
	/**
	 * @author Kent vejrup Madsen
	 * @author Goal Pioneers
	 */
	@copyright()
	public class CommandParser
	{
		public CommandParser()
		{
		
		}
		
		// Variables
		private SetupCommandOptions setup = null;
		
		
		// Accessors
		public final SetupCommandOptions getSetup()
		{
			return this.setup;
		}
		
		public final void setSetup( SetupCommandOptions setup )
		{
			this.setup = setup;
		}
		
		
		//
		@Override
		public final String toString()
		{
			return super.toString();
		}
	}
