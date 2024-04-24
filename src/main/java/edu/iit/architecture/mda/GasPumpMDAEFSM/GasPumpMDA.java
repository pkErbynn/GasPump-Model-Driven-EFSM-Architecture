package edu.iit.architecture.mda.GasPumpMDAEFSM;

import edu.iit.architecture.mda.OutputProcessor.OP;
import edu.iit.architecture.mda.State.*;

public class GasPumpMDA {
    private State currentState;
    private State[] statesList = new State[7];
    private OP op;

    public OP getOp() {
        return op;
    }

    public void setOp(OP op) {
        this.op = op;
    }

    public GasPumpMDA(){
        statesList[0] = new InitialIdleState(this, null);
        statesList[1] = new S0(this, null);
        statesList[2] = new S1(this, null);
        statesList[3] = new S2(this, null);
        statesList[4] = new S3(this, null);
        statesList[5] = new S4(this, null);
        statesList[6] = new S5(this, null);
        statesList[7] = new S6(this, null);
    }

    public void changeState(int stateId){
        if(stateId >= 0 && stateId < statesList.length) {
            currentState = statesList[stateId];
        }
    }

    public State getCurrentState(){
        return this.currentState;
    }

    public void Activate(){

        currentState.activate();
    }

    public void Start(){
        currentState.start();
    }

//    public void PayType(){
//        currentState.payType();
//    }
}
