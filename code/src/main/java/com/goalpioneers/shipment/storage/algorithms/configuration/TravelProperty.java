	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.storage.algorithms.configuration;
	
	import main.java.com.goalpioneers.annotations.classDocument;
	import main.java.com.goalpioneers.annotations.copyright;
	import main.java.com.goalpioneers.annotations.versioning;
	
	
	/**
	 * @author Kent vejrup Madsen
	 * @author Goal Pioneers
	 */
	@copyright()
	@classDocument()
	@versioning()
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
