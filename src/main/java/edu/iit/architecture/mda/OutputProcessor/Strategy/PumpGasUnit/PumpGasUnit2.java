package edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;

public class PumpGasUnit2 extends PumpGasUnit {
    public PumpGasUnit2(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void pumpGasUnit() {
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        d.G = d.G + 1;
        d.total = d.price * d.G;
    }
}
