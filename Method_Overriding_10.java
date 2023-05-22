class shape {
    void draw() {
        System.out.println("Can't say shape type");
    }
}

class square extends shape {
    @Override
    void draw() {
        System.out.println("Square shape");
    }
}

public class Method_Overriding_10 {
    public static void main(String[] args) {
        shape r = new square(); // means the reference of the object is super class and method is sub class
        r.draw();
    }
}

// If the method will override, it will call the method of sub class. And If the
// method will not override then it will call the method of super class.
