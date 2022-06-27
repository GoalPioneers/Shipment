	package kentvejrupmadsen.ship.application.commands;
	
	public abstract class CommandProcess
	{
		private String name = null;
		
		public final String getName()
		{
			return name;
		}
		
		public final void setName( String name )
		{
			this.name = name;
		}
	}
