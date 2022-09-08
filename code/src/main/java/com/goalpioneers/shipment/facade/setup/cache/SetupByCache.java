    package main.java.com.goalpioneers.shipment.facade.setup.cache;


    import main.java.com.goalpioneers.shipment.domain.Application;
    import main.java.com.goalpioneers.shipment.facade.setup.SetupFacade;

    
    /**
     *
     */
    public class SetupByCache
        extends SetupFacade
    {
        /**
         *
         */
        public SetupByCache()
        {
            super( null );
            this.setName( "Setup by Cache" );
            this.setPriority( 2 );
        }
    
        /**
         * 
         * @param application
         */
        public SetupByCache( Application application )
        {
            super( application );
            this.setName( "Setup by Cache" );
            this.setPriority( 2 );
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
