package kentvejrupmadsen.shipment.application.commands;

import kentvejrupmadsen.shipment.application.interactive.Interaction;


/**
 * 
 * @author Kent Madsen
 */
public abstract class CommandProcess
{
	/**
	 *
	 * @param actor
	 */
	public CommandProcess( Interaction actor )
	{
		this.setActor( actor );
	}
	
	private String name = null;
	
	private Interaction actor;
	
	/**
	 * @author Kent Madsen
	 */
	public final String getName()
	{
		return name;
	}
	
	
	/**
	 * @author Kent Madsen
	 */
	protected final void setName( String name )
	{
		this.name = name;
	}
	
	
	/**
	 *
	 * @param actor
	 */
	protected final void setActor( Interaction actor )
	{
		this.actor = actor;
	}
	
	
	/**
	 *
	 * @return
	 */
	public final Interaction getActor()
	{
		return actor;
	}
}
