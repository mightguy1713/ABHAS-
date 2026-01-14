package Week_11;

public class Rice extends Crop implements Transportable {

    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 4.0;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 12000; 
    }

    @Override
    public double calculateTransportCost(double distanceKm) {
        return distanceKm * 50; 
    }

    @Override
    public String getTransportMethod() {
        return "Tractor";
    }
}
