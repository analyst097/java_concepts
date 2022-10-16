package _2_object_class;

public class ThisExamples {

}

//1: refer to current class instance variable
class Empployee {
    int id;
    String name;

    public Empployee(int id, String name) {
        //here if we dont use this then id = id will be assigned and the values wont be correct
        // since the name of args and fields are same we need to use this keyword
        this.id = id;
        this.name = name;
    }
}

//2: invoke method of current class

class A{
    void m(){
        System.out.println("method m invoked");
    }

    void n(){
        System.out.println("method n");
        this.m();
    }
}

//3: invoke current class method -  used to reuse constructor, also for constructor chaining,
// calling default constructor from parameterized and vise versa
class B{
    int x;
    B(){
        System.out.println("default constructor");
    }
    B(int x){
        this();
        this.x = x;
        System.out.println(x);
    }
}

class Student2{
    int id;
    String name;
    String course;
    double fee;

    public Student2(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Student2(int id, String name, String course, double fee) {
        //reuse of one constructor inside another
        this(id, name, course);
        this.fee = fee;
    }
}