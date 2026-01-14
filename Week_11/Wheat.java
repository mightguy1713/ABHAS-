package Week_11;
public class Wheat extends Crop implements Transportable {

    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 3.0;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 6000;
    }

    @Override
    public double calculateTransportCost(double distanceKm) {
        return distanceKm * 40;
    }

    @Override
    public String getTransportMethod() {
        return "Truck";
}

}