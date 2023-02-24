package Tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import App.Customer;
import App.Movie;
import App.Rental;
import Interceptor.CustRequestDisp;
import Interceptor.CustRequestInter;

public class MovieRentalTest {
    @Test
    public void addRentalTest() {
        // Creating an customer rental logging request specific intercepter and adding to the same specific dispatcher (observer pattern)
        CustRequestInter myInter = new CustRequestInter();
        CustRequestDisp.getInstance().registerICustRequestInter(myInter);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Customer cust = new Customer("Tim Tam");
        Movie mov = new Movie("Shrek 2", 1);
        Rental rent = new Rental(mov, 99);

        cust.addRental(rent); // Interception point

        Assert.assertEquals("Logged: Movie rented by Tim Tam\n" +
                "Movie: Shrek 2\n" +
                "Price: €297.0\n" +
                "Days to be rented for: 99", outContent.toString().trim());
    }
}
