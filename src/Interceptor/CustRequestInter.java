package Interceptor;

// This is a concrete interceptor

public class CustRequestInter implements ICustRequestInter {

    @Override
    public void onCustRentLogRequest(IContextObj ctxObj) {
        System.out.println("Logged: Movie rented by " + ctxObj.getCustomerName() +
                            "\nMovie: " + ctxObj.getMovieTitle() + 
                            "\nPrice: €" + ctxObj.getMoviePrice() +
                            "\nDays to be rented for: " + ctxObj.getDaysRented() + "\n");
    }

    @Override
    public void onCustReturnLogRequest(IContextObj ctxObj) {
        System.out.println("Logged: Movie returned by " + ctxObj.getCustomerName() +
                            "\nMovie: " + ctxObj.getMovieTitle() + 
                            "\nDays to be rented for: " + ctxObj.getDaysRented() + 
                            "\nCustomers current frequent renter points: " + ctxObj.getCustomerFreqRenterPoints() + "\n");
    }
    
}