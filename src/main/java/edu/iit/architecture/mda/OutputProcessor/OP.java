package edu.iit.architecture.mda.OutputProcessor;

import edu.iit.architecture.mda.DataStore.DataStore;

public abstract class OP {
    protected DataStore dataStore;

    public OP(){}

    public OP(DataStore dataStore){
        this.dataStore = dataStore;
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void storePrices(); //

    public void payMsg(){ //
    }

    public void storeCash(){ //
    }

    public void displayMenu(){ //
    }

    public void rejectMsg(){ //
    }

    public void setPrice(){ //
    }

    public void setInitialValues(){ //
    }

    public void PumpGasUnit(){ //
    }

    public void GasPumpedMsg(){ //
    }

    public void PrintReceipt(){} //
    public void CancelMsg(){}   //
    public void ReturnCash(){} //
    public void setPayType(){}
    public void EjectCard(){}

}
