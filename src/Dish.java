public class Dish {
    public static void main(String[] args) {


    }

    public int costInCents;

    public String nameOfDish;

    public Boolean wouldRecommend;

    public void printSummary(){
        System.out.println("Cost: " + costInCents + "\nName: " + nameOfDish + "\nRecommended: " + wouldRecommend);
        System.out.printf("Cost: %d%nName: %s%nRecommended: %b", costInCents, nameOfDish, wouldRecommend);
    }
}
