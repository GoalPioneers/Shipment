	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	import java.util.ArrayList;
	import java.util.List;
	
	
	public abstract class CommandLine
	{
		public CommandLine( String key )
		{
			this( key,
				  new ArrayList <CommandOption>() );
		}
		
		public CommandLine( String key,
							List<CommandOption> options )
		{
			this.setKey( key );
			this.setOptions( options );
		}
		
		
		// Variables
		private String key = null;
		
		private List <CommandOption> options = null;
		
		
		// Accessors
		public final List <CommandOption> getOptions()
		{
			return this.options;
		}
		
		public final String getKey()
		{
			return this.key;
		}
		
		public final void setOptions( List <CommandOption> options )
		{
			this.options = options;
		}
		
		public final void setKey( String key )
		{
			this.key = key;
		}
		
		// States
		public final boolean isKeyNull()
		{
			return this.key == null;
		}
		
		
		public final boolean isKeyEmpty()
		{
			return this.isKeyNull() ||
				   isZero( this.key.length() );
		}
		
		public boolean isOptionsNull()
		{
			return this.options == null;
		}
		
		public final boolean isOptionsEmpty()
		{
			return this.isOptionsNull() ||
				   isZero( this.options.size() );
		}
		
		protected static boolean isZero( int a )
		{
			return a == 0;
		}
	}
