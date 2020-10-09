package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double userLength, double userWidth) {
        super(userLength, userWidth);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
}
