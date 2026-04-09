package Parking;

public class Parking {
    private int nSpaces;
    private Vehicle[] spaces;

    public Parking(int nSpaces) {
        this.nSpaces = nSpaces;
        this.spaces = new Vehicle[nSpaces];
    }

    public boolean add(Vehicle v, int ns) {
        if (ns >= 1 && ns <= nSpaces) {
            if (spaces[ns - 1] != null) return false;
            spaces[ns - 1] = v;
        }
        return false;
    }


    public Vehicle remove(int ns) {
        Vehicle v = spaces[ns];
        spaces[ns] = null;
        return v;
    }

    public double calculateFee(int ns) {
        return spaces[ns].calculateFee();
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < nSpaces; i++) {
            if (spaces[i] != null) {
                total += spaces[i].calculateFee();
            }
        }
        return total;
    }

    public void reportTotal(String pathReport) {
        System.out.println("Total Vehicle es " + calculateTotal());
    }

    @Override
    public String toString() {
        String result = "Parking:\n";
        for (int i = 0; i < nSpaces; i++) {
            if (spaces[i] != null) {
                result += "[ Plaça " + i + ": " + spaces[i].getRegPlate() + " ]";
            }
        }
        return result;
    }
}

