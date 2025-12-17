package Week_7;

public class laptop
{
    String brand;
    int ram;
    double price;
    
    //constructor
    
    public laptop(String brand , int ram , double price)
    {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    public static void main(String [] args){
        laptop l1 = new laptop("Acer" , 8 , 100000);
        laptop l2 = new laptop("Lenovo" , 4 , 50000);
        laptop l3 = new laptop("Dell" , 16 , 150000);
        
    System.out.println("Laptop with RAM greater than 8 gb :");
    if (l1.ram > 8) {
        System.out.println(l1.brand + ":" + l1.ram + "GB");
    }
    if (l2.ram > 8) {
        System.out.println(l2.brand + ":" + l2.ram + "GB");
    }

    if (l3.ram > 8) {
        System.out.println(l3.brand + ":" + l3.ram + "GB");
    }
        
    }
}