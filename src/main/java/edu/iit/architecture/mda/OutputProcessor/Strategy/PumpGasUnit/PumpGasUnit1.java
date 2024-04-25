package edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt.PrintReceipt;

public class PumpGasUnit1 extends PumpGasUnit {
    public PumpGasUnit1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void pumpGasUnit() {
        DataStoreGasPump1 d = (DataStoreGasPump1) dataStore;
        d.l = d.l + 1;
        d.total = d.price * d.l;
    }
}
