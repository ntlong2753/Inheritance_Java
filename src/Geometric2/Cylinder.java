package Geometric2;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Hình trụ có chiều cao = "
                + getHeight()
                + "; là lớp con của lớp hình tròn;\n- "
                + super.toString();
    }
}
