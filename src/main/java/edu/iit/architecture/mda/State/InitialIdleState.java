package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class InitialIdleState extends State{
    public InitialIdleState(GasPumpMDA gasPumpMDA){
        super(gasPumpMDA);
    }

    // Store prices data and transition to State S0
    @Override
    public void activate(){
        mdaEfsm.getOp().storePrices();
        mdaEfsm.changeState(0);
    }
}
