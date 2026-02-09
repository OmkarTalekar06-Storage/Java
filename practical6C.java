class Parent{
    void average(int a, int b,int c){
        int avg = (a + b + c) / 3;
        System.out.println("Average from Parent : " + avg);
    }
}

public class practical6C {
    void average(int a,int b, int c){
        double avg = (a + b + c) / 3;
        System.out.println("Average from Child : " + avg);
    }    
    
    public static void main(String[] args) {
        practical6C obj = new practical6C();
        obj.average(5, 7, 9);
    }
}
