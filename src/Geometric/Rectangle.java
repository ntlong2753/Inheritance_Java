package Geometric;

import java.awt.*;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color,  boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // width
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    // length
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    // area
    public double getArea() {
        return width * length;
    }
    // perimeter
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A circle with width = "
                + getWidth() + " and length = " + getLength()
                + "; Which is a subclass of "
                + super.toString();
    }
}
