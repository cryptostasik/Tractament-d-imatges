package contacts;

public class ContactTUI {
    public static void main(String[] args) {
        Contact anna = new Contact(12345678, "Anna Puig", "655 112 233");
        Contact pere = new Contact(87654321, "Pere Soler", "644 987 654");
        Contact maria = new Contact(11223344, "Maria López", "677 445 566");

        // Afegim contactes
        anna.add(pere);
        anna.add(maria);
        pere.add(anna);           // mutu
        pere.add(maria);

        // No es pot afegir a si mateix
        anna.add(anna);           // → no s'afegirà

        // Llistem
        System.out.println("Contactes d'Anna:");
        anna.listContacts();

        System.out.println("\nContactes de Pere:");
        pere.listContacts();

        // Busquem dins d'Anna
        Contact trobat = anna.search(11223344);
        if (trobat != null) {
            System.out.println("\nTrobat: " + trobat.getName());
        }

        // Eliminem un contacte
        
        System.out.println("\nDesprés d'eliminar Maria:");
        anna.listContacts();

        // Esborrem tots
        pere.removeAll();
        System.out.println("\nContactes de Pere després de removeAll:");
        pere.listContacts();
    }
}
