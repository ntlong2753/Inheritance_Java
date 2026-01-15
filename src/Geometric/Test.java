package Geometric;

public class Test {
    public static void main(String[] args) {
        // Shape
        System.out.println("Testing Shape...");
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("blue", true);
        System.out.println(shape2);

        Shape shape3 = new Shape("yellow", false);
        System.out.println(shape3);

        System.out.println("-----------------------------------------");

        // Circle
        System.out.println("Testing Circle...");
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle2 = new Circle(2.5,"blue",true);
        System.out.println(circle2);

        Circle circle3 = new Circle(2.5,"yellow",false);
        System.out.println(circle3);

        System.out.println("-----------------------------------------");

        // Rectangle
        System.out.println("Testing Rectangle...");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle2 = new Rectangle(2, 5);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(2, 5, "blue",true);
        System.out.println(rectangle3);

        System.out.println("-----------------------------------------");

        // Square
        System.out.println("Testing Square...");
        Square square = new Square();
        System.out.println(square);

        Square square2 = new Square(2.5,"blue",true);
        System.out.println(square2);
    }
}
