package Interceptor;

import java.util.Vector;

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

    // Observer pattern elements
    public void registerICustRequestInter(ICustRequestInter i) {
        interceptors.addElement(i);
    }

    public void unregisterICustRequestInter(ICustRequestInter i) {
        interceptors.removeElement(i);
    }

    public void dispatchCustRentLogRequest(ContextObj ctxObj) {
        for(ICustRequestInter ic: interceptors) {
            ic.onCustRentLogRequest(ctxObj);
        }
    }

    public void dispatchCustReturnLogRequest(ContextObj ctxObj) {
        for(ICustRequestInter ic: interceptors) {
            ic.onCustReturnLogRequest(ctxObj);
        }
    }
}
