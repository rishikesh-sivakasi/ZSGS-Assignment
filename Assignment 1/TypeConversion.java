
public class TypeConversion {
     public static void main(String[] args) {
          float f1 = 5.5f;
          int i1 = (int) f1;
          System.out.println("Type Conversion from float "+f1+" to int is "+i1);
          double d1 = 24.567434526;
          float f2 = (float) d1;
          System.out.println("Type Conversion from double "+d1+" to float is "+f2);
          int i2 = 57410;
          short s1 = (short) i2;
          System.out.println("Type Conversion from int "+i2+" to short is "+s1);
     }
     
}