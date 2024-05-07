package carpetcostcalculator17;

public class Main {
    public static void main(String[] args) {
        // Test cases
        // Create a carpet with cost $3.5 per square meter and a floor with dimensions 2.75x4.0 meters
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        // Create a calculator with the given floor and carpet
        Calculator calculator = new Calculator(floor, carpet);
        // Calculate and print the total cost
        System.out.println("total= " + calculator.getTotalCost());

        // Create another carpet with cost $1.5 per square meter and a floor with dimensions 5.4x4.5 meters
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        // Create a new calculator with the new floor and carpet
        calculator = new Calculator(floor, carpet);
        // Calculate and print the total cost
        System.out.println("total= " + calculator.getTotalCost());
    }
}
