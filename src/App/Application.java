package App;

import Interceptor.ConcCustRequestInter;
import Interceptor.CustRequestDisp;

public class Application {
    public static void main(String[] args) throws Exception {
        // Creating an customer rental logging request specific intercepter and adding to the same specific dispatcher (observer pattern)
        //ConcCustRequestInter myInter = new ConcCustRequestInter();
        // CustRequestDisp.getInstance().registerICustRequestInter(myInter);

        System.out.println("TESTTTTTTT");
        Customer cust1 = new Customer("George");
        Movie mov1 = new Movie("Puss in Boots", 2);
        Rental rent1 = new Rental(mov1, 3);
        cust1.addRental(rent1); // Interception point
        System.out.println(cust1.statement());
        System.out.println("ENDDDDDDDD");



        // Movie mov2 = new Movie("Shrek 2", 100);
        // Rental rent2 = new Rental(mov2, 99);

        //cust1.addRental(rent2); // Interception point

        //cust1.returnRental(rent2); // Interception point
    }
}
