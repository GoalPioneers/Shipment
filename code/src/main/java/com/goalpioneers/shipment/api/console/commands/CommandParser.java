	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	
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
