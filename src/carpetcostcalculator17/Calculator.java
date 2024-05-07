package carpetcostcalculator17;

public class Calculator {
    // Fields
    private Floor floor;
    private Carpet carpet;

    // Constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Instance method to calculate the total cost
    public double getTotalCost() {
        // Total cost is area of the floor multiplied by cost per square meter of the carpet
        return floor.getArea() * carpet.getCost();
    }
}
