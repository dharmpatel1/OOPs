class A {
    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum of two Numbers: " + c);
    }

    void Sub() {
        a = 200;
        b = 100;
        c = a - b;
        System.out.println("Subtraction of two Numbers: " + c);
    }
}

class B extends A {
    void multi() {
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Multiplication of two Numbers: " + c);
    }

    void div() {
        a = 200;
        b = 100;
        c = a / b;
        System.out.println("Division of two Numbers: " + c);
    }
}

class C extends B {
    void rem() {
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("Remainder of two Numbers: " + c);
    }
}

class Multilevel_Inheritance_7 {
    public static void main(String[] args) {
        C r = new C();

        r.add();
        r.Sub();
        r.multi();
        r.div();
        r.rem();

    }
}