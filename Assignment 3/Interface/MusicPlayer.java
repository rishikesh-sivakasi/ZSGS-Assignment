package Interface;

interface Playable{
     void play();
     void pause();
     void stop();
}

class Mp3Player implements Playable{

     @Override
     public void play() {
          System.out.println("Mp3Player music is played");
     }

     @Override
     public void pause() {
          System.out.println("Mp3Player music is paused");
     }

     @Override
     public void stop() {
          System.out.println("Mp3Player music is stopped");
     }

}

class CDPlayer implements Playable{

     @Override
     public void play() {
          System.out.println("CDPlayer music is played");
     }

     @Override
     public void pause() {
          System.out.println("CDPlayer music is paused");
     }

     @Override
     public void stop() {
          System.out.println("CDPlayer music is stopped");
     }

}

class StreamingPlayer implements Playable{

     @Override
     public void play() {
          System.out.println("StreamingPlayer music is played");
     }

     @Override
     public void pause() {
          System.out.println("StreamingPlayer music is paused");
     }

     @Override
     public void stop() {
          System.out.println("StringPlayer music is stopped");
     }

}

public class MusicPlayer {
     public static void main(String[] args) {
          Playable mp3 = new Mp3Player();
          Playable cd = new CDPlayer();
          Playable sp = new StreamingPlayer();
          mp3.play();
          mp3.pause();
          mp3.stop();
          cd.play();
          cd.pause();
          cd.stop();
          sp.play();
          sp.pause();
          sp.stop();
     }
}
