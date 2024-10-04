
public class Prime {
     static boolean isPrime(int n)
     {
          for (int i = 2; i < n; i++) {
               if(n%i==0)
                    return false;
          }
          return true;
     }
     public static void main(String[] args) {
          System.out.println("The prime numbers between 1 to 30 are ");
          for(int i = 2;i<30;i++)
          {
               if(isPrime(i))
                    System.out.print(i +" ");
          }
     }
}
