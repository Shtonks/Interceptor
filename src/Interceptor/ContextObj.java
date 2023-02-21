package Interceptor;

import App.Customer;
import App.Rental;

public class ContextObj implements IContextObj{
    private Customer cust;
    private Rental rental;
    
    public ContextObj(Customer cust, Rental rental) {
        this.cust = cust;
        this.rental = rental;
    }

    @Override
    public String getCustomerName() {
        return cust.getName();
    }

    @Override
    public String getMovieTitle() {
        return rental.getMovie().getTitle();
    }

    @Override
    public double getMoviePrice() {
        return rental.getCharge();

    }

    @Override
    public int getDaysRented() {
        return rental.getDaysRented();
    }

    @Override
    public double getCustomerFreqRenterPoints() {
        return cust.getTotalFreqRenterPoints();
    }
}
