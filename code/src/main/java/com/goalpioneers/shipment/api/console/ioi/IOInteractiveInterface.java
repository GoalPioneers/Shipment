	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.api.console.ioi;
	
	import main.java.com.goalpioneers.annotations.classDocument;
	import main.java.com.goalpioneers.annotations.copyright;
	import main.java.com.goalpioneers.annotations.versioning;
	import main.java.com.goalpioneers.shipment.api.console.ConsoleType;
	
	import java.io.Console;
	
	
	/**
	 * @author Kent vejrup Madsen
	 * @author Goal Pioneers
	 */
	@copyright()
	@classDocument()
	@versioning()
	public class IOInteractiveInterface
			implements IOInterface
	{
		/**
		 *
		 */
		public IOInteractiveInterface()
		{
			this.console = System.console();
		}
		
		//
		private Console console = null;
		
		//
		@Override
		public ConsoleType getType()
		{
			return ConsoleType.Interactive;
		}
		
		// Accessors
		public Console getConsole()
		{
			return this.console;
		}
		
		public void setConsole( Console console )
		{
			this.console = console;
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
