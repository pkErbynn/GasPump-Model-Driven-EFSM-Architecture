package edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt;

import edu.iit.architecture.mda.PlatformData.DataStore;

public abstract class PrintReceipt {
    DataStore dataStore;

    public PrintReceipt(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void printReceipt();
}
