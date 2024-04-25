package edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash;


import edu.iit.architecture.mda.DataStore.DataStore;

/*
    Abstract ReturnCash action strategy
    Groups sll "Return Cash" actions under 1 abstract superclass
 */
public abstract class ReturnCash {
    DataStore dataStore;

    /*
        GasPump1 constructor (doesn't need the shared data structure)
        Note, GasPump1 should never call this constructor under the current system design
     */
    public ReturnCash() {
    }

    /*
        GasPump2 constructor (needs the shared data structure)
     */
    public ReturnCash(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void returnCash();
}