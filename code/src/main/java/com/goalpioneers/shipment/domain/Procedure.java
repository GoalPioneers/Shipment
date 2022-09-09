    /**
     * Author: Goal Pioneers, Kent v. Madsen
     * Contact: Kent.vejrup.madsen@goalpioneers.com
     * Company: Goal-Pioneers, 41157089
     * Links
     ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
     ** Issues: https://github.com/GoalPioneers/Shipment/issues
     */
    package main.java.com.goalpioneers.shipment.domain;
    
    import main.java.com.goalpioneers.annotations.copyright;

    
    /**
     * @author Kent v. Madsen
     * @author Goal Pioneers
     */
    @copyright()
    public class Procedure
    {
        public Procedure()
        {
    
        }
    
        public void execute()
        {
    
        }
    
        private boolean toContinue = false;
    
        public boolean isToContinue()
        {
            return this.toContinue;
        }
    
        protected void setToContinue( boolean toContinue )
        {
            this.toContinue = toContinue;
        }
    }
