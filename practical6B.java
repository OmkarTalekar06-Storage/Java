public class practical6B {
    void avg(int a, int b, int c){
        int result = (a + b + c) / 3;
        System.out.println("Average (integer) : " + result);
    }

    void  avg(double a, double b, double c){
        double result = (a + b + c) / 3;
        System.out.println("Average (Double) : " + result);
    }

    public static void main(String[] args) {
        practical6B obj = new practical6B();
        obj.avg(6, 9, 3);
        obj.avg(5.5, 7.2, 6.3);
    }
}
