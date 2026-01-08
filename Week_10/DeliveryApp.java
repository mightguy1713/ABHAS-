package Week_10;

public class DeliveryApp
{
    public static void main(String [] args){
        bikeDelivery b1 = new bikeDelivery(1 , "Abhas" , 10000);
        carDelivery c1 = new carDelivery(2 , "Abdica" , 7500);
        
        System.out.println(b1);
        System.out.println("Bike Payment :" +b1.calculatePayment(5));
        
        System.out.println();
        
        System.out.println(c1);
        System.out.println("Car Payment :" +c1.calculatePayment(10));
    }
}