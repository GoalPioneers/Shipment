	package main.java.com.goalpioneers.shipment.commands;
	
	import java.util.ArrayList;
	import java.util.List;
	
	
	public abstract class CommandLine
	{
		public CommandLine( String key )
		{
			this( key, new ArrayList <CommandOption>() );
		}
		
		public CommandLine( String key, List<CommandOption> options)
		{
			this.setKey( key );
			this.setOptions( options );
		}
		
		private String key = null;
		private List <CommandOption> options = null;
		
		public List <CommandOption> getOptions()
		{
			return this.options;
		}
		
		public String getKey()
		{
			return this.key;
		}
		
		public void setOptions( List <CommandOption> options )
		{
			this.options = options;
		}
		
		public void setKey( String key )
		{
			this.key = key;
		}
	}
