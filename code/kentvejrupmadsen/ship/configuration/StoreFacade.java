    package kentvejrupmadsen.ship.configuration;


    import kentvejrupmadsen.ship.StateController;

    /**
     *
     */
    public interface StoreFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }
