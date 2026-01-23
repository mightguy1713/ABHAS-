package Week_12;

public class Main
{
     public static void main(String[] args) {

        BusCompany company = new BusCompany();

        Bus b1 = new Bus("1234", "Red", "Kathmandu to Pokhara", "Abhas", true, 600);
        Bus b2 = new Bus("5678", "Blue", "Butwal to Chitwan", "Ram", false, 450);
        Bus b3 = new Bus("9876", "Green", "Biratnagar to Itahari", "Diya", true, 700);
        
        company.addBus(b1);
        company.addBus(b2);
        company.addBus(b3);

        System.out.println("Buses: ");
        company.displayBuses();

        System.out.println("Buses with rate more than 500:");
        company.displayRateMoreThan500();

        System.out.println("Red or Blue buses:");
        company.displayRedOrBlue();

        company.removeBus(1);  
        company.removeBus(5);   
    }
}