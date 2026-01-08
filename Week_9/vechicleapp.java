package Week_9;

public class vechicleapp
{
    public static void main(String [] args){
        System.out.println("Car details:");
        car c1 = new car(101 , "Mustang" , 2000000 , 4 , "Petrol");
        c1.displayCarInfo();
        c1.calculateFinalPrice();
        
        System.out.println();
        System.out.println("Bike details:");
        bike b1 = new bike(102 , "Bullet" , 20000 , 1);
        b1.displayBikeInfo();
        b1.finalPrice();
    }
}