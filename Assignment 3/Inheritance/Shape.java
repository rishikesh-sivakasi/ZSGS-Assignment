package Inheritance;

public abstract class Shape {
    private double dimension1;
    private double dimension2;
    
    Shape(double d1) {
        dimension1 = d1;
        dimension2 = 0;
    }

    Shape(double d1, double d2) {
        dimension1 = d1;
        dimension2 = d2;
    }

    public double getDimension1() {
        return dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }

    public abstract void area();
}

class Rectangle extends Shape {
    Rectangle(double l, double b) {
        super(l, b);
    }

    public void area() {
        System.out.println("Area of the Rectangle: " + getDimension1() * getDimension2());
    }
}

class Circle extends Shape {
    Circle(double r) {
        super(r);
    }

    public void area() {
        System.out.println("Area of the Circle: " + (3.14 * getDimension1() * getDimension1()));
    }
}

class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(8, 2);
        r.area();

        Shape c = new Circle(5);
        c.area();
    }
}
