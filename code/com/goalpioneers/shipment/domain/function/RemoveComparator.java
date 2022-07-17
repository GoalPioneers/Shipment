package com.goalpioneers.shipment.domain.function;

import java.util.Comparator;


public class RemoveComparator 
	implements Comparator<Integer>
{
	@Override
	public int compare( Integer o1, Integer o2 ) 
	{
		if( o1.intValue() == o2.intValue() )
		{
			return 0;
		}
		
		if( o1 < o2 )
		{
			return 1;
		}
		
		if( o1 > o2 )
		{
			return -1;
		}
		
		return 0;
	}
	
	@Override
	public Comparator<Integer> reversed() 
	{
		return Comparator.super.reversed();
	}
}
