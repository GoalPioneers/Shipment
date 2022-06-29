	package kentvejrupmadsen.shipment.application.commands;
	
	
	/**
	 * @author Kent Madsen
	 */
	public abstract class InformativeCommand
		extends CommandProcess
	{
		/**
		 * @author Kent Madsen
		 * @param commandName
		 */
		public InformativeCommand( String commandName )
		{
			this.setName( commandName );
		}
	
	}
