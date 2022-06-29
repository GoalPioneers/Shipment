    package kentvejrupmadsen.shipment.application.parameters;


    import kentvejrupmadsen.shipment.StateController;


    /**
     * @author Kent Madsen
     */
    public class ParameterConfiguration
            implements ParameterFacade
    {

        // Variables
        private static ParameterConfiguration interpreter = null;
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
         *
         * @return Parameter Facade
         */
        public static ParameterFacade getInterpreter()
        {
            if( ParameterConfiguration.interpreter == null )
            {
                ParameterConfiguration.setInterpreter(
                        new ParameterConfiguration() );
            }

            return interpreter;
        }

        /**
         * @author Kent Madsen
         * @param interpreter
         */
        public static void setInterpreter( ParameterConfiguration interpreter )
        {
            ParameterConfiguration.interpreter = interpreter;
        }
    }
