    package kentvejrupmadsen.shipment.persistence.configuration;


    import kentvejrupmadsen.shipment.StateController;

    /**
     * @author Kent Madsen
     */
    public interface StoreFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }
