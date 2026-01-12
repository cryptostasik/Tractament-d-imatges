/*
 * Program.java 1.0 12/1/2026
 *
 * exercicis6
 *
 * Donades les dades d'una persona que marxa de viatge (nom, sexe(H/D), telèfon i ciutat on ha marxat),
 * crea la cadena que hauria de dir un contestador automàtic:
 * 
 * Si el sexe és 'H' la cadena serà: “Hola! Sóc el [nom]. Has trucat al [telèfon] i 
 * ara no estic a casa perquè estic a [ciutat] de vacances!!!”
 * 
 * Si el sexe és 'D' la cadena serà: “Hola! Sóc la [nom]. Has trucat al [telèfon] i 
 * ara no estic a casa perquè estic a [ciutat] de vacances!!!
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given the data of a person who is going on a trip (name, sex (M/F), 
     * phone number and city where they have left), create the string 
     * that an automatic answering machine should say:
     * 
     * If the sex is 'M' the string will be: “Hello! I am [name]. 
     * You called [phone number] and I am not at home now because I am in [city] on vacation!!!”
     * 
     * If the sex is 'D' the string will be: “Hello! I am [name].
     * You called [phone number] and I am not at home now because I am in [city] on vacation!!!
     *
     * @param name a string
     * @param sex a char
     * @param tel(telefon) a int
     * @param city a String
     * @return the type the sex and the number telefon.
     */
    public String answerPhone(String name,char sex,String tel,String city) {
		String gender;
		if (sex == 'H') {
			gender = "el";
		} else  {
			gender = "la";
		}
        return "Hola! Sóc " + gender + " " + name + ".Has trucat al " + tel + "i ara no estic a casa perquè estic a " + city +  "de vacances!!!";
	}
    public static void main(String[] args) {
        Program p = new Program();
        
        String name,tel,city;
        char sex;
        
		name = "Stas";
		sex = 'H';
		tel = "9212234434";
		city = "Vinicka";
		
		String missatge = p.answerPhone(name, sex, tel, city);
		
        System.out.println("\nMissatge del contestador automàtic:");
        System.out.println(missatge);
    }
}
