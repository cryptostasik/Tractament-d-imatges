public class Program4 {
    public static void main(String[] args) {
        int count = 1; 

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 90; j++) {
                System.out.printf("%4d", count);
                count++;
                if (j < 90) {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }
}
