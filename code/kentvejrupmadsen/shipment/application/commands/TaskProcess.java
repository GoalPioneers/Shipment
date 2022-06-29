	package kentvejrupmadsen.shipment.application.commands;
	
	
	/**
	 * @author Kent Madsen
	 */
	public abstract class TaskProcess
		extends CommandProcess
	{
		/**
		 * 
		 * @param commandName
		 */
		public TaskProcess( String commandName )
		{
			this.setName( commandName );
		}
	
	}
