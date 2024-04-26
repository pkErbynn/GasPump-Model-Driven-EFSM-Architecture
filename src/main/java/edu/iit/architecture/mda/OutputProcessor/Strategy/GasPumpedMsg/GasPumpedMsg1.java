package edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;

public class GasPumpedMsg1 extends GasPumpedMsg {
    public GasPumpedMsg1(DataStore data) {
        super(data);
    }

    @Override
    public void gasPumpedMsg() {
        DataStoreGasPump1 d = (DataStoreGasPump1) dataStore;
        System.out.println("Pumped 1 litres of " + d.gasType + " gasoline");
        System.out.println("Total # of litres pumped: " + d.l);
    }
}
