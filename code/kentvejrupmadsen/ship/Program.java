    package kentvejrupmadsen.ship;

    import kentvejrupmadsen.ship.configuration.ConfigurationStore;
    import kentvejrupmadsen.ship.configuration.StoreFacade;

    import kentvejrupmadsen.ship.interactive.Interaction;
    import kentvejrupmadsen.ship.interactive.InteractiveConsole;
    import kentvejrupmadsen.ship.parameters.ParameterConfiguration;
    import kentvejrupmadsen.ship.parameters.ParameterFacade;


    /**
     *
     */
    public class Program
    {
        /**
         *
         * @param args Console Arguments
         */
        public static void main( String[] args )
        {
            Program program = new Program( args );

            program.initialise();
            program.execution();
            program.gc();
        }


        // Variables
        private ParameterFacade parameterInterpreter = null;

        private StoreFacade configurationStore = null;
        
        private Interaction actor = null;

        private String[] arguments = null;

        private StateController controller = null;


        // Code / Constructors
        /**
         *
         */
        public Program()
        {
            this.defaultConstruction();
        }

        
        /**
         *
         * @param arguments
         */
        public Program( String[] arguments )
        {
            this.defaultConstruction();
            this.setArguments( arguments );
        }
    
        
        /**
         *
         */
        private void defaultConstruction()
        {
            this.setActor(
                    new InteractiveConsole()
            );
    
            this.setController(
                    new StateController()
            );
        }


        // Code
        /**
         *
         */
        public void initialise()
        {
            this.initialiseConfiguration();
            this.initialiseParameters();
            
            this.getActor().setState(
                    this.getController()
            );
        }


        /**
         *
         */
        protected void initialiseConfiguration()
        {
            ConfigurationStore.getConfiguration().setStateController(
                    this.getController()
            );

            this.setConfigurationStore(
                    ConfigurationStore.getConfiguration()
            );

            this.getConfigurationStore().configure();
        }

        
        /**
         *
         */
        protected void initialiseParameters()
        {
            ParameterConfiguration.getInterpreter().setStateController(
                    this.getController()
            );

            this.setParameterInterpreter(
                    ParameterConfiguration.getInterpreter()
            );

            this.getParameterInterpreter().configure();
        }

        /**
         *
         */
        public void execution()
        {
            while( this.getActor().isToContinue() )
            {
                this.getActor().userInput();
            }
        }

        /**
         *
         */
        public void gc()
        {

        }


        // Accessors
        public Interaction getActor()
        {
            return this.actor;
        }
    
        protected void setActor( InteractiveConsole actor )
        {
            this.actor = actor;
        }
    
        /**
         *
         * @return
         */
        public String[] getArguments()
        {
            return arguments;
        }

        /**
         *
         * @param arguments
         */
        protected void setArguments( String[] arguments )
        {
            this.arguments = arguments;
        }

        /**
         *
         * @return
         */
        public ParameterFacade getParameterInterpreter()
        {
            return parameterInterpreter;
        }

        /**
         *
         * @return
         */
        public StoreFacade getConfigurationStore()
        {
            return configurationStore;
        }

        /**
         *
         * @param configurationStore
         */
        protected void setConfigurationStore( StoreFacade configurationStore )
        {
            this.configurationStore = configurationStore;
        }


        /**
         *
         * @param parameterInterpreter
         */
        protected void setParameterInterpreter( ParameterFacade parameterInterpreter )
        {
            this.parameterInterpreter = parameterInterpreter;
        }

        public StateController getController()
        {
            return controller;
        }

        public void setController( StateController controller )
        {
            this.controller = controller;
        }
    }
