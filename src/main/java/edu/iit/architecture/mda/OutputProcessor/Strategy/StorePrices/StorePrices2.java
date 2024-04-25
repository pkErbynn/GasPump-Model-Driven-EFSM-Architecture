package edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump2;

public class StorePrices2 extends StorePrices {
    public StorePrices2(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void storePrices() {
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        d.Rprice = d.temp_a;
        d.Pprice = d.temp_b;
        d.Dprice = d.temp_c;
    }
}