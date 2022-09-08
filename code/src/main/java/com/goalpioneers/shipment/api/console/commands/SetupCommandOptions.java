	/**
	 *
	 */
	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	
	/**
	 *
	 */
	public class SetupCommandOptions
	{
		/**
		 *
		 */
		public SetupCommandOptions()
		{
		
		}
		
		// Variables
		private CommandIdentifier currentIdentifier = null;
		
		// Code
		/**
		 *
		 * @param value
		 * @return
		 */
		public final CommandOption generate( String value )
		{
			if( this.isCurrentIdentifierEmpty() )
			{
				return new CommandOption(null, value);
			}
			
			return this.generate( value, this.getCurrentIdentifier() );
		}
		
		/**
		 *
		 * @param value
		 * @param identifier
		 * @return
		 */
		public final CommandOption generate( String value, CommandIdentifier identifier )
		{
			return new CommandOption( identifier, value );
		}
		
		// Accessors
		/**
		 *
		 * @return
		 */
		public final CommandIdentifier getCurrentIdentifier()
		{
			return this.currentIdentifier;
		}
		
		/**
		 *
		 * @param currentIdentifier
		 */
		public final void setCurrentIdentifier( CommandIdentifier currentIdentifier )
		{
			this.currentIdentifier = currentIdentifier;
		}
		
		// States
		/**
		 *
		 * @return
		 */
		public final boolean isCurrentIdentifierEmpty()
		{
			return this.currentIdentifier == null;
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
