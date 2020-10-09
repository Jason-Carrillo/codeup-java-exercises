package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length, width;


    public Quadrilateral (double userLength, double userWidth){
        this.length = userLength;
        this.width = userWidth;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public abstract void setLength(double userLength);

    public abstract void setWidth(double userWidth);
}
