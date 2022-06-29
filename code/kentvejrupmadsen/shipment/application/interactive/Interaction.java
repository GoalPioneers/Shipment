	package kentvejrupmadsen.shipment.application.interactive;

	import kentvejrupmadsen.shipment.StateController;
	
	
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
