package Week_9;

public class vechicle
{
    protected int vechicleId;
    protected String brand;
    protected double basePrice;
    
    public vechicle(int vechicleId , String brand , double basePrice)
    {
        this.brand = brand;
        this.vechicleId = vechicleId;
        this.basePrice = basePrice;
        System.out.println("This is our default vechile constructor.");
    }
    public void displayInfo(){
        System.out.println("Vechicle brand: " +this.brand);
        System.out.println("Vechicle id: " +this.vechicleId);
        System.out.println("Vechicle basePrice: " +this.basePrice);
    }
    public double calculateTax(){
        return basePrice * 0.10;
    }
    
}