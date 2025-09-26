public class Program3 {
    public static double average(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = 6.0;
        double suma = Program3.average(a, b, c, d);
        System.out.println(suma);
    }
}
