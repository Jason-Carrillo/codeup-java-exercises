package movies;
public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory) {
        name = movieName;
        category = movieName;
    }

    public String getMovie() {
        return String.format("Name: %s, Category: %s", name, category);
    }
}
