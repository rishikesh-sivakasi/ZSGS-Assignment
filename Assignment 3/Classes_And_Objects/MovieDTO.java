import java.time.LocalDate;

public class MovieDTO {

    private static final String DEFAULT_GENRE = "Unspecified";
    
    private String title;
    private String director;
    private LocalDate releaseDate;
    private String genre;
    private double rating; 
    private int duration;   

    public MovieDTO(String title, String director, LocalDate releaseDate, String genre, double rating, int duration) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.genre = genre != null ? genre : DEFAULT_GENRE;
        setRating(rating);
        setDuration(duration); 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre != null ? genre : DEFAULT_GENRE;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {  
            this.rating = rating;
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0) { 
            this.duration = duration;
        }
    }

    public static String getDefaultGenre() {
        return DEFAULT_GENRE;
    }

    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println("Duration: " + duration + " minutes");
    }
}

