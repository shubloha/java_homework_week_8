package poolarea20;

public class Cuboid extends Rectangle {
    //instance variable for height
    double height;
    // Constructor with parameters width, length, and height
    public Cuboid(double width, double length, double height) {
        // Call the constructor of the superclass (Rectangle) with width and length
        super(width, length);
        // Check if height is negative, if so set it to 0
        this.height = height;
        if (this.height < 0)
            this.height = 0;
    }
    // Method to get the height
    public double getHeight() {
        return height;
    }
    // Method to calculate and return the volume of the cuboid
    public double getVolume() {
        return (getArea() * height);
    }
}
