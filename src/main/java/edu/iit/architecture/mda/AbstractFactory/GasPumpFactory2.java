package edu.iit.architecture.mda.AbstractFactory;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump2;

public class GasPumpFactory2 extends AbstractGasPumpFactory{
    @Override
    public DataStore getDataStore() {
        return new DataStoreGasPump2();
    }
}
