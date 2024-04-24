package edu.iit.architecture.mda.Models;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;


public class GasPump2 {
    private GasPumpMDA GasPumpMDA;
    private DataStore dataStore;

    public void setGasPumpMDA(GasPumpMDA gasPumpMDA) {
        GasPumpMDA = gasPumpMDA;
    }

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public GasPumpMDA getGasPumpMDA() {
        return GasPumpMDA;
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public void Activate(int a){

    }

    public void Start(){

    }


}
