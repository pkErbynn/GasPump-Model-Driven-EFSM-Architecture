package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class S3 extends State {
    public S3(GasPumpMDA gasPumpMDA) {
        super(gasPumpMDA);
    }

    @Override
    public void selectGas(int g) {
        mdaEfsm.getOp().setPrice(g);
    }

    @Override
    public void cancel() {
        mdaEfsm.getOp().cancelMsg();
        mdaEfsm.changeState(0);
    }

    @Override
    public void startPump() {
        mdaEfsm.getOp().setInitialValues();
        mdaEfsm.changeState(4);
    }

    @Override
    public void continueToNextState() {
        mdaEfsm.changeState(4);
    }
}
