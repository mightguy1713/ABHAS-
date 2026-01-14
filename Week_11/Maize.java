package Week_11;

public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Summer", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 2.5;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 3500;
    }

    @Override
    public double calculateTransportCost(double distanceKm) {
        return distanceKm * 30;
    }

    @Override
    public String getTransportMethod() {
        return "Pickup Van";
    }
}
