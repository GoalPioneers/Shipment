	package kentvejrupmadsen.shipment.application.interactive;

	import kentvejrupmadsen.shipment.StateController;
	
	
	/**
	 * @author Kent Madsen
	 */
	public interface Interaction
	{
		/**
		 * @author Kent Madsen
		 */
		void userInput();
		
		
		// Accessors
		/**
		 * @author Kent Madsen
		 * @param state
		 */
		void setState( StateController state );
		
		/**
		 * @author Kent Madsen
		 * @return
		 */
		boolean isToContinue();
	}
