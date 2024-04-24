package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public class InitialIdleState extends State{
    public InitialIdleState(GasPumpMDA gasPumpMDA, OP op){
        super(gasPumpMDA, op);
    }



    @Override
    public void activate(){
//        op.getDataStore().getTemp_a();
        op.storePrices();
        mda.changeState(0);
    }

    @Override
    public void start() {

    }
}
