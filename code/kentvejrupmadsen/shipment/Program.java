package kentvejrupmadsen.shipment;


import kentvejrupmadsen.shipment.persistence.configuration.ConfigurationStore;
import kentvejrupmadsen.shipment.persistence.configuration.StoreFacade;


import kentvejrupmadsen.shipment.application.interactive.Interaction;
import kentvejrupmadsen.shipment.application.interactive.InteractiveConsole;
import kentvejrupmadsen.shipment.application.parameters.ParameterConfiguration;
import kentvejrupmadsen.shipment.application.parameters.ParameterFacade;


/**
 * @author Kent Madsen
 */
public class Program
{
    // Variables
    private ParameterFacade parameterInterpreter = null;
    
    private StoreFacade configurationStore = null;
    
    private Interaction actor = null;
    
    private String[] arguments = null;
    
    private StateController controller = null;
    
    
    // Code / Constructors
    /**
     * @author Kent Madsen
     */
    public Program()
    {
        this.defaultConstruction();
    }
    
    
    /**
     * @author Kent Madsen
     * @param arguments
     */
    public Program( String[] arguments )
    {
        this.defaultConstruction();
        this.setArguments( arguments );
    }
    
    
    /**
     * @author Kent Madsen
     */
    private void defaultConstruction()
    {
        this.setActor(
                new InteractiveConsole()
        );
        
        this.setController(
                new StateController()
        );
    }
    
    
    // Code
    /**
     * @author Kent Madsen
     */
    public void initialise()
    {
        this.initialiseConfiguration();
        this.initialiseParameters();
        
        this.getActor().setState(
                this.getController()
        );
    }
    
    
    /**
     * @author Kent Madsen
     */
    protected void initialiseConfiguration()
    {
        ConfigurationStore.getConfiguration().setStateController(
                this.getController()
        );
        
        this.setConfigurationStore(
                ConfigurationStore.getConfiguration()
        );
        
        this.getConfigurationStore().configure();
    }
    
    
    /**
     * @author Kent Madsen
     */
    protected void initialiseParameters()
    {
        ParameterConfiguration.getInterpreter().setStateController(
                this.getController()
        );
        
        this.setParameterInterpreter(
                ParameterConfiguration.getInterpreter()
        );
        
        this.getParameterInterpreter().configure();
    }
    
    /**
     * @author Kent Madsen
     */
    public void execution()
    {
        while( this.getActor().isToContinue() )
        {
            this.getActor().userInput();
        }
    }
    
    /**
     * @author Kent Madsen
     */
    public void gc()
    {
        
    }
    
    
    // Accessors
    /**
     * @author Kent Madsen
     */
    public Interaction getActor()
    {
        return this.actor;
    }
    
    /**
     * @author Kent Madsen
     */
    protected void setActor( InteractiveConsole actor )
    {
        this.actor = actor;
    }
    
    /**
     * @author Kent Madsen
     * @return
     */
    public String[] getArguments()
    {
        return arguments;
    }
    
    /**
     * @author Kent MAdsen
     * @param arguments
     */
    protected void setArguments( String[] arguments )
    {
        this.arguments = arguments;
    }
    
    /**
     * @author Kent Madsen
     * @return
     */
    public ParameterFacade getParameterInterpreter()
    {
        return parameterInterpreter;
    }
    
    /**
     * @author Kent Madsen
     * @return
     */
    public StoreFacade getConfigurationStore()
    {
        return configurationStore;
    }
    
    /**
     * @author Kent Madsen
     * @param configurationStore
     */
    protected void setConfigurationStore( StoreFacade configurationStore )
    {
        this.configurationStore = configurationStore;
    }
    
    
    /**
     * @author Kent Madsen
     * @param parameterInterpreter
     */
    protected void setParameterInterpreter( ParameterFacade parameterInterpreter )
    {
        this.parameterInterpreter = parameterInterpreter;
    }
    
    /**
     * @author Kent Madsen
     */
    public StateController getController()
    {
        return controller;
    }
    
    /**
     * @author Kent Madsen
     */
    public void setController( StateController controller )
    {
        this.controller = controller;
    }
}