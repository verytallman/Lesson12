package Lesson12;

public class StaticfieldA {
    public static void main(String[] args) {
        A a1 = new A();
        a1.age = 23;

        A a2 = new A();
        a2.age = 33;

        A a3 = new A();
        a3.age = 45;

        a1.name = "qqq";
        a2.name = "www";
        a3.name = "eee";

        System.out.println(a1.age);
        System.out.println(a2.age);
        System.out.println(a3.age);

        System.out.println(a1.name);
        System.out.println(a2.name);
        System.out.println(a3.name);


    }
}
