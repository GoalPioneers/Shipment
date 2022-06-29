	package kentvejrupmadsen.shipment.application.processes.execute;
	
	import kentvejrupmadsen.shipment.application.commands.ExecuteCommand;
	
	/**
	 * @author Kent Madsen
	 */
	public class FormatProcess
		extends ExecuteCommand
	{
		public FormatProcess()
		{
			super("format" );
		}
	}
