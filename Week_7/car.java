package Week_7;

public class car
{
    public static void main(String[] args){
        //classname c1 = new classname();
        main1 c1 = new main1();
        c1.brand = "Mclaren";
        c1.color = "black";
        c1.price = 2000000;
        c1.drive();
        
        System.out.println("Car brand :" + c1.brand);
        System.out.println("Car color :" + c1.color);
        System.out.println("Car price :" + c1.price);
        System.out.println();
        
        main1 c2 = new main1();
        c2.brand = "Ferrari";
        c2.color = "Red";
        c2.price = 250000;
        c2.drive();
        
        System.out.println("Car brand :"+ c2.brand);
        System.out.println("Car color :"+ c2.color);
        System.out.println("Car price :"+ c2.price);
        System.out.println();
    }
}