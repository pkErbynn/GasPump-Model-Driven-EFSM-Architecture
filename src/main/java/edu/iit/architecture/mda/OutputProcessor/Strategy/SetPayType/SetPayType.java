package edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType;

import edu.iit.architecture.mda.PlatformData.DataStore;

public abstract class SetPayType {
    DataStore dataStore;
    public SetPayType(DataStore dataStore){
        this.dataStore = dataStore;
    }

    public abstract void setPayType(int t);
}
