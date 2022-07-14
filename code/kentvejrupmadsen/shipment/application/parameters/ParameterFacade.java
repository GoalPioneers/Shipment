    package kentvejrupmadsen.shipment.application.parameters;

    import kentvejrupmadsen.shipment.StateController;
    
    /**
     * @author Kent Madsen
     */
    public interface ParameterFacade
    {
        /**
         * @author Kent Madsen
         */
        void setStateController( StateController controller );
        
        /**
         * @author Kent Madsen
         */
        boolean configure();
    }
