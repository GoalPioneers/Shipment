    package kentvejrupmadsen.ship.persistence.configuration;


    import kentvejrupmadsen.ship.StateController;

    /**
     * @author Kent Madsen
     */
    public interface StoreFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }
