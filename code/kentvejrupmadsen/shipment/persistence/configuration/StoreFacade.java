    package kentvejrupmadsen.shipment.persistence.configuration;


    import kentvejrupmadsen.shipment.StateController;

    
    /**
     * @author Kent Madsen
     */
    public interface StoreFacade
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
