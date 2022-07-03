package kentvejrupmadsen.shipment.application.interactive;

// Internal libraries
import kentvejrupmadsen.shipment.StateController;

// External libraries
import java.util.Scanner;


/**
 * @author Kent Madsen
 */
public class InteractiveConsole
		implements Interaction
{
	/**
	 * @author Kent Madsen
	 */
	public InteractiveConsole()
	{
		this.setBuffer(
				new ConsoleBuffer()
		);
	}
	
	
	// Variables
	private boolean toContinue = true;
	
	
	private StateController state = null;
	
	private InteractionBuffer buffer = null;
	
	
	// Code
	/**
	 * @author Kent Madsen
	 */
	@Override
	public void askForUserInput()
	{
		Scanner input = new Scanner( System.in );
	}
	
	
	/**
	 *
	 * @param outputMessage
	 */
	@Override
	public void writeOutputToUser( String outputMessage )
	{
		
	}
	
	
	/**
	 *
	 * @param outputCollection
	 */
	@Override
	public void writeOutputCollectionToUser( String[] outputCollection )
	{
		
	}
	
	// Accessors
	/**
	 * @author Kent Madsen
	 * @param state
	 */
	@Override
	public void setState( StateController state )
	{
		this.state = state;
	}
	
	
	/**
	 * @author Kent Madsen
	 * @return
	 */
	@Override
	public boolean isToContinue()
	{
		return this.toContinue;
	}
	
	
	/**
	 * @author Kent Madsen
	 * @param toContinue
	 */
	protected void setToContinue( boolean toContinue )
	{
		this.toContinue = toContinue;
	}
	
	
	/**
	 *
	 * @return
	 */
	public InteractionBuffer getBuffer()
	{
		return buffer;
	}
	
	
	/**
	 *
	 * @param buffer
	 */
	public void setBuffer( InteractionBuffer buffer )
	{
		this.buffer = buffer;
	}
}
