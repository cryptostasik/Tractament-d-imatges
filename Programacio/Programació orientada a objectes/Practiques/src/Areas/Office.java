package Areas;

public class Office extends Area {

    private int nTables;
    private boolean coffeeMachine;

    public Office() {
    }

    public Office(String code, double surfaceArea, boolean naturalLight, double consumption) {
        super(code, surfaceArea, naturalLight, consumption);
    }

    public int getnTables() {
        return nTables;
    }

    public void setnTables(int nTables) {
        this.nTables = nTables;
    }

    public boolean isCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(boolean coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }
}