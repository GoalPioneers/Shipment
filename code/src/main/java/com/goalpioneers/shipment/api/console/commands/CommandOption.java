	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	
	/**
	 * @author Kent vejrup Madsen
	 * @author Goal Pioneers
	 */
	public class CommandOption
	{
		/**
		 *
		 * @param identifier
		 * @param value
		 */
		public CommandOption( CommandIdentifier identifier,
							  String value )
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
