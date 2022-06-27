    package kentvejrupmadsen.ship.persistence.configuration;


    import kentvejrupmadsen.ship.StateController;

    /**
     *
     */
    public interface StoreFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }
