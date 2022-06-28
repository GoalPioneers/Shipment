    package kentvejrupmadsen.ship.application.parameters;

    import kentvejrupmadsen.ship.StateController;
    
    /**
     * @author Kent Madsen
     */
    public interface ParameterFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }
