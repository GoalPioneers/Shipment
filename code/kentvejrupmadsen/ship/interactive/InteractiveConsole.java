	package kentvejrupmadsen.ship.interactive;
	
	
	import kentvejrupmadsen.ship.StateController;
	
	import java.util.Scanner;
	
	public class InteractiveConsole
			implements Interaction
	{
		private boolean toContinue = true;
		private StateController state = null;
		
		@Override
		public void userInput()
		{
			Scanner input = new Scanner( System.in );
		}
		
		@Override
		public void setState( StateController state )
		{
			this.state = state;
		}
		
		@Override
		public boolean isToContinue()
		{
			return this.toContinue;
		}
		
		protected void setToContinue( boolean toContinue )
		{
			this.toContinue = toContinue;
		}
	}
