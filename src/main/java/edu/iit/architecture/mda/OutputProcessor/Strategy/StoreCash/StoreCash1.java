package edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;

public class StoreCash1 extends StoreCash {
    public StoreCash1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void storeCash() {
        DataStoreGasPump1 d = (DataStoreGasPump1) dataStore;
        d.cash = d.temp_c;
    }
}
