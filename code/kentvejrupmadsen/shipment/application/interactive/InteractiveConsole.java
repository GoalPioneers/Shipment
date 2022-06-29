	package kentvejrupmadsen.shipment.application.interactive;

	import kentvejrupmadsen.shipment.StateController;
	
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
			
		}
		
		
		// Variables
		private boolean toContinue = true;
		
		private StateController state = null;
		
		
		// Code
		/**
		 * @author Kent Madsen
		 */
		@Override
		public void userInput()
		{
			Scanner input = new Scanner( System.in );
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
	}
