/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.domain;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
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

	public void initialise()
	{

	}

	public void execution()
	{
		while( this.procedure.isToContinue() )
		{
			this.procedure.execute();
		}
	}

	public void clean()
	{

	}

	// Variables
	private Procedure procedure = null;

	// Accessors
		// Getters
	public Procedure getProcedure()
	{
		return this.procedure;
	}

		// Setters
	public void setProcedure( Procedure procedure )
	{
		this.procedure = procedure;
	}
}
