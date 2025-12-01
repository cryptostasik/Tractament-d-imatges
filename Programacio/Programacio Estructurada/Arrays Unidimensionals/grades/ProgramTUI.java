/*
 * ProgramTUI.java 1.0 17/11/2025
 *
 * exercicii37
 *
 * Llegeix una seqüència de notes obtingudes per un grup d’alumnes acabada en -1 i escriu quants alumnes han obtingut 
 * les qualificacions MD, I, S,B, N, E. La correspondència entre notes i qualificacions és: MD=[0, 3) I=[3, 5) S=[5, 6) B=[6, 7) N=[7, 9) Ex=[9, 10]
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class ProgramTUI {
	/**
     * 
     * Cada alumne d'una classe té un codi incremental començant pel número 
     * 1. Fer un programa que demani la nota dels alumnes d'una classe per ordre de codi 
     * i posteriorment mostri els codis dels alumnes de la classe que han tret insuficient,
     *  un aprovat, un bé, un notable i un excel.lent. Els intervals per calcular la nota són:
     * 
     * [0,5) Insuficient 
     * [5,6) Aprovat
     * [6,7) Bé
     * [7,9) Notable
     * [9,10] Excel.lent
     * 
     * S'ha de tenir en compte que una classe té 35 alumnes
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int i = 0, a = 0, b = 0, n = 0, ex = 0;
        int first = 0, rec = 0;
		for (i = 0; i < num.length; i++) {
			first = num[i];
			for ()
			if (first < 5) {
				i++;
			} else if (first < 6) {
				s++;
			} else if (first < 7) {
				b++;
			} else if (first < 9) {
				n++;
			} else {
				ex++;
			}
		}
		
		double[] num = {4.9, 10.0, 3.9, 6.1, 7.0, 6.5, 8.7, 5.4};
        Program p = new Program();
        int[] result = p.join(num);
        System.out.println("\n--- RESULTS ---");
        System.out.printf("I = %d ,S = %d ,B = %d ,N = %d ,Ex = %d",i,a,b,n,ex);
    }
}
