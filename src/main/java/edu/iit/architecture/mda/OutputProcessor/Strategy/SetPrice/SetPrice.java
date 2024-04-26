package edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice;

import edu.iit.architecture.mda.PlatformData.DataStore;

public abstract class SetPrice {
    DataStore dataStore;

    public SetPrice(DataStore dataStore){
        this.dataStore = dataStore;
    }

    public abstract void SetPrice(int g);
}
