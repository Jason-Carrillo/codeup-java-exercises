package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        double radius = input.getDouble(0, 10000);

        Circle round = new Circle(radius);

        System.out.println(round.getCircumference());
        System.out.println(round.getArea());


    }
}
