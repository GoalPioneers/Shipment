package main.java.com.goalpioneers.shipment.api.console.commands;


public class CommandParser
{
	public CommandParser()
	{
	
	}
	
	// Variables
	private CommandInterpreter interpreter = null;
	private SetupCommandOptions setup = null;
	
	
	// Accessors
	public void setInterpreter( CommandInterpreter interpreter )
	{
		this.interpreter = interpreter;
	}
	
	public CommandInterpreter getInterpreter()
	{
		return this.interpreter;
	}
	
	public SetupCommandOptions getSetup()
	{
		return this.setup;
	}
	
	public void setSetup( SetupCommandOptions setup )
	{
		this.setup = setup;
	}
	
	//
	@Override
	public String toString()
	{
		return super.toString();
	}
}
