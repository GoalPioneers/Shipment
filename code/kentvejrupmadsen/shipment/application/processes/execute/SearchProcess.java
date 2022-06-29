	package kentvejrupmadsen.shipment.application.processes.execute;

	import kentvejrupmadsen.shipment.application.commands.ExecuteCommand;
	
	
	/**
	 * @author Kent Madsen
	 */
	public class SearchProcess 
		extends ExecuteCommand
	{
		/**
		 * @author Kent Madsen
		 */
		public SearchProcess()
		{
			super("search" );
		}
		
	}