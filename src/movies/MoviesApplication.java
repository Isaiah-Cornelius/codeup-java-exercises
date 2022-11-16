package movies;

import util.Input;
import movies.*;

import java.util.Arrays;

public class MoviesApplication {


    private static Movie[] newMovieArray;

    private static Movie[] addMovie(){
        String newMovieName = Input.getString("New movie name: ");
        String newMovieCategory = Input.getString("New movie category");
        Movie newMovie = new Movie(newMovieName, newMovieCategory);
        if (newMovieArray != null){
            newMovieArray = Arrays.copyOf(newMovieArray, (newMovieArray.length + 1));
        } else {
            newMovieArray = Arrays.copyOf(MoviesArray.findAll(), (MoviesArray.findAll().length + 1));
        }
        newMovieArray[newMovieArray.length-1]= newMovie;
        return newMovieArray;
    }

    private static int userChoice;

    private static void getUserChoice(){
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view category: animated");
        System.out.println("3 - view category: drama");
        System.out.println("4 - view category: horror");
        System.out.println("5 - view category: scifi");
        System.out.println("6 - add a new movie");
        System.out.println();
        userChoice = Input.getInt(0,6,"Enter your choice");

        if (newMovieArray != null){
            switch (userChoice){
                case 0:
                    System.out.println("Goodbye!");
                    return;
                case 1:
                    for(Movie movie: newMovieArray){
                        movie.getMovieInfo();
                    }
                    getUserChoice();
                    break;
                case 2:
                    for(Movie movie: newMovieArray){
                        if (movie.getMovieCategory().equals("animated")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 3:
                    for(Movie movie: newMovieArray){
                        if (movie.getMovieCategory().equals("drama")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 4:
                    for(Movie movie: newMovieArray){
                        if (movie.getMovieCategory().equals("horror")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 5:
                    for(Movie movie: newMovieArray){
                        if (movie.getMovieCategory().equals("scifi")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 6:
                    addMovie();
                    getUserChoice();
                    break;
            }
        } else {
            switch (userChoice){
                case 0:
                    System.out.println("Goodbye!");
                    return;
                case 1:
                    for(Movie movie: MoviesArray.findAll()){
                        movie.getMovieInfo();
                    }
                    getUserChoice();
                    break;
                case 2:
                    for(Movie movie: MoviesArray.findAll()){
                        if (movie.getMovieCategory().equals("animated")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 3:
                    for(Movie movie: MoviesArray.findAll()){
                        if (movie.getMovieCategory().equals("drama")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 4:
                    for(Movie movie: MoviesArray.findAll()){
                        if (movie.getMovieCategory().equals("horror")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 5:
                    for(Movie movie: MoviesArray.findAll()){
                        if (movie.getMovieCategory().equals("scifi")){
                            movie.getMovieInfo();
                        }
                    }
                    getUserChoice();
                    break;
                case 6:
                    addMovie();
                    getUserChoice();
                    break;
            }

        }
    }


    public static void main(String[] args) {
        getUserChoice();

//        System.out.println(newMovieArray);
//        System.out.println(newMovieArray != null);
//        addMovie();
//        for (Movie movie : newMovieArray){
//            movie.getMovieInfo();
//        }

    }
}
