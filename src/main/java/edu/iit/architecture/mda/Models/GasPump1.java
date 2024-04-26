package edu.iit.architecture.mda.Models;

import edu.iit.architecture.mda.AbstractFactory.AbstractGasPumpFactory;
import edu.iit.architecture.mda.OutputProcessor.OP;
import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;

/*
    This class is the InputProcessor for GasPump1
 */

public class GasPump1 {
    private GasPumpMDA mdaEfsm;
    private DataStore dataStore;

    public GasPump1(AbstractGasPumpFactory af){
        this.dataStore = af.getDataStore();
        this.mdaEfsm = new GasPumpMDA();
        OP op = new OP(af);
        this.mdaEfsm.setOp(op);
    }

    // unused
    public void printMenuOperations() {
        System.out.println(
                "*********************************************************************" +
                        "\nSelect operation: " +
                        "\n(0) Activate(int a) " +
                        "\n(1) Start " +
                        "(2) PayCredit " +
                        "(3) Approve " +
                        "(4) Reject" +
                        "\n(5) Regular " +
                        "(6) Diesel " +
                        "(7) Cancel " +
                        "\n(8) StartPump " +
                        "(9) PumpGallon " +
                        "(x) StopPump " +
                        "{q} Quit the program " +
                        "\n*********************************************************************"
        );
    }


        /*
        Verify  input parameters for on activate(), and call the
        activate() on meta-event MDA model

        If input is invalid, print a failed message

        @param a: price of Regular gas
     */

    public void activate(int a){
        if (a > 0){
            DataStoreGasPump1 ds1 = (DataStoreGasPump1) this.dataStore;
            ds1.temp_a = a;
            mdaEfsm.activate();
        }
        else {
            System.out.println("Failed to activate. Invalid input.");
        }
    }

    // call start on mda-efsm model
    public void start(){
        mdaEfsm.start();
    }

    // call payType meta-event on efsm model on mda-efsm model
    // credit payment type is 1
    public void payCredit(){
        mdaEfsm.payType(1);
    }

    // call reject() on mda-efsm model
    public void reject(){
        mdaEfsm.reject();
    }

    // call cancel() on mda-efsm model
    public void cancel(){
        mdaEfsm.cancel();
    }

    // call approved() on mda-efsm model
    public void approved(){
        mdaEfsm.approved();
    }

    // call payType() on mda-efsm model
    public void payCash(int c){
        if(c>0){
            mdaEfsm.payType(0);
        }
    }

    // call StartPump() on mda-efsm model
    public void startPump(){
        mdaEfsm.startPump();
    }

    // call pump() on mda-efsm model
    public void pump(){
        // contitions
        mdaEfsm.pump();
    }

    // call stopPump() on mda-efsm model
    public void stopPump(){
        mdaEfsm.stopPump();
        mdaEfsm.receipt();
    }
}
