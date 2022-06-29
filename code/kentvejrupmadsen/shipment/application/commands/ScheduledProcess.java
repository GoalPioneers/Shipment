	package kentvejrupmadsen.shipment.application.commands;
	
	
	/**
	 * @author Kent Madsen
	 */
	public abstract class ScheduledProcess
		extends CommandProcess
	{
		/**
		 * 
		 * @param commandName
		 */
		public ScheduledProcess( String commandName )
		{
			this.setName( commandName );
		}
	
	}
