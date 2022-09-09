	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	import main.java.com.goalpioneers.annotations.copyright;
	
	
	/**
	 * @author Kent vejrup Madsen
	 * @author Goal Pioneers
	 */
	@copyright()
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
				return new CommandOption( null,
										  value );
			}
			
			return this.generate( value,
								  this.getCurrentIdentifier() );
		}
		
		/**
		 *
		 * @param value
		 * @param identifier
		 * @return
		 */
		public final CommandOption generate( String value,
											 CommandIdentifier identifier )
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
