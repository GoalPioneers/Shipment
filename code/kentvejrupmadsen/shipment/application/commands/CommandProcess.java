	package kentvejrupmadsen.shipment.application.commands;
	
	/**
	 * @author Kent Madsen
	 */
	public abstract class CommandProcess
	{
		
		private String name = null;
		
		/**
		 * @author Kent Madsen
		 */
		public final String getName()
		{
			return name;
		}
		
		/**
		 * @author Kent Madsen
		 */
		protected final void setName( String name )
		{
			this.name = name;
		}
	}
