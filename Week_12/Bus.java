package Week_12;

public class Bus
{
    private String numberPlate;
    private String color;
    private String route;
    private String customerName;
    private boolean availableStatus;
    private int rate;
    
    //constructor.
     public Bus(String numberPlate, String color, String route, String customerName, boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }
    
    public String getColor() {
        return color;
    }

    public int getRate() {
        return rate;
    }
    
    public void displayDescription() {
        System.out.println("Bus Number Plate: " + numberPlate);
        System.out.println("Color: " + color);
        System.out.println("Route: " + route);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Available: " + availableStatus);
        System.out.println("Rate: " + rate);
        System.out.println();
    }
    
}