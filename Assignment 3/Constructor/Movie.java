import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private double rating;

    public Movie(String title, String director, String genre, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println();
    }
}

class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
    }

    public void addMovie(String title, String director, String genre, double rating) {
        Movie newMovie = new Movie(title, director, genre, rating);
        movies.add(newMovie);
    }

    public void displayAllMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the library.");
        } else {
            System.out.println("Movies in the library:");
            for (Movie movie : movies) {
                movie.displayMovieInfo();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();

        movieLibrary.addMovie("Inception", "Christopher Nolan", "Sci-Fi", 8.8);
        movieLibrary.addMovie("The Shawshank Redemption", "Frank Darabont", "Drama", 9.3);
        movieLibrary.addMovie("The Godfather", "Francis Ford Coppola", "Crime", 9.2);

        movieLibrary.displayAllMovies();
    }
}
