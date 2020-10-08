package shapes;

public class Rectangle {
    protected String length;
    protected String width;


    public Rectangle(String length, String width){
        this.length = length;
        this.width = width;
    }

    public int getArea(int length, int width){
        return 2 * length + 2 * width;
    }

    public int getPerimeter(int length, int width){
        return length * width;
    }

}
