	package kentvejrupmadsen.shipment.application.commands;
	
	/**
	 * @author Kent Madsen
	 */
	public abstract class CommandProcess
	{
		
		private String name = null;
		
		public final String getName()
		{
			return name;
		}
		
		protected final void setName( String name )
		{
			this.name = name;
		}
	}
