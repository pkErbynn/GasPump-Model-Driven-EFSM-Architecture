package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class S5 extends State {
    public S5(GasPumpMDA gasPumpMDA) {
        super(gasPumpMDA);
    }

    @Override
    public void pump() {
        mdaEfsm.getOp().pumpGasUnit();
        mdaEfsm.getOp().gasPumpedMsg();
    }

    @Override
    public void stopPump() {
        mdaEfsm.changeState(6);
        mdaEfsm.receipt();
    }
}
