/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.debug.junit4;

import com.goalpioneers.debug.junit4.tests.TestSystem;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class JUnitEntry
{
	/**
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		Result result = JUnitCore.runClasses( TestSystem.class );
		
		for( Failure failure: result.getFailures() )
		{
			System.out.println( failure.toString() );
		}
		
		System.out.println( result.wasSuccessful() );
	}
}
