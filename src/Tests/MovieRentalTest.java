package Tests;

import org.junit.Test;

import App.Customer;
import App.Movie;
import App.Rental;
import Interceptor.CustRequestDisp;
import Interceptor.CustRequestInter;

public class MovieRentalTest {
    @Test
    public void interceptorTest() {
        // Creating an customer rental logging request specific intercepter and adding to the same specific dispatcher (observer pattern)
        CustRequestInter myInter = new CustRequestInter();
        CustRequestDisp.getInstance().registerICustRequestInter(myInter);

        Customer cust1 = new Customer("Tim Tam");
        Movie mov1 = new Movie("Puss in Boots", 2);
        Rental rent1 = new Rental(mov1, 5);
        cust1.addRental(rent1); // Interception point

        Movie mov2 = new Movie("Shrek 2", 1);
        Rental rent2 = new Rental(mov2, 99);

        cust1.addRental(rent2); // Interception point

        cust1.returnRental(rent2); // Interception point
    }
}