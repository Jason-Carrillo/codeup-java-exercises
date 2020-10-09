public class ServerNameGenerator {
    public static void main(String[] args) {



        System.out.println("Here is an random adjective, and noun from the lists\n");
        System.out.println(randomizer(adjectives, nouns));

//        END of main
    }

    public static String[] adjectives = {"nice", "beautiful", "smelly", "plain", "scary", "clean", "fit", "happy", "jolly", "kind"};

    public static String[] nouns = {"Texas", "Arizona", "Mall", "Jail", "Belt", "Line", "Boat", "Fish", "Planet", "Plants"};

    public static String randomizer(String [] adjectives, String[] nouns){
        String adj = adjectives[(int) Math.round(Math.random() * adjectives.length)];
        String noun = nouns[(int) Math.round(Math.random() * nouns.length)];

        return adj + "-" + noun;
    }

}
