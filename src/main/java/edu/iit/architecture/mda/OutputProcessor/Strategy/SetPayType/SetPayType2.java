package edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump1;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump2;

public class SetPayType2 extends SetPayType {
    public SetPayType2(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void setPayType(int t) {
        DataStoreGasPump2 d = (DataStoreGasPump2)dataStore;
        d.cash = t;
    }
}
