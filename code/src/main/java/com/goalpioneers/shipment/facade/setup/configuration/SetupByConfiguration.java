    /**
     * Author: Goal Pioneers, Kent v. Madsen
     * Contact: Kent.vejrup.madsen@goalpioneers.com
     * Company: Goal-Pioneers, 41157089
     * Links
     ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
     ** Issues: https://github.com/GoalPioneers/Shipment/issues
     */
    package main.java.com.goalpioneers.shipment.facade.setup.configuration;


    import main.java.com.goalpioneers.annotations.classDocument;
    import main.java.com.goalpioneers.annotations.copyright;
    import main.java.com.goalpioneers.annotations.versioning;
    import main.java.com.goalpioneers.shipment.domain.Application;
    import main.java.com.goalpioneers.shipment.facade.setup.SetupFacade;


    /**
     * @author Kent vejrup Madsen
     * @author Goal Pioneers
     */
    @copyright()
    @classDocument()
    @versioning()
    public class SetupByConfiguration
        extends SetupFacade
    {
        /**
         *
         */
        public SetupByConfiguration()
        {
            super( null );
            this.setName( "Setup by Configuration" );
            this.setPriority( 0 );
        }
    
        /**
         *
         * @param application
         */
        public SetupByConfiguration( Application application )
        {
            super( application );
            this.setName( "Setup by Configuration" );
            this.setPriority( 0 );
        }
        
        
        /**
         *
         * @return
         */
        @Override
        public final boolean setup()
        {
            return this.isDone();
        }
    }
