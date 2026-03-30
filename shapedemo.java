class Shape {
    String name;
    Shape(String name) {
        this.name = name;
    }
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }
    //@Override
    double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    //@Override
    double area() {
        return Math.PI * radius * radius;
    }
}
public class shapedemo {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 3);
        Shape c = new Circle(4);
        System.out.println(r.name + " Area: " + r.area());
        System.out.println(c.name + " Area: " + c.area());
    }
}