public class DishTest {
    public static void main(String[] args) {


        Dish dish1 = new Dish();

        dish1.costInCents = 300;
        dish1.nameOfDish = "Cold Oatmeal";
        dish1.wouldRecommend = false;

        System.out.println(dish1.printSummary());

    }
}
