	package kentvejrupmadsen.ship.interactive;
	
	
	import kentvejrupmadsen.ship.StateController;
	
	public interface Interaction
	{
		boolean isToContinue();
		
		void userInput();
		void setState( StateController state );
	}
