public class Program4 {
    public static double calculateArea(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }

    public static void main(String[] args) {
        double base = 3.0;
        double height = 1.5; 
        double area;

        area = calculateArea(base, height); 
        System.out.println("Area = " + area);
    }
}