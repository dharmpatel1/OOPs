class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ParaConstructor_4 {
    public static void main(String args[]) {
        Student s1 = new Student("Dharm", 21);
         
        s1.printInfo();
    }
}