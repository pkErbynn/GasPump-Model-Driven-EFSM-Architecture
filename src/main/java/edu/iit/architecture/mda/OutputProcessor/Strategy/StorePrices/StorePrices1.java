package edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices;

import edu.iit.architecture.mda.OutputProcessor.OP;

public class StorePrices1 extends OP {
    @Override
    public void storePrices(){
        dataStore.setPrice(dataStore.getPrice());
        System.out.println("Prices stored successfully");
    }
}
