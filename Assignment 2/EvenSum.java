import java.util.Scanner;

public class EvenSum {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements in the array");
          int n = sc.nextInt();
          int arr[] = new int[n];
          int evenSum = 0;
          System.out.println("Enter the array elements");
          for (int i = 0; i < n; i++)
          {
               arr[i] = sc.nextInt();
               if(arr[i]%2==0)
                    evenSum += arr[i]; 
          } 
          System.out.println("The sum of the even numbers in an array is "+evenSum);
          sc.close();
     }
}
