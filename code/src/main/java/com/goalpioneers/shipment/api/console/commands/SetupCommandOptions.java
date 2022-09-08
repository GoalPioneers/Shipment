	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	
	
	
	public class SetupCommandOptions
	{
		public SetupCommandOptions()
		{
		
		}
		
		// Variables
		private CommandIdentifier currentIdentifier = null;
		
		// Code
		public final CommandOption generate( String value )
		{
			if( this.isCurrentIdentifierEmpty() )
			{
				return new CommandOption(null, value);
			}
			
			return this.generate( value, this.getCurrentIdentifier() );
		}
		
		public final CommandOption generate( String value, CommandIdentifier identifier )
		{
			return new CommandOption( identifier, value );
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
		
		// States
		public final boolean isCurrentIdentifierEmpty()
		{
			return this.currentIdentifier == null;
		}
		
		@Override
		public String toString()
		{
			return super.toString();
		}
	}
