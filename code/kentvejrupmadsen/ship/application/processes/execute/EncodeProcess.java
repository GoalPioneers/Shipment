	package kentvejrupmadsen.ship.application.processes.execute;
	
	import kentvejrupmadsen.ship.application.commands.ExecuteCommand;
	
	/**
	 * @author Kent Madsen
	 */
	public class EncodeProcess 
			extends ExecuteCommand
	{
		public EncodeProcess()
		{
			super( "encode" );
		}
	}
