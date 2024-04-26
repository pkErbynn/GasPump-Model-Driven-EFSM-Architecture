package edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;

public class PrintReceipt1 extends PrintReceipt {
    public PrintReceipt1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing receipt ...");
        System.out.println("*********************************************************************");
        DataStoreGasPump1 d = (DataStoreGasPump1) dataStore;
//        System.out.println(d.l + " liters of " + d.gasType + " gasoline @ $" + d.price + "/liter");
        System.out.println("Total: $" + (float) d.total);
//        System.out.println("Cash inserted: $" + d.cash);
        System.out.println("*********************************************************************");
        System.out.println("Transaction complete");
    }
}
