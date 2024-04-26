package edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices;

import edu.iit.architecture.mda.PlatformData.DataStore;

/*
    Abstract StorePrices action strategy
    Groups all "Store Prices" actions under 1 abstract superclass
*/

public abstract class StorePrices {

    DataStore dataStore;

    public StorePrices(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void storePrices();
}
