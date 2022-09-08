/**
 *
 */
package main.java.com.goalpioneers.shipment.api.console.commands;


/**
 *
 */
public class CommandIdentifier
{
	// Constructors
	/**
	 *
	 */
	public CommandIdentifier()
	{
		this( null );
	}
	
	/**
	 *
	 * @param value
	 */
	public CommandIdentifier( String value )
	{
		this.setValue( value );
	}
	
	// Variables
	private String value;
	
	
	// Accessors
	/**
	 *
	 * @return
	 */
	public final String getValue()
	{
		return this.value;
	}
	
	/**
	 *
	 * @param value
	 */
	public final void setValue( String value )
	{
		this.value = value.toLowerCase();
	}
	
	
	/**
	 *
	 * @return
	 */
	@Override
	public final String toString()
	{
		return super.toString();
	}
}
