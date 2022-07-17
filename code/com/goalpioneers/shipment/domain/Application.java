package com.goalpioneers.shipment.domain;


import java.util.List;

import com.goalpioneers.shipment.io.arguments.ArgumentParserActor;
import com.goalpioneers.shipment.io.commands.CommandConsoleActor;


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
		
		this.setInitialiseWithArguments(
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
	private ArgumentParserActor initialiseWithArguments = null;
	
	
	
	
	// Code
	public void insertionOfArguments( String[] arguments )
	{
		this.getInitialiseWithArguments().getParser().insertArguments( arguments );
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
	public ArgumentParserActor getInitialiseWithArguments() 
	{
		return initialiseWithArguments;
	}
	
	/**
	 * 
	 * @param initialiseWithArguments
	 */
	public void setInitialiseWithArguments( ArgumentParserActor initialiseWithArguments ) 
	{
		this.initialiseWithArguments = initialiseWithArguments;
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
