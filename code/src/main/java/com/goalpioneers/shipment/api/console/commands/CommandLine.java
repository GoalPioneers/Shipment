	package main.java.com.goalpioneers.shipment.api.console.commands;
	
	import java.util.ArrayList;
	import java.util.List;
	
	
	/**
	 *
	 */
	public abstract class CommandLine
	{
		// Constructors
		/**
		 *
		 * @param key
		 */
		public CommandLine( String key )
		{
			this( key,
				  new ArrayList <CommandOption>() );
		}
		
		
		/**
		 *
		 * @param key
		 * @param options
		 */
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
		/**
		 *
		 * @return
		 */
		public final List <CommandOption> getOptions()
		{
			return this.options;
		}
		
		/**
		 *
		 * @return
		 */
		public final String getKey()
		{
			return this.key;
		}
		
		/**
		 *
		 * @param options
		 */
		public final void setOptions( List <CommandOption> options )
		{
			this.options = options;
		}
		
		/**
		 *
		 * @param key
		 */
		public final void setKey( String key )
		{
			this.key = key;
		}
		
		// States
		/**
		 *
		 * @return
		 */
		public final boolean isKeyNull()
		{
			return this.key == null;
		}
		
		/**
		 *
		 * @return
		 */
		public final boolean isKeyEmpty()
		{
			return this.isKeyNull() ||
				   isZero( this.key.length() );
		}
		
		/**
		 *
		 * @return
		 */
		public boolean isOptionsNull()
		{
			return this.options == null;
		}
		
		/**
		 *
		 * @return
		 */
		public final boolean isOptionsEmpty()
		{
			return this.isOptionsNull() ||
				   isZero( this.options.size() );
		}
		
		/**
		 *
		 * @param a
		 * @return
		 */
		protected static boolean isZero( int a )
		{
			return a == 0;
		}
	}
