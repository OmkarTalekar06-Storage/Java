class practical2B{
    public static void main(String[] args) {
        int  a = 5;
        int  b = 25;
        int  c = 10;
  
        int big = (a > b) ? (a > c ? a : c ) : (b > c ? b : c);

        System.out.println(big +" is the biggest number");
    }
}