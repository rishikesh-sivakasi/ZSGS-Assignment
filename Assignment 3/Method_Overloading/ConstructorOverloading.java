package Method_Overloading;

class Person {
     private String name ;
     private int age ;
     private String address ;

     Person(String name){
          this.name = name;
     }
     Person(String name, int age){
          this.name = name;
          this.age = age;
     }
     Person(String name, int age, String address){
          this.name = name;
          this.age = age;
          this.address = address;
     }

     public String toString(){
          return "Name : "+this.name +"\nAge : "+this.age+"\nAddress : "+this.address;
     }
}


public class ConstructorOverloading {
     public static void main(String[] args) {
          Person person1 = new Person("Rishi"); 
          Person person2 = new Person("Rishi",21); 
          Person person3 = new Person("Rishi",21,"AKP Street"); 
          System.out.println(person1.toString());
          System.out.println(person2.toString());
          System.out.println(person3.toString());
     }
}
