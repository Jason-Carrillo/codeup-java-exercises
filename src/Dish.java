public class Dish {
    public static void main(String[] args) {


    }

    public int costInCents;

    public String nameOfDish;

    public Boolean wouldRecommend;

    public String printSummary(){
       return "Cost: " + costInCents + "\nName: " + nameOfDish + "\nRecommended: " + wouldRecommend;
    }
}
