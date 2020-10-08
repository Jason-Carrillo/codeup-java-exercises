package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        System.out.println(box1.getArea(box1.length, box1.width));
        System.out.println(box1.getPerimeter(box1.length, box1.width));

        System.out.println(box2.getArea(box2.length, box2.width));
        System.out.println(box2.getPerimeter(box2.length, box2.width));

    }


}
