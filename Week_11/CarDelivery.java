package Week_11;

public class CarDelivery extends Delivery implements Notification{
    
    private static final double perkmcharge = 40;
    private static final double minperkm = 3;
    
    public CarDelivery(int orderId , double distanceInKm , String pickUpLocation , String dropOfLocation){
        super(orderId , distanceInKm , pickUpLocation , dropOfLocation);
    }
    
    @Override 
    public double calculateCharge(){
        return super.getdistanceInKm() * perkmcharge;
    }
    
    public void notify(String message){
        System.out.print(message);
    }
    
    @Override
    public double estimateTime(){
        return super.getdistanceInKm() * minperkm;
    }
}