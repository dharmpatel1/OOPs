class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor called");
    }
}

public class NonParaCon_3 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Dharm";
        s1.age = 21;
         
        s1.printInfo();
    }
}