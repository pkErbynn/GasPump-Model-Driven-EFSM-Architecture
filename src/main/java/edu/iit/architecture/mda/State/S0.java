package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class S0 extends State{
    public S0(GasPumpMDA gasPumpMDA) {
        super(gasPumpMDA);
    }

    @Override
    public void start() {
        mdaEfsm.getOp().payMsg();
        mdaEfsm.changeState(1);
    }
}
