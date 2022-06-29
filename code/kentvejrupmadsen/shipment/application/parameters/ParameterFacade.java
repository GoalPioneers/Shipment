    package kentvejrupmadsen.shipment.application.parameters;

    import kentvejrupmadsen.shipment.StateController;
    
    /**
     * @author Kent Madsen
     */
    public interface ParameterFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }
