package edu.iit.architecture.mda.AbstractFactory;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.DataStore.DataStoreGasPump1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.CancelMsg.CancelMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.CancelMsg.CancelMsg1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu.DisplayMenu1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.EjectCard.EjectCard;
import edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash.StoreCash;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PayMsg.PayMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt.PrintReceipt;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit;
import edu.iit.architecture.mda.OutputProcessor.Strategy.RejectMsg.RejectMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash.ReturnCash;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues.SetInitialValues;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType.SetPayType;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice.SetPrice;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices.StorePrices;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices.StorePrices1;

/*
    This class is the factory that produces the necessary driver objects for GasPump1
    Instantiates the proper action strategies with the shared data structure
    OutputProcessor object will be instantiated with an object of this class when it needs to
    display output for GasPump1. Output processor will call the methods provided by this class in order to bind
    GasPump1 specific actions.
 */

public class GasPumpFactory1 extends AbstractGasPumpFactory {
    private DataStore dataStore;

    public GasPumpFactory1(){
        this.dataStore = new DataStoreGasPump1();
    }

    @Override
    public DataStore getDataStore() {
        return this.dataStore;
    }

    @Override
    public StorePrices getStorePrices() {
        return new StorePrices1(this.dataStore);
    }

    @Override
    public PayMsg getPayMsg() {
        return null;
    }

    @Override
    public StoreCash getGetStoreCash() {
        return null;
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1();
    }

    @Override
    public RejectMsg getRejectMsg() {
        return null;
    }

    @Override
    public SetPrice getSetPrice() {
        return null;
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return null;
    }

    @Override
    public PumpGasUnit getPumpedGasUnit() {
        return null;
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return null;
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return null;
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg1();
    }

    @Override
    public ReturnCash getReturnCash() {
        return null;
    }

    @Override
    public SetPayType getSetPayType() {
        return null;
    }

    @Override
    public EjectCard getEjectCard() {
        return null;
    }
}
