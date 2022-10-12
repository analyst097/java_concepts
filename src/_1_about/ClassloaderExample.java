package _1_about;

public class ClassloaderExample {
    public static void main(String[] args) {
        Class c = ClassloaderExample.class;
        System.out.println(c.getClassLoader());

        Class s = String.class;
        System.out.println(s.getClassLoader());
    }
}
