package edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump1;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class StorePrices1 extends StorePrices {
    public StorePrices1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void storePrices() {
        DataStoreGasPump1 d = (DataStoreGasPump1) dataStore;
        d.price = d.temp_a;
    }


}
