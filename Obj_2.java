class Pen {
    String color;
    String type;

    public void printColor() {
    System.out.println(this.color);
    }
}

public class Obj_2 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "pointer";

        pen1.printColor();
        pen2.printColor();
    }
}