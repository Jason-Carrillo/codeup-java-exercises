package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Scanner scan = new Scanner(System.in);


        Movie[] movies = MoviesArray.findAll();


        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        switch (input.getInt(0, 5)){
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("view all movies");
                for(Movie movie: movies){
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                break;
            case 2:
                System.out.println("view movies in animated category");
                for (Movie movie: movies){
                    if(movie.getCategory().equalsIgnoreCase("animated")){
                    System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
                break;
            case 3:
                System.out.println("view movies in drama category");
                for (Movie movie: movies){
                    if(movie.getCategory().equalsIgnoreCase("drama")){
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
                break;
            case 4:
                System.out.println("view movies in horror category");
                for (Movie movie: movies){
                    if(movie.getCategory().equalsIgnoreCase("horror")){
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
                break;
            case 5:
                System.out.println("view movies in scifi category");
                for (Movie movie: movies){
                    if(movie.getCategory().equalsIgnoreCase("scifi")){
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
                break;


        }
    }

}
