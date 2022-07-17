package com.goalpioneers.shipment.domain;


import java.util.List;

import com.goalpioneers.shipment.actors.arguments.ArgumentParserActor;
import com.goalpioneers.shipment.actors.commands.CommandConsoleActor;


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
		this.setDomainState(
				new DomainState() 
		);
		
		this.getActors().add( 
			new CommandConsoleActor( 
				this.getDomainState() 
			) 
		);
		
		this.setArgumentsActor(
			new ArgumentParserActor( 
				this.getDomainState() 
			)
		);
	}
	
	
	// Variables
	/**
	 * 
	 */
	private DomainFacade domainState;
	
	/**
	 * 
	 */
	private List<ActorFacade> actors = null;
	
	/**
	 * 
	 */
	private ArgumentParserActor argumentsActor = null;
	
	
	// Code
	/**
	 * 
	 * @param arguments
	 */
	public void insertionOfArguments( String[] arguments )
	{
		this.getArgumentsActor().insertArguments( arguments );
	}
	
	
	/**
	 *
	 */
	public void initialise()
	{
		
	}
	
	/**
	 *
	 */
	public void execute()
	{
		
	}
	
	/**
	 *
	 */
	public void gc()
	{
		
	}
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public DomainFacade getDomainState() 
	{
		return domainState;
	}
	
	
	/**
	 * 
	 * @param domainState
	 */
	public void setDomainState( DomainFacade domainState ) 
	{
		this.domainState = domainState;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArgumentParserActor getArgumentsActor() 
	{
		return argumentsActor;
	}
	
	/**
	 * 
	 * @param argumentsActor
	 */
	public void setArgumentsActor(ArgumentParserActor argumentsActor) 
	{
		this.argumentsActor = argumentsActor;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<ActorFacade> getActors() 
	{
		return actors;
	}
	
	/**
	 * 
	 * @param actors
	 */
	public void setActors( List<ActorFacade> actors ) 
	{
		this.actors = actors;
	}
}
