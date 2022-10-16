package _2_object_class;

public class StaticExamples {
    public static void main(String[] args) {
        Student s = new Student(123, "Aditya Sahu");
        s.printVal();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}


class Student {
    long id;
    String name;
    static String collegeName = "IIIT";

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    void printVal() {
        System.out.println(collegeName + " " + name + " " + id);
    }
}

class Counter {
    static int count = 0;

    static void increment(){
        count++;
    }

    public Counter() {
        increment();
        System.out.println(count);
    }
}