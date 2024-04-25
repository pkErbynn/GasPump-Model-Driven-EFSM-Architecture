package edu.iit.architecture.mda.AbstractFactory;

import edu.iit.architecture.mda.DataStore.DataStore;
import edu.iit.architecture.mda.OutputProcessor.Strategy.CancelMsg.CancelMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
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

/*
    This class groups all ConcreteFactory classes under 1 abstract superclass
    It defines the methods that return the GasPump specific action components which
    all ConcreteFactories need to implement
 */
public abstract class AbstractGasPumpFactory {
    public abstract DataStore getDataStore();
    public abstract StorePrices getStorePrices();
    public abstract PayMsg getPayMsg();
    public abstract StoreCash getGetStoreCash();
    public abstract DisplayMenu getDisplayMenu();
    public abstract RejectMsg getRejectMsg();
    public abstract SetPrice getSetPrice();
    public abstract SetInitialValues getSetInitialValues();
    public abstract PumpGasUnit getPumpedGasUnit();
    public abstract GasPumpedMsg getGasPumpedMsg();
    public abstract PrintReceipt getPrintReceipt();
    public abstract CancelMsg getCancelMsg();
    public abstract ReturnCash getReturnCash();
    public abstract SetPayType getSetPayType();
    public abstract EjectCard getEjectCard();
}
