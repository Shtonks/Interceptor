package Interceptor;

// This is an interceptor
// Takes on role of observer in Observer Design Pattern

// Customer Request Interceptor interface
public interface ICustRequestInter {
    public void onLogRequest(ICustomerRentalRequest context);
    // Maybe one for logging movie being returned
}
