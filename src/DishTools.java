import jdk.swing.interop.SwingInterOpUtils;

public class DishTools {
    public static void main(String[] args) {
//        Create a class of static fields (properties and methods) called DishTools
//        - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000
//        - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//        - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or
//        “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//        - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//        Try out the DishTools methods with Dish objects in the DishTest main method

        System.out.println(shoutDishName("water"));
        System.out.println(analyzeDishCost(14000));

    }

    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static String shoutDishName(String x){
        return x.toUpperCase();
    }

    public static String analyzeDishCost(int dishCost){
        if (dishCost > AVERAGE_COST_OF_DISH_IN_CENTS){
            return "More expensive than average";
        } else if (dishCost < AVERAGE_COST_OF_DISH_IN_CENTS){
            return "Less expensive than average";
        } else {
            return "Average cost";
        }
    }

}
