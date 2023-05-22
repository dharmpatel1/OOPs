class A {
    A() {
        System.out.println("Lerner");
    }

    A(int a) {
        this();
        System.out.println(a);
    }
}

public class This_Keyword_9 {
    public static void main(String[] args) {
        A r = new A(100);
    }
}
