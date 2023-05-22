class A {
    // int a = 10;
    void show() {
        System.out.println("Hello Gujarat");
    }
}

class B extends A {
    // int a = 20;

    void show() {
        // System.out.println(a);
        // System.out.println(super.a);
        super.show();
        System.out.println("Hello Ahmedabad");
    }
}

public class Super_Keyword_8 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }

}
