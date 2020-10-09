package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.getLength();
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getLength();
    }

    @Override
    public void setLength(double userLength) {
        this.length = userLength;
    }

    @Override
    public void setWidth(double userWidth) {
        this.width = userWidth;
    }
}
