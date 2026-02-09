class practical6A{
    int length;
    int width;
    int height;

    public practical6A(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume(){
        return length * width * height;
    }
    public static void main(String[] args) {
        practical6A b = new practical6A(5, 4, 3);
        System.out.println("Volume of Box is : "+ b.volume());
    }    
}