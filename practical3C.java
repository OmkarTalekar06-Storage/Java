class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}

class practical3C {
    public static void main(String[] args) {
        Student s = new Student("Arjun", 85);
        s.display();
    }
}
