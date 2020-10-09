package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;


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

    public abstract setLength(double newLength){
        this.length = newLength;
    }

    public abstract setWidth(double newWidth){
        this.length = newWidth;
    }
}
