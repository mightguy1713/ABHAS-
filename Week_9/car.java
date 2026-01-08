package Week_9;

public class car extends vechicle
{
    private int doors;
    private String fuelType;
    
    public car (int vechicleId , String brand , double basePrice ,int doors , String fuelType)
    {
        super (vechicleId,brand,basePrice);
        this.doors = doors;
        this.fuelType = fuelType;
    }
    public void displayCarInfo(){
        super.displayInfo();
        System.out.println("Number of Doors :" +this.doors);
        System.out.println("Car tax :" +super.calculateTax());
    }
    public double calculateFinalPrice(){
        return basePrice * 0.5 + super.calculateTax();
    }
}
