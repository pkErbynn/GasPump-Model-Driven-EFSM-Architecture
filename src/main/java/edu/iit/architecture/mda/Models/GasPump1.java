package edu.iit.architecture.mda.Models;

import edu.iit.architecture.mda.AbstractFactory.AbstractGasPumpFactory;
import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class GasPump1 {
    private GasPumpMDA gasPumpMDA;
    private DataStore dataStore;
    private AbstractGasPumpFactory abstractGasPumpFactory;

    public GasPump1(AbstractGasPumpFactory abstractGasPumpFactory){
        this.abstractGasPumpFactory = abstractGasPumpFactory;
    }

    public GasPump1(AbstractGasPumpFactory abstractGasPumpFactory, DataStore dataStore, GasPumpMDA gasPumpMDA){
        this.abstractGasPumpFactory = abstractGasPumpFactory;
        this.dataStore = dataStore;
        this.gasPumpMDA = gasPumpMDA;
    }

    public void setGasPumpMDA(GasPumpMDA gasPumpMDA) {
        this.gasPumpMDA = gasPumpMDA;
    }

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public GasPumpMDA getGasPumpMDA() {
        return gasPumpMDA;
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public void activate(int a){
        dataStore.setTemp_a(a);
//        op.storePrices();
        gasPumpMDA.Activate();
    }

//    public void start(){
//        gasPumpMDA.Start();
//    }
//
//    public void payCredit(){
//        gasPumpMDA.payType(1);
//    }
//
//    public void Reject(){
//        gasPumpMDA.reject();
//    }
//
//    public void Cancel(){
//        gasPumpMDA.cancel();
//    }
//
//    public void approved(){
//        gasPumpMDA.approved();
//    }
//
//    public void PayCash(int c){

//        gasPumpMDA.payType(0);
//    }
//
//    public void StartPump(){
//        gasPumpMDA.startPump();
//    }
//
//    public void Pump(){
//        gasPumpMDA.pump();
//    }
//
//    public void stopPump(){
//        gasPumpMDA.stopPump();
//    }
}
