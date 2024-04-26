package edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu;

import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;

public class DisplayMenu2 extends DisplayMenu{
    public DisplayMenu2(DataStore data) {
        super(data);
    }

    @Override
    public void displayMenu() {
        DataStoreGasPump2 d = (DataStoreGasPump2) datastore;
        System.out.println("Please select gas type: ");
        System.out.println(
                "(3) Regular [$" + d.Rprice + "/liter] " +
                        "\n(4) Diesel [$" + d.Dprice + "/liter] " +
                        "\n(5) Premium [$" + d.Pprice + "/liter]");
        System.out.println("Otherwise, select (6) to cancel");
    }
}
