package Interceptor;

// This is an interceptor

// Customer Request Interceptor interface
public interface ICustRequestInter {
    public void onCustRentLogRequest(IRentalContObj rentCtx);
    public void onCustReturnLogRequest(IRentalContObj rentCtx);
}
