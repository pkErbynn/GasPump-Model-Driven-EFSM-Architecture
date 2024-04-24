package edu.iit.architecture.mda.AbstractFactory;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStore1;
import edu.iit.architecture.mda.DataStore.DataStore2;

public class GasPumpFactory1 extends AbstractGasPumpFactory {
    @Override
    public DataStore getDataStore() {
        return new DataStore1();
    }
}
