package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class S6 extends State {
    public S6(GasPumpMDA gasPumpMDA) {
        super(gasPumpMDA);
    }

    @Override
    public void receipt() {
        mdaEfsm.getOp().printReceipt();
        mdaEfsm.getOp().returnCash();
        mdaEfsm.changeState(0);
    }

    @Override
    public void noReceipt() {
        mdaEfsm.getOp().returnCash();
        mdaEfsm.changeState(0);
    }
}
