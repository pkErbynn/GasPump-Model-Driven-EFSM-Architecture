package edu.iit.architecture.mda.OutputProcessor.Strategy.RejectMsg;

public class RejectMsg1 extends RejectMsg {
    @Override
    public void rejectMsg() {
        System.out.println("CREDIT CARD REJECTED");
        System.out.println("Cancelling transaction ...");
    }
}
