	package kentvejrupmadsen.ship.application.interactive;

	import kentvejrupmadsen.ship.StateController;
	
	import java.util.Scanner;
	
	/**
	 * @author Kent Madsen
	 */
	public class InteractiveConsole
			implements Interaction
	{
		/**
		 * 
		 */
		public InteractiveConsole()
		{
			
		}
		
		
		// Variables
		private boolean toContinue = true;
		
		private StateController state = null;
		
		
		// Code
		/**
		 * 
		 */
		@Override
		public void userInput()
		{
			Scanner input = new Scanner( System.in );
		}
		
		// Accessors
		/**
		 * 
		 * @param state
		 */
		@Override
		public void setState( StateController state )
		{
			this.state = state;
		}
		
		
		/**
		 * 
		 * @return
		 */
		@Override
		public boolean isToContinue()
		{
			return this.toContinue;
		}
		
		/**
		 * 
		 * @param toContinue
		 */
		protected void setToContinue( boolean toContinue )
		{
			this.toContinue = toContinue;
		}
	}
