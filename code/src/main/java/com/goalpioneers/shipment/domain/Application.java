	/**
	 * Author: Goal Pioneers, Kent v. Madsen
	 * Contact: Kent.vejrup.madsen@goalpioneers.com
	 * Company: Goal-Pioneers, 41157089
	 * Links
	 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
	 ** Issues: https://github.com/GoalPioneers/Shipment/issues
	 */
	package main.java.com.goalpioneers.shipment.domain;
	
	import main.java.com.goalpioneers.annotations.copyright;
	
	
	/**
	 * @author Kent v. Madsen
	 * @author Goal Pioneers
	 */
	@copyright()
	public class Application
	{
		/**
		 *
		 */
		public Application()
		{
			this.setProcedure(
				new Procedure()
			);
		}
		
		// Variables
		private Procedure procedure = null;
		
		
		/**
		 *
		 */
		public void initialise()
		{
	
		}
		
		/**
		 *
		 */
		public void execution()
		{
			while( this.procedure.isToContinue() )
			{
				this.procedure.execute();
			}
		}
		
		/**
		 *
		 */
		public void clean()
		{
	
		}
	
		// Accessors
			// Getters
		/**
		 *
		 * @return
		 */
		public Procedure getProcedure()
		{
			return this.procedure;
		}
	
			// Setters
		/**
		 *
		 * @param procedure
		 */
		public void setProcedure( Procedure procedure )
		{
			this.procedure = procedure;
		}
	}
