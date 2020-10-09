package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape = new Rectangle(3, 4);
        System.out.println("Rectangle Area = " + myShape.getArea());
        System.out.println("Rectangle Perimeter = " + myShape.getPerimeter());

        myShape = new Square(7);

        System.out.println("Square Area = " + myShape.getArea());
        System.out.println("Square Perimeter = " + myShape.getPerimeter());

//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());






    }


}
