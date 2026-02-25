package surgery;

import java.util.Scanner;
import java.util.ArrayList;

public class SurgeryTUI {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String nomMetge = "Dr. Pere";
        
        ArrayList<String> ocupat = new ArrayList<>();
        
        ocupat.add("15/03/2025-14:30");
        ocupat.add("15/03/2025-15:00");
        ocupat.add("16/03/2025-09:15");
        
        System.out.println("Sistema de cites per al cirurgià");
        System.out.println("Metge: " + nomMetge);
        
        while (true) {
            System.out.print("Data i hora (per exemple 15/03/2025-14:30): ");
            String dataHora = s.nextLine();
            
            System.out.print("Nom i cognoms del pacient: ");
            String pacient = s.nextLine();
            
            boolean lliure = !ocupat.contains(dataHora);
            
            if (lliure) {
                System.out.println("D'acord! Reservat per " + dataHora + " + " + pacient);
                ocupat.add(dataHora);
            } else {
                System.out.println("Malauradament, aquesta hora ja està ocupada ");
            }
        }
    }
}