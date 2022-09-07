	package main.java.com.goalpioneers.shipment.api.console;
	
	
	public class ConsoleFacade
	{
		public ConsoleFacade()
		{
			this.setInterpreter( new ConsoleInterpreter() );
			
		}
		
		private ConsoleInterpreter interpreter = null;
		
		
		
		public ConsoleInterpreter getInterpreter()
		{
			return this.interpreter;
		}
		
		
		public void setInterpreter( ConsoleInterpreter interpreter )
		{
			this.interpreter = interpreter;
		}
		
	}
