    package kentvejrupmadsen.shipment.persistence.configuration;


    import kentvejrupmadsen.shipment.StateController;

    
    /**
     * @author Kent Madsen
     */
    public class ConfigurationStore
            implements StoreFacade
    {
        // Code / Constructors
        /**
         * @author Kent Madsen
         */
        public ConfigurationStore()
        {

        }

        // Variables
        private static StoreFacade configuration = null;
        
        private StateController state = null;

        // Code
        /**
         * @author Kent Madsen
         */
        @Override
        public boolean configure()
        {
            return false;
        }

        // Accessors
        /**
         * @author Kent Madsen
         */
        @Override
        public void setStateController( StateController controller )
        {
            this.state = controller;
        }
    
        /**
         * @author Kent Madsen
         */
        public StateController getState()
        {
            return state;
        }

        /**
         * @author Kent Madsen
         * @return Configuration Store
         */
        public static StoreFacade getConfiguration()
        {
            if( ConfigurationStore.configuration == null )
            {
                ConfigurationStore.setConfiguration(
                        new ConfigurationStore() );
            }

            return configuration;
        }

        /**
         * @author Kent Madsen
         * @param configuration
         */
        protected static void setConfiguration( ConfigurationStore configuration )
        {
             ConfigurationStore.configuration = configuration;
        }
    }
