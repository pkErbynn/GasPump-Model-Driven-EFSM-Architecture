package edu.iit.architecture.mda.GasPumpMDAEFSM;

import edu.iit.architecture.mda.OutputProcessor.OP;
import edu.iit.architecture.mda.State.*;

public class GasPumpMDA {
    private State currentState;
    private State[] statesList;
    private OP op;

    public GasPumpMDA(){

        statesList =  new State[8];
        // Instantiate each state, providing a reference to this virtual machine (VM) class
        // to ensure each state can interact with the VM's methods and properties.

        statesList[0] = new S0(this);
        statesList[1] = new S1(this);
        statesList[2] = new S2(this);
        statesList[3] = new S3(this);
        statesList[4] = new S4(this);
        statesList[5] = new S5(this);
        statesList[6] = new S6(this);
        statesList[7] = new InitialIdleState(this);

        // Initial State
        currentState = statesList[7];
    }

    /*
        Getters and Setters for Output Processor
     */
    public OP getOp() {
        return op;
    }

    public void setOp(OP op) {
        this.op = op;
    }

    /*
        Forward the invoked State operations to the state class
     */

    public void activate(){
        currentState.activate();
    }

    public void start(){
        currentState.start();
    }

    public void payType(int t){
        currentState.payType(t);
    }

    public void approved(){
        currentState.approved();
    }

    public void reject(){
        currentState.reject();
    }

    public void cancel(){
        currentState.cancel();
    }

    public void startPump(){
        currentState.startPump();
    }

    public void pump(){
        currentState.pump();
    }

    public void stopPump() {
        currentState.stopPump();
    }

    public void receipt() {
        currentState.receipt();
    }

    public void noReceipt() {
        currentState.noReceipt();
    }

    public void continueToNextState() {
        currentState.continueToNextState();
    }

    public void selectGas(int g){
        currentState.selectGas(g);
    }

    public void changeState(int stateId){
        if(stateId >= 0 && stateId < statesList.length) {
            currentState = statesList[stateId];
            System.out.println("Current state: " + currentState.getClass().getSimpleName() + "\n");
        }
    }
}
