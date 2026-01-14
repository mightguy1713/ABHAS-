package Week_11;
public class FarmManagementSystem {

    public static void main(String[] args) {

        Crop rice = new Rice(1.2); 
        Transportable transportRice = (Transportable) rice;

        rice.displayCropInfo();
        System.out.println("Yield: " + rice.calculateYield());
        System.out.println("Water Requirement: " + rice.calculateWaterRequirement());
        System.out.println("Transport Method: " + transportRice.getTransportMethod());
        System.out.println("Transport Cost: " +transportRice.calculateTransportCost(15));
        
        System.out.println();

        Crop maize = new Maize(0.8);
        Transportable transportMaize = (Transportable) maize;

        maize.displayCropInfo();
        System.out.println("Yield: " + maize.calculateYield());
        System.out.println("Water Requirement: " + maize.calculateWaterRequirement() );
        System.out.println("Transport Method: " + transportMaize.getTransportMethod());
        System.out.println("Transport Cost : " +transportMaize.calculateTransportCost(10));
    }
}
