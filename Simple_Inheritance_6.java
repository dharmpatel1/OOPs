class Student {      //Super class
    int roll, marks;
    String name;

    void input() {
        System.out.println("Enter Roll, Name & Marks: ");
    }
}

class Dharm extends Student {       //Sub class
    void disp() {
        roll = 1;
        name = "Dharm";
        marks = 90;
        System.out.println(roll + ", " + name + " & " + marks);
    }
}

public class Simple_Inheritance_6 {
    public static void main(String args[]) {
        Dharm d = new Dharm();
        d.input();
        d.disp();
    }
}