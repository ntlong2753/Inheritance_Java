package Geometric2;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(2.5,"red");
        System.out.println(c2);

        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);

        Cylinder cy2 = new Cylinder(2.0,5.0,"yellow");
        System.out.println(cy2);
    }
}
