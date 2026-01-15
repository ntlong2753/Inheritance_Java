package Geometric;

public class Square extends Rectangle {
    public Square() {

    }
    public Square(double side) {

    }
    public Square(double side, String color, boolean filled) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + "; Which is a subclass of "
                + "\n" + super.toString();
    }
}
