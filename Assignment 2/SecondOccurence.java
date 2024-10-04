import java.util.Scanner;

public class SecondOccurence {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array");
          int n = sc.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter the array elements");
          for (int i = 0; i < n; i++) 
               arr[i] = sc.nextInt();
          System.out.println("Enter the target");
          int target = sc.nextInt();
          int occurence = 0 , i = 0;
          for (;i<arr.length;i++) {
               if(target == arr[i])
                    occurence++;
               if(occurence==2)
                    break;
          }
          System.out.println("The secondoccurence of the number "+target+" is in "+i+" index");
          sc.close(); 
     }
}
