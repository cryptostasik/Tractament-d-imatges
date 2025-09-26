public class Program2 {
  public  double add(double a, double b) {
      double c;
      c = a + b;
      return c;
  }
  public static void main (String[] args) {
      double a, b, suma;
      a = -3.0;
      b = 1.5;
      Program2 p = new Program2(); 
      suma = p.add(a, b);
      System.out.print("Suma = " + suma); 
  }
}
