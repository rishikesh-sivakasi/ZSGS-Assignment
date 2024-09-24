public class MultipleClasses {
     public static void main(String[] args) {
          Addition a = new Addition();
          Subtration s = new Subtration();
          Multiplication m = new Multiplication();
          Division d = new Division();
          System.out.println("A = 8  B = 2");
          System.out.println("Addition : "+a.Sum(8, 2));
          System.out.println("Subtration : "+s.Sub(8, 2));
          System.out.println("Multiplication : "+m.mul(8, 2));
          System.out.println("Division : "+d.div(8, 2));
     }
}
class Addition
{
     public int Sum(int a , int b)
     {
          return a+b;
     }
}
class Subtration
{
     public int Sub(int a , int b)
     {
          return a-b;
     }
}
class Multiplication
{
     public int mul(int a , int b)
     {
          return a*b;
     }
}
class Division
{
     public int div(int a , int b)
     {
          return a/b;
     }
}
