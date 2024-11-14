package Abstract_Class;

abstract class Movie {
     private String title;
     private String director;
 
     public Movie(String title, String director) {
         this.title = title;
         this.director = director;
     }
 
     public abstract void showGenre();
 
     public String getTitle() {
         return title;
     }
 
     public String getDirector() {
         return director;
     }
 }
 
 class RomComMovie extends Movie {
     public RomComMovie(String title, String director) {
         super(title, director);
     }
 
     public void showGenre() {
         System.out.println(getTitle() + " is a Romantic Comedy movie directed by " + getDirector() + ".");
     }
 }
 
 class ThrillerMovie extends Movie {
     public ThrillerMovie(String title, String director) {
         super(title, director);
     }
 
     public void showGenre() {
         System.out.println(getTitle() + " is a Thriller movie directed by " + getDirector() + ".");
     }
 }
 
 class ActionMovie extends Movie {
     public ActionMovie(String title, String director) {
         super(title, director);
     }
 
     public void showGenre() {
         System.out.println(getTitle() + " is an Action movie directed by " + getDirector() + ".");
     }
 }
 
 class MovieDemo {
     public static void main(String[] args) {
         Movie m1 = new RomComMovie("Remo","Bakkiyaraj Kannan");
         Movie m2 = new ActionMovie("K.G.F"," Prashanth Neel");
         Movie m3 = new ThrillerMovie("Ratsasan","Ram Kumar");

         m1.showGenre();
         m2.showGenre();
         m3.showGenre();
     }
 }