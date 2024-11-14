package Method_Overloading;

class MathOperation {
     int add(int FirstNumber, int SecondNumber){
          return FirstNumber + SecondNumber;
     }
     double add(double FirstNumber, double SecondNumber){
          return FirstNumber + SecondNumber;
     }
     float add(float FirstNumber, float SecondNumber){
          return FirstNumber + SecondNumber;
     }

     int subtract(int FirstNumber, int SecondNumber){
          return FirstNumber - SecondNumber;
     }
     double subtract(double FirstNumber, double SecondNumber){
          return FirstNumber - SecondNumber;
     }
     float subtract(float FirstNumber, float SecondNumber){
          return FirstNumber - SecondNumber;
     }

     int multiply(int FirstNumber, int SecondNumber){
          return FirstNumber * SecondNumber;
     }
     double multiply(double FirstNumber, double SecondNumber){
          return FirstNumber * SecondNumber;
     }
     float multiply(float FirstNumber, float SecondNumber){
          return FirstNumber * SecondNumber;
     }

     int division(int FirstNumber, int SecondNumber){
          if(SecondNumber > 0)
               return FirstNumber / SecondNumber;
          System.out.println("Second number must be greater than 0");
          return 0;
     }
     double division(double FirstNumber, double SecondNumber){
          if(SecondNumber > 0)
               return FirstNumber / SecondNumber;
          System.out.println("Second number must be greater than 0");
          return 0.0;
     }
     float division(float FirstNumber, float SecondNumber){
          if(SecondNumber > 0)
               return FirstNumber / SecondNumber;
          System.out.println("Second number must be greater than 0");
          return 0.0f;
     }
}

class Main{
     public static void main(String[] args) {
          MathOperation mo = new MathOperation();
          System.out.println("Addition");
          System.out.println("2 + 1 = "+mo.add(2,1));
          System.out.println("2.0 + 1.0 = "+mo.add(2.0,1.0));
          System.out.println("2.0f + 3.5f = "+mo.add(2.0f,1.0f));
          System.out.println("Subtraction");
          System.out.println("2 - 1 = "+mo.subtract(2,1));
          System.out.println("2.0 - 1.0 = "+mo.subtract(2.0,1.0));
          System.out.println("2.0f - 3.5f = "+mo.subtract(2.0f,3.5f));
          System.out.println("Multiplication");
          System.out.println("2 * 1 = "+mo.multiply(2,1));
          System.out.println("2.0 * 1.0 = "+mo.multiply(2.0,1.0));
          System.out.println("2.0f * 3.5f = "+mo.multiply(2.0f,3.5f));
          System.out.println("Division");
          System.out.println("2 / 1 = "+mo.division(2,1));
          System.out.println("2.0 / 1.0 = "+mo.division(2.0,1.0));
          System.out.println("2.0f / 2.0f = "+mo.division(2.0f,2.0f));
     }
}
