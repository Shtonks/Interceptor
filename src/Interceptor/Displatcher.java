package Interceptor;

import java.util.Vector;

public class Displatcher implements ICustRequestInter{
    // Not entirely sure if this vector type should be defined or not
    Vector<ICustRequestInter> interceptors;

    public void registerICustRequestInter(ICustRequestInter i) {
        interceptors.addElement(i);
    }

    public void unregisterICustRequestInter(ICustRequestInter i) {
        interceptors.removeElement(i);
    }

    // Should I do this?
    @Override
    public void onLogRequest(ICustomerRentalRequest context) {
        // TODO Auto-generated method stub
        
    }
}
