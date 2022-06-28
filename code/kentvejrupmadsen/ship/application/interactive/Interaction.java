	package kentvejrupmadsen.ship.application.interactive;

	import kentvejrupmadsen.ship.StateController;
	
	
	/**
	 * @author Kent Madsen
	 */
	public interface Interaction
	{
		/**
		 * 
		 */
		void userInput();
		
		
		// Accessors
		/**
		 * 
		 * @param state
		 */
		void setState( StateController state );
		
		/**
		 * 
		 * @return
		 */
		boolean isToContinue();
	}
