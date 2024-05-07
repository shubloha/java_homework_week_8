package carpetcostcalculator17;

public class Carpet {
    // Field
     double cost;

    // Constructor
    public Carpet(double cost) {
        // Ensure non-negative cost value
        this.cost = (cost < 0) ? 0 : cost;
    }

    // Instance method to get the cost per square meter of the carpet
    public double getCost() {
        return cost;
    }
}
