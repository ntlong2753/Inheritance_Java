package Point;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);
        Point p2 = new Point(2,5);
        System.out.println(p2);

        MovablePoint mp1 = new MovablePoint(1,2,3,4);
        System.out.println(mp1);
    }
}
