package edu.iit.architecture.mda.OutputProcessor.Strategy;

import edu.iit.architecture.mda.OutputProcessor.OP;

public class StorePrices2 extends OP {
    @Override
    public void storePrices(){
        dataStore.setPrice(dataStore.getPrice());
    }
}