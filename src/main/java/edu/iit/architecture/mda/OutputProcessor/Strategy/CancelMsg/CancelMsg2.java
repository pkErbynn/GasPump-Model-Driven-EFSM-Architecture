package edu.iit.architecture.mda.OutputProcessor.Strategy.CancelMsg;

public class CancelMsg2 extends CancelMsg{

    /*
        Print a cancellation message
    */
    @Override
    public void cancelMsg() {
        System.out.println("Cancelling transaction ... ");
    }
}