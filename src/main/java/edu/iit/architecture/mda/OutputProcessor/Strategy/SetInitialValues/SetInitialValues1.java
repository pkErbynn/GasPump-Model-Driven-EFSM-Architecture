package edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump1;

public class SetInitialValues1 extends SetInitialValues {
    public SetInitialValues1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void setInitialValues() {
        DataStoreGasPump1 d = (DataStoreGasPump1)dataStore;
        d.l = 0;
        d.total = 0;
    }
}
