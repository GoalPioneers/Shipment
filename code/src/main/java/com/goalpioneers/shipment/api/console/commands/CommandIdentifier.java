package main.java.com.goalpioneers.shipment.api.console.commands;


public class CommandIdentifier
{
	// Constructors
	public CommandIdentifier()
	{
		this( null );
	}
	
	public CommandIdentifier( String value )
	{
		this.setValue( value );
	}
	
	// Variables
	private String value;
	
	
	// Accessors
	public final String getValue()
	{
		return this.value;
	}
	
	public final void setValue( String value )
	{
		this.value = value.toLowerCase();
	}
	
	@Override
	public final String toString()
	{
		return super.toString();
	}
}
