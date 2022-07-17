/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.domain.function;

import java.util.Comparator;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class RemoveComparator 
	implements Comparator<Integer>
{
	/**
	 * 
	 * @param o1 the first object to be compared.
	 * @param o2 the second object to be compared.
	 * @return
	 */
	@Override
	public final int compare( Integer o1, Integer o2 ) 
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
}
