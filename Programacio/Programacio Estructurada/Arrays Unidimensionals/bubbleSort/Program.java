import java.util.Arrays;
public class Program {
    public void bubbleSort(double[] a) {
        double aux;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        double[] a = {7.0, 4.0, 6.0, 8.0, 9.0};
        Program p = new Program();
        p.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
