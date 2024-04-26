package edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;

/*
    GasPump2 ReturnCash action responsible for returning the outstanding amount of cash (if any)
 */
public class ReturnCash2 extends ReturnCash {
    public ReturnCash2(DataStore dataStore) {
        super(dataStore);
    }

    /*
        This method first reads the shared data structure to calculate the amount of cash to return
        If there is any amount greater than $0 that is owed to the user, print a message indicating so,
        and return the cash
        Then, reset the data structure "cash" attribute to 0
     */
    @Override
    public void returnCash() {
        DataStoreGasPump2 d = (DataStoreGasPump2) dataStore;
        float currCash = d.cash - d.total;
        if (currCash > 0) {
            System.out.println("Cash to return: $" + currCash);
            System.out.println("Returning $" + currCash);
        } else {
            System.out.println("No cash to return");
        }
        d.cash = 0;
        System.out.println("Transaction finished");
    }
}
