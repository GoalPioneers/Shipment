	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.api.console;
	
	
	/**
	 *
	 */
	public class ConsoleFacade
	{
		// Constructors
		/**
		 *
		 */
		public ConsoleFacade()
		{
			this.setInterpreter(
				new ConsoleInterpreter()
			);
			
		}
		
		// Variables
		private ConsoleInterpreter interpreter = null;
		
		
		// Accessors
		/**
		 *
		 * @return
		 */
		public final ConsoleInterpreter getInterpreter()
		{
			return this.interpreter;
		}
		
		/**
		 *
		 * @param interpreter
		 */
		public final void setInterpreter( ConsoleInterpreter interpreter )
		{
			this.interpreter = interpreter;
		}
		
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
