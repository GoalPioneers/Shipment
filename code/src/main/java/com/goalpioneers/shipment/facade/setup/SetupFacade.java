    /**
     * Author: Goal Pioneers, Kent v. Madsen
     * Contact: Kent.vejrup.madsen@goalpioneers.com
     * Company: Goal-Pioneers, 41157089
     * Links
     ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
     ** Issues: https://github.com/GoalPioneers/Shipment/issues
     */
    package main.java.com.goalpioneers.shipment.facade.setup;

    import main.java.com.goalpioneers.annotations.classDocument;
    import main.java.com.goalpioneers.annotations.copyright;
    import main.java.com.goalpioneers.annotations.versioning;
    import main.java.com.goalpioneers.shipment.domain.Application;


    /**
     * @author Kent vejrup Madsen
     * @author Goal Pioneers
     */
    @copyright()
    @classDocument()
    @versioning()
    public abstract class SetupFacade
        implements Comparable<SetupFacade>
    {
        /**
         *
         */
        public SetupFacade()
        {
            this( null );
        }
    
        /**
         *
         * @param application
         */
        public SetupFacade( Application application )
        {
            this.setApplication( application );
        }
        
        
        // Extend
        /**
         *
         * @return
         */
        public abstract boolean setup();
    
        
        // Variables
        private String name = "SetupFacade";
        
        private Application application;
        
        private int priority = 0;
        
        private boolean isDone = false;
        
        
        // Accessors
        /**
         *
         * @return
         */
        public final String getName()
        {
            return this.name;
        }
    
        /**
         *
         * @param name
         */
        protected final void setName( String name )
        {
            this.name = name;
        }
        
        /**
         *
         * @return
         */
        public final int getPriority()
        {
            return this.priority;
        }
        
        /**
         *
         * @param priority
         */
        protected final void setPriority( int priority )
        {
            this.priority = priority;
        }
        
        /**
         *
         * @return
         */
        public final Application getApplication()
        {
            return this.application;
        }
    
        /**
         *
         * @param application
         */
        public final void setApplication( Application application )
        {
            this.application = application;
        }
        
        /**
         *
         * @return
         */
        public boolean isDone()
        {
            return this.isDone;
        }
        
        
        /**
         *
         * @param done
         */
        public void setDone( boolean done )
        {
            isDone = done;
        }
        
        //
        /**
         *
         * @param next the object to be compared.
         * @return
         */
        @Override
        public int compareTo( SetupFacade next )
        {
            return Integer.compare( this.getPriority(),
                                    next.getPriority() );
        }
        
        
        /**
         *
         * @return
         */
        @Override
        public String toString()
        {
            return super.toString();
        }
    }
