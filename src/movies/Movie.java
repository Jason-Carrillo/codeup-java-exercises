package movies;

import util.Input;

public class Movie {
    final private String name;
    final private String category;

    public Movie(String movieName, String movieCategory) {
        this.name = movieName;
        this.category = movieCategory;
    }

    public String getMovie() {
        return String.format("Name: %s, Category: %s", name, category);
    }
}
