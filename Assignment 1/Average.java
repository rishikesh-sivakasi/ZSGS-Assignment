import java.util.Scanner;

public class Average {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float weights[] = new float[10];
          System.out.println("Enter the people weights");
          for (int i = 0; i < weights.length; i++) {
               weights[i] = sc.nextFloat();
          }
          float average = 0.0f;
          for(float temp : weights)
          {
               average += temp; 
          }
          System.out.println("Average of 10 people's weight is "+average/10);
          sc.close();
     }
}
