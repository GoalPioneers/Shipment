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
		public final ConsoleInterpreter getInterpreter()
		{
			return this.interpreter;
		}
		
		
		public final void setInterpreter( ConsoleInterpreter interpreter )
		{
			this.interpreter = interpreter;
		}
		
		
		@Override
		public String toString()
		{
			return super.toString();
		}
	}
