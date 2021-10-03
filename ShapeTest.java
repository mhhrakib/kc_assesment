abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();
}


class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle...");
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}


public class ShapeTest {
    public static void shapeDetail(Shape shape){
        shape.draw();
        System.out.println("Shape Name: " + shape.getName());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
        System.out.println("Shape area: " + shape.getArea());

    }

    public static void main(String[] args) {
      Shape circle = new Circle(5.0);
      Shape rectangle = new Rectangle(5.0, 3.0);
      shapeDetail(circle);
      shapeDetail(rectangle);
    }
}

/*
Drawing a circle...
Shape Name: Circle
Shape perimeter: 31.41592653589793
Shape area: 78.53981633974483
Drawing a rectangle...
Shape Name: Rectangle
Shape perimeter: 16.0
Shape area: 15.0
*/
