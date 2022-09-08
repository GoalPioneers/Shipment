	package main.java.com.goalpioneers.shipment.api.console.ioi;
	
	import java.io.InputStream;
	import java.io.PrintStream;
	
	
	/**
	 *
	 */
	public class IOProperties
	{
		// Constructors
		public IOProperties()
		{
			this( System.in,
				  System.out );
		}
		
		public IOProperties( InputStream in,
							 PrintStream out )
		{
			this.setIn( in );
			this.setOut( out );
		}
		
		// Variables
		private InputStream in = null;
		private PrintStream out = null;
		
		
		// Accessors
		public InputStream getIn()
		{
			return this.in;
		}
		
		public PrintStream getOut()
		{
			return this.out;
		}
		
		protected void setIn( InputStream in )
		{
			this.in = in;
		}
		
		protected void setOut( PrintStream out )
		{
			this.out = out;
		}
		
		@Override
		public String toString()
		{
			return super.toString();
		}
	}
