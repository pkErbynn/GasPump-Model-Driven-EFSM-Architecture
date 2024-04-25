package edu.iit.architecture.mda.OutputProcessor.Strategy.EjectCard;

public class EjectCard2 extends EjectCard {

    /*
        GasPump2 does not support credit card payment and so this action will do nothing
        This action is never be invoked on a GasPump2 component
    */

    @Override
    public void ejectCard() {
    }
}
