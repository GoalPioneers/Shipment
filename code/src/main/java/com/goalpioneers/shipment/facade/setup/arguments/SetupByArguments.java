    /**
     * Author: Goal Pioneers, Kent v. Madsen
     * Contact: Kent.vejrup.madsen@goalpioneers.com
     * Company: Goal-Pioneers, 41157089
     * Links
     ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
     ** Issues: https://github.com/GoalPioneers/Shipment/issues
     */
    package main.java.com.goalpioneers.shipment.facade.setup.arguments;

    import main.java.com.goalpioneers.annotations.copyright;
    import main.java.com.goalpioneers.shipment.domain.Application;
    import main.java.com.goalpioneers.shipment.facade.setup.SetupFacade;


    /**
     * @author Kent vejrup Madsen
     * @author Goal Pioneers
     */
    @copyright()
    public class SetupByArguments
        extends SetupFacade
    {
        /**
         *
         * @param arguments
         */
        public SetupByArguments( String[] arguments )
        {
            super( null );
            this.setName( "Setup by Arguments" );
            this.setPriority( 1 );
        }
    
        /**
         *
         * @param application
         * @param Arguments
         */
        public SetupByArguments( Application application,
                                 String[] Arguments )
        {
            super( application );
            this.setName( "Setup by Arguments" );
            this.setPriority( 1 );
        }
        
        
        // Variables
        private String[] arguments = null;
        
        
        /**
         *
         * @return
         */
        @Override
        public final boolean setup()
        {
            return this.isDone();
        }
        
        
        // Accessors
        /**
         *
         * @return
         */
        public final String[] getArguments()
        {
            return this.arguments;
        }
        
        /**
         *
         * @param arguments
         */
        public final void setArguments( String[] arguments )
        {
            this.arguments = arguments;
        }
    }
