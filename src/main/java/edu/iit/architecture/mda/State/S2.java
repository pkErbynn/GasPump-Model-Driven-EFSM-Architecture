package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class S2 extends State {
    public S2(GasPumpMDA gasPumpMDA) {
        super(gasPumpMDA);
    }

    @Override
    public void approved() {
        mdaEfsm.getOp().displayMenu();
        mdaEfsm.getOp().setPayType(1);
        mdaEfsm.getOp().ejectCard();
        mdaEfsm.changeState(3);
    }

    @Override
    public void reject() {
        mdaEfsm.getOp().rejectMsg();
    }
}
