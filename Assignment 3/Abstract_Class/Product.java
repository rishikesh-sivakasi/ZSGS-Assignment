package Abstract_Class;

import java.util.*;

abstract class Product {
     private Map<String,Double> map;
     public  Scanner sc = new Scanner(System.in);

     public Map<String, Double> getMap() {
          return map;
     }
     public void setMap(Map<String, Double> map) {
          this.map = map;
     }
     abstract double getPrice(String product);
     abstract String getDescription();
}

class ElectronicsProduct extends Product{
     ElectronicsProduct(Map<String, Double> map){
          for(int i = 0;i<5;i++){
               System.out.print("Enter an ElectronicsProduct name :");
               String productName = sc.next();
               System.out.print("Enter the price of an ElectronicsProduct:");
               double productPrice = sc.nextDouble();
               map.put(productName, productPrice);
          }
          setMap(map);
     }
     public double getPrice(String product){
          return this.getMap().get(product);
     }
     public String getDescription(){
          return this.toString();
     }
     public String toString(){
          return this.getMap().toString();
     }
}

class ClothingProduct extends Product{
     ClothingProduct(Map<String, Double> map){
          for(int i = 0;i<5;i++){
               System.out.print("Enter a ClothingProduct name :");
               String productName = sc.next();
               System.out.print("Enter the price of a ClothingProduct:");
               double productPrice = sc.nextDouble();
               map.put(productName, productPrice);
          }
          setMap(map);
     }
     public double getPrice(String product){
          return this.getMap().get(product);
     }
     public String getDescription(){
          return this.toString();
     }
     public String toString(){
          return this.getMap().toString();
     }
}

class BookProduct extends Product{
     BookProduct(Map<String, Double> map){
          for(int i = 0;i<5;i++){
               System.out.print("Enter an BookProduct name :");
               String productName = sc.next();
               System.out.print("Enter the price of an BookProduct:");
               double productPrice = sc.nextDouble();
               map.put(productName, productPrice);
          }
          setMap(map);
     }
     public double getPrice(String product){
          return this.getMap().get(product);
     }
     public String getDescription(){
          return this.toString();
     }
     public String toString(){
          return this.getMap().toString();
     }
}

class ProductDemo{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Product ep = new ElectronicsProduct(new HashMap<String,Double>());
          Product cp = new ClothingProduct(new HashMap<String,Double>());
          Product bp = new BookProduct(new HashMap<String,Double>());

          System.out.println(ep.getDescription());
          System.out.println("enter the electronics product name:");
          String temp = sc.next();
          System.out.println("The price of the "+temp+" is "+ep.getPrice(temp));

          System.out.println(cp.getDescription());
          System.out.println("enter the clothing product name:");
          temp = sc.next();
          System.out.println("The price of the "+temp+" is "+cp.getPrice(temp));

          System.out.println(bp.getDescription());
          System.out.println("enter the book product name:");
          temp = sc.next();
          System.out.println("The price of the "+temp+" is "+bp.getPrice(temp));
          sc.close();
     }
}
