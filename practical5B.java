abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    double r = 7;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * 3.14 * r));
    }
}

public class practical5B {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.perimeter();
    }
}
