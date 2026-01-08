package Week_9;

public class bike extends vechicle
{
    private int engineCapacity;
    
    public bike (int vechicleId , String brand , double basePrice ,int engineCapacity)
    {
        super(vechicleId,brand,basePrice);
        this.engineCapacity = engineCapacity;
    }
    public void displayBikeInfo(){
        super.displayInfo();
        System.out.println("Engine Capacity: " +this.engineCapacity);
        System.out.println("Bike tax :" +super.calculateTax());
    }
    public double finalPrice(){
        return basePrice - super.calculateTax();
    }
}
       