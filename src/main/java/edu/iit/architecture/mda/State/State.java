package edu.iit.architecture.mda.State;

import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;



/**
 * This class serves as the abstract superclass for the State pattern used in a decentralized state machine.
 *
 * In a typical implementation, each method in this class would be abstract, requiring every state subclass
 * to implement all the methods. However, this approach can lead to unnecessary code duplication and wasted memory
 * because most state subclasses might only need to implement a couple of methods while leaving others blank.
 *
 * Instead, this class provides default implementations that print a "operation can't be performed....." message, reducing the need
 * for subclasses to implement empty methods. Subclasses can then override only the methods they need,
 * while calling an unimplemented method will trigger a "Not Allowed" message, indicating that the operation
 * is invalid for the current state.
 */


public abstract class State {
    protected GasPumpMDA mdaEfsm;
    protected OP op;

    State(GasPumpMDA mda) {
        this.mdaEfsm = mda;
        this.op = mdaEfsm.getOp();
    }

    public OP getOp() {
        return this.op;
    }

    public void activate(){
        operationNotAllowed();
    };
    public void start(){
        operationNotAllowed();
    };
    public void payType(int t){
        operationNotAllowed();
    };
    public void reject(){
        operationNotAllowed();
    };
    public void cancel(){
        operationNotAllowed();
    };
    public void approved(){
        operationNotAllowed();
    };
    public void startPump(){
        operationNotAllowed();
    };
    public void pump(){
        operationNotAllowed();
    };
    public void stopPump(){
        operationNotAllowed();
    };
    public void selectGas(int g){
        operationNotAllowed();
    };
    public void receipt(){
        operationNotAllowed();
    }
    public void noReceipt(){
        operationNotAllowed();
    }
    public void continueToNextState(){
        operationNotAllowed();
    };
    private void operationNotAllowed(){
        System.out.println("Operation can't be performed in this state.");
    }
}
