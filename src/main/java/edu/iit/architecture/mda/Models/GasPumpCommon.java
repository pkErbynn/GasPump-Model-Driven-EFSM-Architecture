package edu.iit.architecture.mda.Models;

import edu.iit.architecture.mda.AbstractFactory.AbstractGasPumpFactory;
import edu.iit.architecture.mda.GasPumpMDAEFSM.GasPumpMDA;
import edu.iit.architecture.mda.OutputProcessor.OP;
import edu.iit.architecture.mda.PlatformData.DataStore;

// Unused
public abstract class GasPumpCommon {
    DataStore dataStore;
    GasPumpMDA mdaEfsm;

    GasPumpCommon(AbstractGasPumpFactory af){
        this.dataStore = af.getDataStore();
        this.mdaEfsm = new GasPumpMDA();
        OP op = new OP(af);
        this.mdaEfsm.setOp(op);
    }

    // Each GasPump must present a menu displaying its available operations.
    public abstract void printOperations();
}
