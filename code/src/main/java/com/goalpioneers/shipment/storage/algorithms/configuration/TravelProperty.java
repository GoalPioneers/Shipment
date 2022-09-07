	package main.java.com.goalpioneers.shipment.storage.algorithms.configuration;
	
	
	public class TravelProperty
	{
		public TravelProperty( String pathRoot )
		{
			this.setRootPath( pathRoot);
		}
		
		private String rootPath = null;
		
		
		public String getRootPath()
		{
			return this.rootPath;
		}
		
		public void setRootPath( String rootPath )
		{
			this.rootPath = rootPath;
		}
	}
