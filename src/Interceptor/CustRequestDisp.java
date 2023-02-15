package Interceptor;

import java.util.Vector;
import App.Rental;

// This class is uses a singleton pattern and is the subject of an observer pattern

public class CustRequestDisp{
    // making this a singleton class as only 1 dispatcher of this type is needed
    private static CustRequestDisp instance = new CustRequestDisp();
    Vector<ICustRequestInter> interceptors;


    private CustRequestDisp(){
        interceptors = new Vector<>();
    }

    public static CustRequestDisp getInstance(){
        return instance;
    }

    // Observer pattern
    public void registerICustRequestInter(ICustRequestInter i) {
        interceptors.addElement(i);
    }

    public void unregisterICustRequestInter(ICustRequestInter i) {
        interceptors.removeElement(i);
    }

    public void dispatchCustRentLogRequest(Rental r) {
        for(ICustRequestInter ic: interceptors) {
            ic.onCustRentLogRequest(r);
        }
    }

    public void dispatchCustReturnLogRequest(Rental r) {
        for(ICustRequestInter ic: interceptors) {
            ic.onCustReturnLogRequest(r);
        }
    }
}
