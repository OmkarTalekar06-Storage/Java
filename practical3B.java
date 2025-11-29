
import java.util.Scanner;


class Circle{
    double radius;
    
    void getArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
    }

    void getPerimeter(){
        double peri = 2 * 3.14 * radius;
        System.out.println("Perimeter = " + peri);
    }
}

class  practical3B{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radiu of the circle : ");
        c1.radius = sc.nextDouble();

        c1.getArea();
        c1.getPerimeter();
    }
}