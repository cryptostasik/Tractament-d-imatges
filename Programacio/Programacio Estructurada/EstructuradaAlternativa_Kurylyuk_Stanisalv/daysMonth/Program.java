/*
 * exercici45.java 1.0 13/10/25
 *
 * A partir del mes i l'any d'una data, esbrina el nombre de dies que té el mes d'aquest any.
 * 
 */
import java.util.Scanner;

public class Program {
    /**
     * 
     * 
     * @param 
     * @return
     */
     public static int getNumberOfDays(int year,int days_month   ) {
        if (month.equals("February")) {
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
				return days_month = 29;			
				} else {
				return days_month = 28;
				}
		} else if (month.equals("January") ||
				   month.equals("March") ||
				   month.equals("May") ||
				   month.equals("July") ||
				   month.equals("August") ||
				   month.equals("October") ||
				   month.equals("December")){
			return days_month = 31;
		} else if (month.equals("April") ||
				   month.equals("June") ||
				   month.equals("September") ||
				   month.equals("November")){
			return days_month = 30;
		}else {
            return "Mida no vàlida";
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double size;

        System.out.println("Introduïu el cm de cargol: ");
        size = s.nextDouble();

        // Find the size
        String result = screwSize(size);
        
        System.out.printf("La mida del cargol de %.2f cm és: %s\n", size, result);

        s.close();
    }
}

