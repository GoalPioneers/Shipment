	/**
	 *
	 */
	package main.java.com.goalpioneers.shipment.api.console.commands;
	

	/**
	 *
	 */
	public class CommandOption
	{
		/**
		 *
		 * @param identifier
		 * @param value
		 */
		public CommandOption( CommandIdentifier identifier, String value )
		{
			this.setIdentifier( identifier );
			this.setValue( value );
		}
		
		// Variables
		private CommandIdentifier identifier = null;
		
		private String value = null;
		
		
		// Accessors
		/**
		 *
		 * @return
		 */
		public final CommandIdentifier getIdentifier()
		{
			return this.identifier;
		}
		
		/**
		 *
		 * @param identifier
		 */
		public final void setIdentifier( CommandIdentifier identifier )
		{
			this.identifier = identifier;
		}
		
		/**
		 *
		 * @return
		 */
		public final String getValue()
		{
			return this.value;
		}
		
		/**
		 *
		 * @param value
		 */
		public final void setValue( String value )
		{
			this.value = value;
		}
		
		// Object Extensions
		/**
		 *
		 * @return
		 */
		@Override
		public final String toString()
		{
			return super.toString();
		}
	}
