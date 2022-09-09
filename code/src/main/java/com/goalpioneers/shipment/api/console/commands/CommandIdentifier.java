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
	public class CommandIdentifier
	{
		// Constructors
		/**
		 *
		 */
		public CommandIdentifier()
		{
			this( null );
		}
		
		/**
		 *
		 * @param value
		 */
		public CommandIdentifier( String value )
		{
			this.setValue( value );
		}
		
		// Variables
		private String value;
		
		
		// Accessors
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
			if( value == null )
			{
				this.value = null;
				return;
			}
			
			this.value = value.toLowerCase();
		}
		
		
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
