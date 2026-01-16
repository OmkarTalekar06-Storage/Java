class Parent {
    private int x = 10;

    void show() {
        System.out.println("Value of x = " + x);
    }
}

class Child extends Parent {
    void display() {
        // System.out.println(x);  // Error: x is private
        System.out.println("Private member cannot be inherited");
    }
}

public class practical5C {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
    }
}
