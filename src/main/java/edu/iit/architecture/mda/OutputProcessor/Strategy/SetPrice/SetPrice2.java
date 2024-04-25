package edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump2;

public class SetPrice2 extends SetPrice {
    public SetPrice2(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Set the price per gallon for this transaction according to the type of gas which was selected to be pumped

        @param g : integer passed in from the EFSM model representing the type of gasoline
        for which the price calculation must be set
        For GasPump2:
        g = 1: Regular gas
        g = 2: Diesel gas
        g = 3: Premium gas
    */
    @Override
    public void SetPrice(int g) {
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        if(g == 1){
            d.price = d.Pprice;
            d.gasType = "Regular";
        }
        else if(g == 3){
            d.price = d.Dprice;
            d.gasType = "Diesel";
        }
        else if(g == 3){
            d.price = d.Pprice;
            d.gasType = "Premium";
        }

        System.out.println(d.gasType + " gasoline selected @ price of $" + d.price + "/Gallon");
        System.out.println("Select (7) to start the pump");
    }
}