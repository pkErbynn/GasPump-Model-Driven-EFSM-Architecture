package edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump1;

public class DisplayMenu1 extends DisplayMenu {

    public DisplayMenu1(DataStore data) {
        super(data);
    }

    @Override
    public void displayMenu() {
        DataStoreGasPump1 d = (DataStoreGasPump1) datastore;
        System.out.println("CREDIT CARD APPROVED");
        System.out.println("Please select gas type:");
        System.out.println(
                "(5) Regular [$" + d.price + "/litre] ");
        System.out.println("Otherwise, select (7) to cancel");
    }
}
