	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	
	
	
	public class SetupCommandOptions
	{
		public SetupCommandOptions()
		{
		
		}
		
		// Variables
		private CommandIdentifier currentIdentifier = null;
		
		// Code
		public final CommandOption generate()
		{
			return null;
		}
		
		public final CommandOption generate( CommandIdentifier identifier )
		{
			return null;
		}
		
		// Accessors
		public final CommandIdentifier getCurrentIdentifier()
		{
			return this.currentIdentifier;
		}
		
		public final void setCurrentIdentifier( CommandIdentifier currentIdentifier )
		{
			this.currentIdentifier = currentIdentifier;
		}
	}
