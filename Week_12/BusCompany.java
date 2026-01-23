package Week_12;
import java.util.ArrayList;

public class BusCompany
{
    private ArrayList<Bus> busList = new ArrayList();
    
    //new bus add.
    public void addBus(Bus b1) {
        busList.add(b1);
        System.out.println("Bus added successfully.");
    }
    
    //remove bus by index.
     public void removeBus(int index) {
        if (index >= 0 && index < busList.size()) {
            busList.remove(index);
            System.out.println("Bus removed successfully.");
        } else {
            System.out.println("Error: Invalid index!");
        }
    }
    
    //display all bus.
    public void displayBuses() {
        for (Bus bus : busList) {
            bus.displayDescription();
        }
    }
    
    //display bus with rate > 500.
     public void displayRateMoreThan500() {
        for (Bus bus : busList) {
            if (bus.getRate() > 500) {
                bus.displayDescription();
            }
        }
    }
    
    //display bus with red or blue.
     public void displayRedOrBlue() {
        for (Bus bus : busList) {
            if (bus.getColor().equals("red") || bus.getColor().equals("blue")) {
                bus.displayDescription();
            }
        }
    }
}