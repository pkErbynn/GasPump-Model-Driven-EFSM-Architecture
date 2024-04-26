package edu.iit.architecture.mda.Models;

import edu.iit.architecture.mda.AbstractFactory.AbstractGasPumpFactory;
import edu.iit.architecture.mda.OutputProcessor.OP;
import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;


/*
    This class is the InputProcessor for GasPump1
 */

public class GasPump2 {
    private GasPumpMDA mdaEfsm;
    private DataStore dataStore;

    public GasPump2(AbstractGasPumpFactory af){
        this.dataStore = af.getDataStore();
        this.mdaEfsm = new GasPumpMDA();
        OP op = new OP(af);
        this.mdaEfsm.setOp(op);
    }

    /*
        Validates the input parameters for gas prices and triggers the activate() meta-event in the MDA-EFSM model.
        If any input is invalid, it outputs an error message.

        @param a: price of Regular gas
        @param b: price of Premium gas
        @param c: price of Diesel gas
    */

    public void activate(float a, float b, float c){
        if (a > 0 && b > 0 && c > 0){
            DataStoreGasPump2 ds2 = (DataStoreGasPump2) dataStore;
            ds2.temp_a = a;
            ds2.temp_b = b;
            ds2.temp_c = c;
            mdaEfsm.activate();
        }
        else {
            System.out.println("Can't be activated. Invalid inputs.");
        }
    }

    /*
        Invoke the start() meta-event on the MDA-EFSM context model
     */
    public void start(){
        mdaEfsm.start();
    }

    /*
       Validates the input parameter for correctness before invoking the payType() meta-event
       in the EFSM model with "0" as the argument, representing a cash payment. If the cash amount
       entered is less than zero, the meta-event is not called, and a message is printed to indicate
       the requirement for a valid cash input.
    */

    public void payCash(int cash) {
        if (cash > 0) {
            DataStoreGasPump2 ds2 = (DataStoreGasPump2) dataStore;
            ds2.temp_cash = cash;
            mdaEfsm.payType(0);
        } else {
            System.out.println("Invalid Cash amount. Input must at least 0");
        }
    }

    /*
        Invoke the cancel() meta-event on the MDA-EFSM context model
     */
    public void cancel() {
        mdaEfsm.cancel();
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        argument 3 as the gas-type, 3 is Premium
     */
    public void premium() {
        mdaEfsm.selectGas(3);
        mdaEfsm.continueToNextState();
    }

    /*
        selectGas() meta-event of the EFSM model is called,
        argument 1 as the gas-type, 1 is Regular
     */
    public void regular() {
        mdaEfsm.selectGas(1);
        mdaEfsm.continueToNextState();
    }

    /*
       selectGas() meta-event of the EFSM model is called,
       argument 2 as the gas-type, 2 is Diesel
    */
    public void diesel() {
        mdaEfsm.selectGas(2);
        mdaEfsm.continueToNextState();
    }

    /*
      startPump() meta-event of the EFSM model is called,
   */
    public void startPump() {
        mdaEfsm.startPump();
    }

    /*
    Check the shared data structure for the remaining cash amount.
    If the cash is insufficient for another liter, display a message indicating insufficient funds
    and trigger the stopPump() meta-event of the EFSM model.
    If there is enough cash, proceed to trigger the pump() meta-event of the EFSM model.
    */
    public void pumpGallon() {

        DataStoreGasPump2 ds2 = (DataStoreGasPump2) dataStore;
        if (ds2.cash >= ds2.price * (ds2.G + 1)) {
            System.out.println("NOT ENOUGH CASH");
            mdaEfsm.stopPump();
        } else {
            mdaEfsm.pump();
        }
    }

    // Call the stopPump() meta-event on the GasPump MDA-EFSM model
    public void stop() {
        mdaEfsm.stopPump();
    }


    // Call the receipt() meta-event on the GasPump MDA-EFSM model
    public void receipt() {
        mdaEfsm.receipt();
    }


    // Call the noReceipt() meta-event on the GasPump MDA-EFSM model

    public void noReceipt() {
        mdaEfsm.noReceipt();
    }
}
