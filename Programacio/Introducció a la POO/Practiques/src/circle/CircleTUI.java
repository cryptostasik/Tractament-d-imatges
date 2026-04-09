package circle;

public class CircleTUI {
    
    public static void main(String[] args) { 
    	Circle c1 = new Circle(5.0);
    	Circle c2 = new Circle(7.0);
    	System.out.println("Circle 1 " + c1.toString());
    	System.out.println("Circle 2 " + c2.toString());
    	
        if (c1.isGreat(c2)) {
            System.out.println("Circle 1 mas grande");
        } else {
            System.out.println("Circle 2 mes grande");
        }
        
        // System.out.println(c1.isGreat(c2));
        // System.out.println(c1.theGreatest(c2));
    }
}