package edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash;

import edu.iit.architecture.mda.PlatformData.DataStore;

public abstract class StoreCash {
    DataStore dataStore;

    public StoreCash(DataStore dataStore){
        this.dataStore = dataStore;
    }

    public abstract void storeCash();
}
