package Ferry;

import java.util.Scanner;

public class FerryTUI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ferry ferry = new Ferry("F-101", "MiniFerry", "Port", 10.0, 50.0, 20000.0);

        System.out.println("Mini gestió ferri " + ferry.getRegNumber());

        String cmd;

        do {
            System.out.println("\nComandes: afegir  llista  pes  peatge  sortir");
            System.out.print("> ");
            cmd = sc.nextLine().trim().toLowerCase();

            switch (cmd) {

                case "afegir":
                    System.out.print("Matrícula: ");
                    String mat = sc.nextLine().trim();

                    System.out.print("Pes (kg): ");
                    double pes = sc.nextDouble();

                    System.out.print("Eixos: ");
                    int eixos = sc.nextInt();
                    sc.nextLine(); // netejar buffer

                    Lorry l = new Lorry(mat, pes, eixos);

                    System.out.println(ferry.board(l) ?
                            "Afegit OK" : "No s'ha pogut afegir");
                    break;

                case "llista":
                    System.out.println("Camions al ferri: "
                            + ferry.getBoardedLorries().size());

                    for (Lorry c : ferry.getBoardedLorries())
                        System.out.println(c.getRegNumber()
                                + "  " + c.getWeight() + " kg");
                    break;

                case "pes":
                    System.out.println("Pes actual: "
                            + ferry.totalWeight()
                            + " / " + ferry.maxWeight + " kg");
                    break;

                case "peatge":
                    System.out.println("Peatges recaptats: "
                            + ferry.collectedTolls() + " €");
                    break;

                case "sortir":
                    System.out.println("Adéu!");
                    break;

                default:
                    System.out.println("Comanda incorrecta");
            }

        } while (!cmd.equals("sortir"));
    }
}