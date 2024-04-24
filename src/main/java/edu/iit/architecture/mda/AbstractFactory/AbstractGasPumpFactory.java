package edu.iit.architecture.mda.AbstractFactory;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStore2;

public abstract class AbstractGasPumpFactory {
    public abstract DataStore getDataStore();
}
