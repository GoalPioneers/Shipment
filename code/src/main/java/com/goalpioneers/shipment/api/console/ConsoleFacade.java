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
				new CommandInterpreter()
			);
			
		}
		
		// Variables
		private CommandParser parser = null;
		
		private CommandInterpreter interpreter = null;
		
		
		// Accessors
		/**
		 *
		 * @return
		 */
		public final CommandInterpreter getInterpreter()
		{
			return this.interpreter;
		}
		
		/**
		 *
		 * @param interpreter
		 */
		public final void setInterpreter( CommandInterpreter interpreter )
		{
			this.interpreter = interpreter;
		}
		
		/**
		 *
		 *
		 * @return
		 */
		public final CommandParser getParser()
		{
			return this.parser;
		}
		
		/**
		 *
		 * @param parser
		 */
		public final void setParser( CommandParser parser )
		{
			this.parser = parser;
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
