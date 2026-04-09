package Contracts;

public class Contract_TUI {

    public static void main(String[] args) {
        // EMPRESAS
        Company company1 = new Company(1, "Empresa1", "IT");
        Company company2 = new Company(2, "Empresa2", "FINANCE");

        // PERSONA
        Person person = new Person(1234, "Juan");

        // CONTRATO 1 (Empresa1)
        Contract contract1 = new Contract(100, "01/01/2024", "01/01/2025");
        contract1.setCompany(company1);

        if (person.signContract(contract1)) {
            System.out.println("Contrato 1 firmado OK (Empresa1)");
        } else {
            System.out.println("Contrato 1 NO firmado (ERROR inesperado)");
        }

        // CONTRATO 2 (Empresa2)
        Contract contract2 = new Contract(200, "01/02/2025", "01/02/2026");
        contract2.setCompany(company2);

        if (person.signContract(contract2)) {
            System.out.println("Contrato 2 firmado OK (Empresa2)");
        } else {
            System.out.println("Contrato 2 NO firmado (ERROR inesperado)");
        }

        // CONTRATO 3 (Empresa1)
        Contract contract3 = new Contract(300, "01/06/2024", "01/12/2024");
        contract3.setCompany(company1);

        if (person.signContract(contract3)) {
            System.out.println("Contrato 3 firmado (ERROR, no debería firmarse)");
        } else {
            System.out.println("Contrato 3 NO firmado (Correcto, solapado misma empresa)");
        }

        System.out.println("\nDías trabajados: " + person.workedTime());
        System.out.println("Número de empresas: " + person.nCompanies());
    }
}