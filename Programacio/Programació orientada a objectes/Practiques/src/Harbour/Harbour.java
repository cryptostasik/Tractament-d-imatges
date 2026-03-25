package Harbour;

import java.util.ArrayList;

public class Harbour {
    private String city;
    private String country;
    private ArrayList<Rent> rents = new ArrayList<>();

    public Harbour(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public boolean add(Rent r) {
        return rents.add(r);
    }

    public double calculateAmountMonth(int month, int year) {
        double total = 0.0;
        for (Rent r : rents) {
            total += r.amount();
        }
        return total;
    }

    public void reportRents(String pathReport) {
        System.out.println("=== REPORT HARBOUR " + city + " (" + country + ") ===");
        for (Rent r : rents) {
            System.out.printf("DNI: %s | Client: %s | Vaixell: %s | Dies: %d | Import: %.2f€%n",
                    r.getDni(), r.getName(), r.getBoat().getRegPlate(),
                    r.days(), r.amount());
        }
        System.out.println("=====================================");
    }

    @Override
    public String toString() {
        return "Harbour " + city + ", " + country + " | Lloguers: " + rents.size();
    }
}