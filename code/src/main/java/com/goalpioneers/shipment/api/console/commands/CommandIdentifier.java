package main.java.com.goalpioneers.shipment.api.console.commands;


public class CommandIdentifier
{
	public CommandIdentifier()
	{
	
	}
	
	public CommandIdentifier( String value )
	{
		this.setValue( value );
	}
	
	//
	private String value = null;
	
	// Accessors
	public final String getValue()
	{
		return this.value;
	}
	
	public final void setValue( String value )
	{
		this.value = value.toLowerCase();
	}
}
