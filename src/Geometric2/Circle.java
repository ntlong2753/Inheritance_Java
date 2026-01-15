package Geometric2;

public class Circle {
    private double radius;
    private String color = "blue";

    public Circle() {

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    // radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có màu " + getColor() + ", có bán kính = " + getRadius()
                + ". Diện tích = " + getArea() + " và chu vi = " + getPerimeter();
    }
}
