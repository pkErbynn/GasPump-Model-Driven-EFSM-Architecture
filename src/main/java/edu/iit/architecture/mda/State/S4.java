package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class S4 extends State {
    public S4(GasPumpMDA gasPumpMDA) {
        super(gasPumpMDA);
    }

    @Override
    public void startPump() {
        mdaEfsm.getOp().setInitialValues();
        mdaEfsm.changeState(5);
    }

    @Override
    public void pump() {
        mdaEfsm.getOp().pumpGasUnit();
    }

    @Override
    public void stopPump() {
//        mdaEfsm.getOp().pumpGasUnit();
        mdaEfsm.getOp().printReceipt();
        mdaEfsm.getOp().displayMenu();
    }
}
