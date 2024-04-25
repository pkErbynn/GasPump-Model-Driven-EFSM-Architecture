package edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump1;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump2;


public class GasPumpedMsg2 extends GasPumpedMsg {
    public GasPumpedMsg2(DataStore data) {
        super(data);
    }

    @Override
    public void gasPumpedMsg() {
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        System.out.println("Pumped 1 gallon of " + d.gasType + " gasoline");
        System.out.println("Total # of gallon pumped: " + d.G);
    }
}
