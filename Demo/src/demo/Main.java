package demo;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.getArea()); // Inherits getArea() from Rectangle
        System.out.println("Square Perimeter: " + square.getPerimeter()); // Inherits getPerimeter() from Rectangle
    }
}