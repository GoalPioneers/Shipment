	package main.java.com.goalpioneers.shipment.api.console.ioi;
	
	import java.io.InputStream;
	import java.io.PrintStream;
	
	
	/**
	 *
	 */
	public class IOProperties
	{
		// Constructors
		/**
		 *
		 */
		public IOProperties()
		{
			this( System.in,
				  System.out );
		}
		
		/**
		 *
		 * @param in
		 * @param out
		 */
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
		/**
		 *
		 * @return
		 */
		public InputStream getIn()
		{
			return this.in;
		}
		
		/**
		 *
		 * @return
		 */
		public PrintStream getOut()
		{
			return this.out;
		}
		
		/**
		 *
		 * @param in
		 */
		protected void setIn( InputStream in )
		{
			this.in = in;
		}
		
		/**
		 *
		 * @param out
		 */
		protected void setOut( PrintStream out )
		{
			this.out = out;
		}
		
		/**
		 *
		 * @return
		 */
		@Override
		public String toString()
		{
			return super.toString();
		}
	}
