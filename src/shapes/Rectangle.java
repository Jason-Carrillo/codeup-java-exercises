package shapes;

public class Rectangle {
    protected int length;
    protected int width;


    public Rectangle(int userWidth, int userLength){
        this.length = userLength;
        this.width = userWidth;
    }

    public int getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    public int getArea(){
        return this.length * this.width;
    }

}
