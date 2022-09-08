    package main.java.com.goalpioneers.shipment.facade.setup.configuration;


    import main.java.com.goalpioneers.shipment.domain.Application;
    import main.java.com.goalpioneers.shipment.facade.setup.SetupFacade;

    
    /**
     *
     */
    public class SetupByConfiguration
        extends SetupFacade
    {
        /**
         *
         */
        public SetupByConfiguration()
        {
            super( null );
            this.setName( "Setup by Configuration" );
            this.setPriority( 0 );
        }
    
        /**
         *
         * @param application
         */
        public SetupByConfiguration( Application application )
        {
            super( application );
            this.setName( "Setup by Configuration" );
            this.setPriority( 0 );
        }
        
        
        /**
         *
         * @return
         */
        @Override
        public final boolean setup()
        {
            return this.isDone();
        }
    }
