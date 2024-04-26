package edu.iit.architecture.mda.OutputProcessor;

import edu.iit.architecture.mda.AbstractFactory.AbstractGasPumpFactory;
import edu.iit.architecture.mda.PlatformData.DataStore;
import edu.iit.architecture.mda.OutputProcessor.Strategy.CancelMsg.CancelMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import edu.iit.architecture.mda.OutputProcessor.Strategy.EjectCard.EjectCard;
import edu.iit.architecture.mda.OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PayMsg.PayMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PrintReceipt.PrintReceipt;
import edu.iit.architecture.mda.OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit;
import edu.iit.architecture.mda.OutputProcessor.Strategy.RejectMsg.RejectMsg;
import edu.iit.architecture.mda.OutputProcessor.Strategy.ReturnCash.ReturnCash;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetInitialValues.SetInitialValues;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPayType.SetPayType;
import edu.iit.architecture.mda.OutputProcessor.Strategy.SetPrice.SetPrice;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StoreCash.StoreCash;
import edu.iit.architecture.mda.OutputProcessor.Strategy.StorePrices.StorePrices;


/*
   This class serves as the central output processor within the gas pump system architecture.
   It is initialized using the Abstract Factory design pattern, which allows for the specification of action implementations tailored to the particular model of gas pump in use.
   Each method, or 'meta-action,' in this class delegates to the platform-specific implementation of that action, provided by the concrete factory.

   In the context of the Strategy design pattern, this class functions as the 'Client,' coordinating the execution of strategies defined by the concrete implementations
 */

public class OP {
    protected DataStore dataStore;

    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private EjectCard ejectCard;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPayType setPayType;
    private SetPrice setPrice;
    private StoreCash storeCash;
    private StorePrices storePrices;

    public OP(AbstractGasPumpFactory af){
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.ejectCard = af.getEjectCard();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpedGasUnit();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPayType = af.getSetPayType();
        this.setPrice = af.getSetPrice();
        this.storeCash = af.getGetStoreCash();
        this.storePrices = af.getStorePrices();
    }


    // Meta-actions (implemented using Strategy pattern)

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public void storePrices(){
        this.storePrices.storePrices();
    }; //

    public void payMsg(){ //
        this.payMsg.payMsg();
    }

    public void storeCash(){ //
        this.storeCash.storeCash();
    }

    public void displayMenu(){ //
        this.displayMenu.displayMenu();
    }

    public void rejectMsg(){ //
        this.rejectMsg.rejectMsg();
    }

    public void setPrice(int g){ //
        this.setPrice.SetPrice(g);
    }

    public void setInitialValues(){ //
        this.setInitialValues.setInitialValues();
    }

    public void pumpGasUnit(){ //
        this.pumpGasUnit.pumpGasUnit();
    }

    public void gasPumpedMsg(){ //
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void printReceipt(){
        this.printReceipt.printReceipt();
    } //
    public void cancelMsg(){
        this.cancelMsg.cancelMsg();
    }
    public void returnCash(){
        this.returnCash.returnCash();
    } //
    public void setPayType(int t){
        this.setPayType.setPayType(t);
    }
    public void ejectCard(){
        this.ejectCard.ejectCard();
    }

}
