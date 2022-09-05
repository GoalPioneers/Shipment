	package main.java.com.goalpioneers.shipment.api.console.ioi;

	import main.java.com.goalpioneers.shipment.api.console.ConsoleProperties;
	
	
	public class IOBasicInterface
		implements IOInterface
	{
		public IOBasicInterface()
		{
			this.setProperties( new ConsoleProperties() );
		}
		
		private ConsoleProperties properties = null;
		
		public ConsoleProperties getProperties()
		{
			return properties;
		}
		
		public void setProperties( ConsoleProperties properties )
		{
			this.properties = properties;
		}
	}
