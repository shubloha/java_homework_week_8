package poolarea20;
// main class contain the main method
public class Main {
    public static void main(String[] args) {
        // Create an instance of Rectangle with width 5 and length 10
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        // Create an instance of Cuboid with width 5, length 10, and height 5
        Cuboid cuboid = new Cuboid(5, 10, 5);

        // Print the width, length, area, height, and volume of the cuboid
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }
}
