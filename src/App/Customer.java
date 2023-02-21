package App;

import java.util.ArrayList;
import java.util.List;

import Interceptor.ContextObj;
import Interceptor.CustRequestDisp;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
        // Creating a context obj to pass to the dispatcher
        ContextObj contextObj = new ContextObj(this, arg);
        // Calling the log request using singleton Disp. and passing the Context Obj
        CustRequestDisp.getInstance().dispatchCustRentLogRequest(contextObj);
    }

    public void returnRental(Rental arg) {
        _rentals.remove(arg);
        ContextObj contextObj = new ContextObj(this, arg);
        CustRequestDisp.getInstance().dispatchCustReturnLogRequest(contextObj);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : _rentals) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFreqRenterPoints()) + " frequent renter points";

        return result;
    }

    public String htmlStatement() {
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";

        for (Rental each : _rentals) {
            // show figures for each rental
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";

        }
        // add footer lines
        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(getTotalFreqRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;

    }

    private double getTotalCharge() {
        double result = 0;

        for (Rental each : _rentals) {
            result += each.getCharge();
        }
        return result;
    }

    public double getTotalFreqRenterPoints() {
        double result = 0;

        for (Rental each : _rentals) {
            result += each.getFreqRenterPoints();
        }
        return result;
    }
}