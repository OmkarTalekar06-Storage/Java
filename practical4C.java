class A{
    int x = 10;

    void showA(){
        System.out.println("Class value = " + x);
    }
}

class B extends A{
    int y = 20;

    void showB(){
        System.out.println("Class value = " + y);
    }
}

class C extends B{
    int z = 30;

    void showC(){
        System.out.println("Class value = " + z);
    }
}

class practical4C{
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
