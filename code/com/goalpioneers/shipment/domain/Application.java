package com.goalpioneers.shipment.domain;


import java.util.ArrayList;
import java.util.List;

import com.goalpioneers.shipment.actors.arguments.ArgumentParserActor;
import com.goalpioneers.shipment.actors.commands.CommandConsoleActor;
import com.goalpioneers.shipment.domain.function.RemoveComparator;
import com.goalpioneers.shipment.domain.templates.ActorFacade;
import com.goalpioneers.shipment.domain.templates.DomainFacade;


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
				new DomainState( true )
		);
		
		this.setActors( new ArrayList<>() );
		
		this.getActors().add( 
			new CommandConsoleActor( 
				this.getDomainState() 
			) 
		);
		
		this.getActors().add(
				new CommandConsoleActor(
						this.getDomainState()
				)
		);
		
		this.getActors().add(
				new CommandConsoleActor(
						this.getDomainState()
				)
		);
		
		this.getActors().add(
				new CommandConsoleActor(
						this.getDomainState()
				)
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
		
		this.setToBeRemoved(
			new ArrayList<>() 
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
	
	/**
	 * 
	 */
	private List<Integer> toBeRemoved = null;
	
	
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
	 * Initialises aspects of the application and configurations needed to make it run
	 */
	public void initialise()
	{
		this.getArgumentsActor().run();
	}
	
	/**
	 * Executes the application functions
	 */
	public void execute()
	{
		boolean stopNoActors = false;
		
		while( this.getDomainState().isToKeepLoop() && !stopNoActors )
		{
			int idx = 0;
			
			int sizeOf = this.getActors().size();
			
			if( sizeOf == 0 )
			{
				stopNoActors = true;
			}
			
			for( idx = 0; 
			     idx < sizeOf; 
				 idx++ )
			{
				ActorFacade currentFacade = this.getActors().get( idx );
				currentFacade.run();
				
				// Add to removal list
				if( !currentFacade.isToRun() )
				{
					boolean exist = this.getToBeRemoved().contains( idx );
					
					// Only if it isn't already on the list, NOT Logic
					if( !exist )
					{
						this.getToBeRemoved().add( idx );
					}
				}
			}
			
			this.removeActors();
		}
	}
	
	/**
	 * Cleans up files and exits application gracefully
	 */
	public void gc()
	{
		
	}
	
	private void sortRemoval()
	{
		List<Integer> l = this.getToBeRemoved();
		l.sort( new RemoveComparator() );
		
		this.setToBeRemoved( l );
	}
	
	/**
	 * 
	 */
	protected void removeActors()
	{
		int idx = 0;
		int sizeOf = this.getToBeRemoved().size();
		
		this.sortRemoval();
		
		for( idx = 0; 
		     idx < sizeOf; 
			 idx++ )
		{
			int removeIdx = this.getToBeRemoved().get( idx );
			
			this.getActors().remove( removeIdx );
		}
		
		this.getToBeRemoved().clear();
	}
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public DomainFacade getDomainState() 
	{
		return this.domainState;
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
		return this.argumentsActor;
	}
	
	/**
	 * 
	 * @param argumentsActor
	 */
	public void setArgumentsActor( ArgumentParserActor argumentsActor ) 
	{
		this.argumentsActor = argumentsActor;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<ActorFacade> getActors() 
	{
		return this.actors;
	}
	
	/**
	 * 
	 * @param actors
	 */
	public void setActors( List<ActorFacade> actors ) 
	{
		this.actors = actors;
	}
	
	private List<Integer> getToBeRemoved() 
	{
		return toBeRemoved;
	}
	
	private void setToBeRemoved( List<Integer> toBeRemoved ) 
	{
		this.toBeRemoved = toBeRemoved;
	}
}
