package Week_11;

public abstract class Delivery
{
    private int orderId;
    private double distanceInKm;
    private String pickUpLocation;
    private String dropOfLocation;
    
    public Delivery(int orderId ,double distanceInKm , String pickUpLocation , String dropOfLocation){
        this.orderId = orderId;
        this.distanceInKm = distanceInKm;
        this.pickUpLocation = pickUpLocation;
        this.dropOfLocation = dropOfLocation;
    }
    public int getOrderId(){
        return this.orderId;
    }
    public double getdistanceInKm(){
        return this.distanceInKm;
    }
    
    abstract double calculateCharge();
    abstract double estimateTime();
}