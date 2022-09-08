	package main.java.com.goalpioneers.shipment.storage.algorithms.configuration;
	

	/**
	 *
	 */
	public class TravelProperty
	{
		/**
		 *
		 * @param pathRoot
		 */
		public TravelProperty( String pathRoot )
		{
			this.setRootPath( pathRoot);
		}
		
		private String rootPath = null;
		
		//
		/**
		 *
		 * @return
		 */
		public String getRootPath()
		{
			return this.rootPath;
		}
		
		/**
		 *
		 * @param rootPath
		 */
		public void setRootPath( String rootPath )
		{
			this.rootPath = rootPath;
		}
	}
