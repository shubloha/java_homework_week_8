package cylinder19;

public class Cylinder extends Circle{
    // Private instance variable for height
    double height;

    // Constructor with parameters radius and height
    public Cylinder(double radius, double height) {
        // Call the constructor of the superclass (Circle) with radius
        super(radius);
        // Check if height is negative, if so set it to 0
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume of the cylinder
    public double getVolume() {
        // Volume = area of the base (circle) * height
        return super.getArea() * height;
    }
}
