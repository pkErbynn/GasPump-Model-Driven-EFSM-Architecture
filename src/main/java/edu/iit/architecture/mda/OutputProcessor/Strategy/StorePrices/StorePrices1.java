package edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;

public class StorePrices1 extends StorePrices {
    public StorePrices1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void storePrices() {
        DataStoreGasPump1 d = (DataStoreGasPump1) dataStore;
        d.price = d.temp_a;
        System.out.println("Prices stored successfully\n");
        System.out.println("Current price: " + d.price);
    }


}
