package edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg;

import edu.iit.architecture.mda.DataStore.DataStore;

public abstract class GasPumpedMsg {
    DataStore dataStore;
    public GasPumpedMsg(DataStore data) {
        this.dataStore = data;
    }

    public abstract void gasPumpedMsg();
}
