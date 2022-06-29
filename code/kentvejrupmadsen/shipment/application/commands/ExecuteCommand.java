	package kentvejrupmadsen.shipment.application.commands;
	
	
	/**
	 * @author Kent Madsen
	 */
	public abstract class ExecuteCommand
		extends CommandProcess
	{
		/**
		 * 
		 * @param commandName
		 */
		public ExecuteCommand( String commandName )
		{
			this.setName( commandName );
		}
	}
