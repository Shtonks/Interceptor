package Interceptor;

// This is an interceptor

// Customer Request Interceptor interface
public interface ICustRequestInter {
    public void onCustRentLogRequest(IContextObj ctxObj);
    public void onCustReturnLogRequest(IContextObj ctxObj);
}
