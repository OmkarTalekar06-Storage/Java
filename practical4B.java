class rectangle{
    int length;
    int breadth;

    rectangle(int l,int b) {
        length = l;
        breadth = b;
    }
}

class Area extends rectangle{

    Area(int l, int b) {
        super(l, b);
    }

    void compute(){
        int area = length * breadth;
        System.out.println("Area of rectrangle is = " + area);

    }
    
}

class practical4B{
    public static void main(String[] args){
        Area a = new Area(10, 5);
        a.compute();
    }
}