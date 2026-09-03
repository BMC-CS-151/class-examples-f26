public class Circle {
    static double PI = 3.14159;   // same value for every circle
    double radius;                // each circle has its own

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return PI * radius * radius;
    }

    public static void printShapeName() {
        System.out.println("CIRCLE");
    }

    public static void main(String[] args) {
        Circle c = new Circle(10);	
        System.out.println(c.area());
        System.out.println(Circle.PI);
        Circle.printShapeName();
    }
}
