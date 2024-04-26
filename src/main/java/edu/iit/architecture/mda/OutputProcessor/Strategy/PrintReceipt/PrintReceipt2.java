package edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;

public class PrintReceipt2 extends PrintReceipt {
    public PrintReceipt2(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing receipt ...");
        System.out.println("######################################################################");
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        System.out.println(d.G + " gallons of " + d.gasType + " gasoline @ $" + d.price + "/gallon");
        System.out.println("Total: $" + d.total);
        System.out.println("#######################################################################");
        System.out.println("Transaction complete");
    }
}
