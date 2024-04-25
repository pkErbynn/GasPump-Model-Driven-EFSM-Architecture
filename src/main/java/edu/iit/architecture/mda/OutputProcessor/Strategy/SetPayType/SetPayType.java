package edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice.SetPrice1;

public abstract class SetPayType {
    DataStore dataStore;
    public SetPayType(DataStore dataStore){
        this.dataStore = dataStore;
    }

    public abstract void setPayType(int t);
}
