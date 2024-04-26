package edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;

public class PumpGasUnit1 extends PumpGasUnit {
    public PumpGasUnit1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void pumpGasUnit() {
        DataStoreGasPump1 d = (DataStoreGasPump1) dataStore;
        d.l = d.l + 1;
        System.out.println("Current later PRICE: " + d.price);

        d.total = d.price * d.l;
        System.out.println("Current price: " + d.total);

    }
}
