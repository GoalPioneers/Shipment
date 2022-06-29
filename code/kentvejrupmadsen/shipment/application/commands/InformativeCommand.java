	package kentvejrupmadsen.shipment.application.commands;
	
	
	/**
	 * @author Kent Madsen
	 */
	public abstract class InformativeCommand
		extends CommandProcess
	{
		/**
		 * 
		 * @param commandName
		 */
		public InformativeCommand( String commandName )
		{
			this.setName( commandName );
		}
	
	}
