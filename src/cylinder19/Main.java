package cylinder19;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Circle with radius 3.75
        Circle circle = new Circle(3.75);
        // Print the radius and area of the circle
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        // Create an instance of Cylinder with radius 5.55 and height 7.25
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        // Print the radius, height, area, and volume of the cylinder
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
