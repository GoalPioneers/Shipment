    package kentvejrupmadsen.ship.application.parameters;

    import kentvejrupmadsen.ship.StateController;

    public interface ParameterFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }
