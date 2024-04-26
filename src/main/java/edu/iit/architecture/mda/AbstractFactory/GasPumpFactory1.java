package edu.iit.architecture.mda.AbstractFactory;

import edu.iit.architecture.mda.OutputProcessor.Strategy.EjectCard.EjectCard1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PayMsg.PayMsg1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt.PrintReceipt1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.RejectMsg.RejectMsg1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash.ReturnCash1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues.SetInitialValues1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType.SetPayType1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice.SetPrice1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash.StoreCash1;
import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;
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
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;

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
        return new PayMsg1();
    }

    @Override
    public StoreCash getGetStoreCash() {
        return new StoreCash1(this.dataStore);
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1(this.dataStore);
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg1();
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice1(this.dataStore);
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues1(this.dataStore);
    }

    @Override
    public PumpGasUnit getPumpedGasUnit() {
        return new PumpGasUnit1(this.dataStore);
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg1(this.dataStore);
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt1(this.dataStore);
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg1();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash1();
    }

    @Override
    public SetPayType getSetPayType() {
        return new SetPayType1(this.dataStore);
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard1();
    }
}
