package edu.iit.architecture.mda.AbstractFactory;

import edu.iit.architecture.mda.OutputProcessor.Strategy.CancelMsg.CancelMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.CancelMsg.CancelMsg2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu.DisplayMenu2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.EjectCard.EjectCard;
import edu.iit.architecture.mda.OutputProcessor.Strategy.EjectCard.EjectCard2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PayMsg.PayMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PayMsg.PayMsg2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt.PrintReceipt;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt.PrintReceipt2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.RejectMsg.RejectMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.RejectMsg.RejectMsg2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash.ReturnCash;
import edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash.ReturnCash1;
import edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash.ReturnCash2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues.SetInitialValues;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues.SetInitialValues2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType.SetPayType;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType.SetPayType2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice.SetPrice;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice.SetPrice2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash.StoreCash;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash.StoreCash2;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices.StorePrices;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices.StorePrices2;
import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump1;
import edu.iit.architecture.mda.PlatformData.DataStoreGasPump2;


/*
    This class is the factory that produces the necessary driver objects for GasPump2
    Instantiates the proper action strategies with the shared data structure
    OutputProcessor object will be instantiated with an object of this class when it needs to
    display output for GasPump2. Output processor will call the methods provided by this class in order to bind
    GasPump2 specific actions.
*/
public class GasPumpFactory2 extends AbstractGasPumpFactory{
    private DataStore dataStore;

    public GasPumpFactory2(){
        this.dataStore = new DataStoreGasPump2();
    }

    @Override
    public DataStore getDataStore() {
        return this.dataStore;
    }

    @Override
    public StorePrices getStorePrices() {
        return new StorePrices2(this.dataStore);
    }

    @Override
    public PayMsg getPayMsg() {
        return new PayMsg2();
    }

    @Override
    public StoreCash getGetStoreCash() {
        return new StoreCash2(this.dataStore);
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu2(this.dataStore);
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg2();
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice2(this.dataStore);
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues2(this.dataStore);
    }

    @Override
    public PumpGasUnit getPumpedGasUnit() {
        return new PumpGasUnit2(this.dataStore);
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg2(this.dataStore);
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt2(this.dataStore);
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg2();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash2(this.dataStore);
    }

    @Override
    public SetPayType getSetPayType() {
        return new SetPayType2(this.dataStore);
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard2();
    }
}
