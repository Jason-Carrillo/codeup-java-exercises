public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"nice", "beautiful", "smelly", "plain", "scary", "clean", "fit", "happy", "jolly", "kind"};

        String[] nouns = {"Texas", "Arizona", "Mall", "Jail", "Belt", "Line", "Boat", "Fish", "Planet", "Plants"};

//        System.out.println(Math.round(Math.random() * 10));
        System.out.println(randomizer(adjectives, nouns));

//        END of main
    }


    public static String randomizer(String [] adjectives, String[] nouns){
        String adj = adjectives[(int) Math.round(Math.random() * 10)];
        String noun = nouns[(int) Math.round(Math.random() * 10)];

        return adj + " " + noun;
    }

}
