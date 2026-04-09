package triangle;

public class TriangleTUI {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        System.out.println("t1: " + t1);
        
        Triangle t2 = new Triangle(5.0, 5.0, 6.0);
        System.out.println("t2: " + t2);
        
        Triangle t3 = new Triangle(7.0, 8.0, 9.0);
        System.out.println("t3: " + t3);
    }
}