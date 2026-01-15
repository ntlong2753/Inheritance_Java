package PointXD;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println(p1);

        Point2D p2 = new Point2D(2,5);
        System.out.println(p2);

        System.out.println("-----------------------");
        Point3D p3 = new Point3D();
        System.out.println(p3);
        Point3D p4 = new Point3D(2,5,3);
        System.out.println(p4);
    }
}
