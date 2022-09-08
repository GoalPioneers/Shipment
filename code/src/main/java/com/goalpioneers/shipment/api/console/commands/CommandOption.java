	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	
	public class CommandOption
	{
		public CommandOption( CommandIdentifier identifier, String value )
		{
			this.setIdentifier( identifier );
			this.setValue( value );
		}
		
		// Variables
		private CommandIdentifier identifier = null;
		
		private String value = null;
		
		
		// Accessors
		public final CommandIdentifier getIdentifier()
		{
			return this.identifier;
		}
		
		public final void setIdentifier( CommandIdentifier identifier )
		{
			this.identifier = identifier;
		}
		
		public final String getValue()
		{
			return this.value;
		}
		
		public final void setValue( String value )
		{
			this.value = value;
		}
		
		// Object Extensions
		@Override
		public final String toString()
		{
			return super.toString();
		}
	}
