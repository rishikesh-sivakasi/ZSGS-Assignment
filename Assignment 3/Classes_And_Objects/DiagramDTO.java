import java.util.ArrayList;
import java.util.List;

class PlayerDTO {

     private String name;
     private String position;
     private int jerseyNumber;
 
     public PlayerDTO(String name, String position, int jerseyNumber) {
         this.name = name;
         this.position = position;
         this.jerseyNumber = jerseyNumber;
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getPosition() {
         return position;
     }
 
     public void setPosition(String position) {
         this.position = position;
     }
 
     public int getJerseyNumber() {
         return jerseyNumber;
     }
 
     public void setJerseyNumber(int jerseyNumber) {
         this.jerseyNumber = jerseyNumber;
     }
 
     public void playGame() {
         System.out.println(name + " is playing the game.");
     }
 
     public void train() {
         System.out.println(name + " is training.");
     }
 }

 class TeamDTO {
 
     private String name;
     private String city;
     private String division;
     private List<PlayerDTO> players; 
 
     public TeamDTO(String name, String city, String division) {
         this.name = name;
         this.city = city;
         this.division = division;
         this.players = new ArrayList<>(); 
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getCity() {
         return city;
     }
 
     public void setCity(String city) {
         this.city = city;
     }
 
     public String getDivision() {
         return division;
     }
 
     public void setDivision(String division) {
         this.division = division;
     }
 
     public List<PlayerDTO> getPlayers() {
         return players;
     }
 
     public void addPlayer(PlayerDTO player) {
         players.add(player);
     }
 
     public void playGame() {
         System.out.println(name + " is playing the game.");
     }
 
     public void hireCoach() {
         System.out.println("Coach hired for " + name);
     }
 }

public class DiagramDTO {
     public static void main(String[] args) {
          PlayerDTO player1 = new PlayerDTO("Virat Kolhi", "Forward", 18);
          PlayerDTO player2 = new PlayerDTO("M.S.Dhoni", "Guard", 15);
  
          TeamDTO team = new TeamDTO("India", "India", "Center");
          team.addPlayer(player1);
          team.addPlayer(player2);
  
          team.playGame();
          player1.playGame();
          player2.train();
      }
}
