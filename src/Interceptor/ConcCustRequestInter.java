package Interceptor;

// This is a concrete interceptor

public class ConcCustRequestInter implements ICustRequestInter {

    @Override
    public void onCustRentLogRequest(IRentalContObj rentCtx) {
        System.out.println("Logged: Movie rented");
        System.out.println("Movie: " + rentCtx.getMovie().getTitle() + 
                            "\nPrice: " + rentCtx.getMovie().getPriceCode() +
                            "\nDays to be rented: " + rentCtx.getDaysRented() + "\n");
    }

    @Override
    public void onCustReturnLogRequest(IRentalContObj rentCtx) {
        System.out.println("Logged: Movie returned");
        System.out.println("Movie: " + rentCtx.getMovie().getTitle() + 
                            "\nPrice: " + rentCtx.getMovie().getPriceCode() +
                            "\nDays to be rented: " + rentCtx.getDaysRented() + "\n");
    }
    
}