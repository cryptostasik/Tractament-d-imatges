public class Program {
  public  int add(int a, int b) {
      int c;
      c = a + b;
      return c;
  }
  public static void main (String[] args) {
      int a, b, suma;
      a = 2;
      b = 3;
      Program p = new Program(); 
      suma = p.add(a, b);
      System.out.print("Suma = " + suma); 
  }
}
