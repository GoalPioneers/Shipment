package com.goalpioneers.shipment.junit4;


import com.goalpioneers.shipment.junit4.tests.TestsSystem;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JUnitEntry
{
	public static void main( String[] args )
	{
		Result result = JUnitCore.runClasses( TestsSystem.class );
		
		for( Failure failure: result.getFailures() )
		{
			System.out.println( failure.toString() );
		}
		
		System.out.println( result.wasSuccessful() );
	}
}
