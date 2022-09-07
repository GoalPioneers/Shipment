    package main.java.com.goalpioneers.shipment.domain.commands;
    
    
    public abstract class SignalProcedure
    {
        // Variables
        private SignalCommand command = SignalCommand.None;
    
    
        // Accessors
        public SignalCommand getCommand()
        {
            return this.command;
        }
    
        public void setCommand( SignalCommand command )
        {
            this.command = command;
        }
    }
