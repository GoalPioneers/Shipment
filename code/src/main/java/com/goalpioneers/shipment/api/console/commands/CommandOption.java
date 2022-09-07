	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	
	public class CommandOption
	{
		public CommandOption( CommandIdentifier identifier )
		{
			this.setIdentifier( identifier );
		}
		
		// Variables
		private CommandIdentifier identifier = null;
		
		private String value = null;
		
		// Accessors
		public CommandIdentifier getIdentifier()
		{
			return this.identifier;
		}
		
		public void setIdentifier( CommandIdentifier identifier )
		{
			this.identifier = identifier;
		}
		
		public String getValue()
		{
			return this.value;
		}
		
		public void setValue( String value )
		{
			this.value = value;
		}
	}
