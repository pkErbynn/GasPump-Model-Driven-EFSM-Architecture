package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;

public abstract class State {
    protected int stateId;
    protected GasPumpMDA mda;
    protected OP op;

    State(GasPumpMDA mda, OP op) {
        this.mda = mda;
        this.op = op;
    }

    State(GasPumpMDA mda) {
        this.mda = mda;
    }

//    State(int stateId) {
//        this.stateId = stateId;
//    }


    public int getStateId(){
        return this.stateId;
    }

    public abstract void activate();
    public abstract void start();
    public void payType(int t){};
    public void Reject(){};
    public void cancel(){};
    public void approved(){};
    public void startPump(){};
    public void pump(){};
    public void stopPump(){};
    public void selectGas(int g){};
    public void receipt(){};
    public void noReceipt(){};
    public void continueToNextState(){};
}
