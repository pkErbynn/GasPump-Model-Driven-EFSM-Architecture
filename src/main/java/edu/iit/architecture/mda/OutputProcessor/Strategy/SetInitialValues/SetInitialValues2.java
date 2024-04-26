package edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;

public class SetInitialValues2 extends SetInitialValues {
    public SetInitialValues2(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void setInitialValues() {
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        d.G = 0;
        d.total = 0;
    }
}
