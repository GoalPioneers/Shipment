package com.goalpioneers.shipment.facade.setup;

import com.goalpioneers.shipment.domain.Application;


public class SetupFacade
{
    public SetupFacade( Application application )
    {
        this.setApplication( application );
    }

    //
    private Application application = null;

    /**
     *
     * @return
     */
    public Application getApplication()
    {
        return application;
    }

    /**
     *
     * @param application
     */
    public void setApplication( Application application )
    {
        this.application = application;
    }
}
