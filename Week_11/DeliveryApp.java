package Week_11;

public class DeliveryApp
{
    public static void main(String [] args){
        Delivery d1 = new CarDelivery (101 , 12 , "Kathmandu" , "dkjsadjsak");
        System.out.println(d1.calculateCharge());
    }
}