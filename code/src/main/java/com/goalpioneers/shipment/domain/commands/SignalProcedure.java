    /**
     * Author: Goal Pioneers, Kent v. Madsen
     * Contact: Kent.vejrup.madsen@goalpioneers.com
     * Company: Goal-Pioneers, 41157089
     * Links
     ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
     ** Issues: https://github.com/GoalPioneers/Shipment/issues
     */
    package main.java.com.goalpioneers.shipment.domain.commands;


    /**
     * @author Kent vejrup Madsen
     * @author Goal Pioneers
     */
    public abstract class SignalProcedure
    {
        // Variables
        private SignalCommand command = SignalCommand.None;
    
    
        // Accessors
        /**
         *
         * @return
         */
        public SignalCommand getCommand()
        {
            return this.command;
        }
    
        /**
         *
         * @param command
         */
        public void setCommand( SignalCommand command )
        {
            this.command = command;
        }
    }
