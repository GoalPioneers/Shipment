package com.goalpioneers.shipment.junit4;

import com.goalpioneers.shipment.junit4.tests.TestSystem;

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
