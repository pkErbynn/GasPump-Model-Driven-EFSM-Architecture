package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class S1 extends State {
    public S1(GasPumpMDA gasPumpMDA) {
        super(gasPumpMDA);
    }

    @Override
    public void payType(int t) {
        if (t == 1){
            mdaEfsm.changeState(2);
        }
        else if (t == 0){
            mdaEfsm.changeState(3);
            mdaEfsm.getOp().storeCash();
            mdaEfsm.getOp().displayMenu();
            mdaEfsm.getOp().setPayType(0);
        }
    }

}
