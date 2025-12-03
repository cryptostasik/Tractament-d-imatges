/*
 * ProgramTUI.java 1.0 17/11/2025
 *
 * exerciciv13
 *
 * Cada alumne d'una classe té un codi incremental començant pel número 1. 
 * Fer un programa que demani la nota dels alumnes d'una classe per ordre de codi 
 * i posteriorment mostri els codis dels alumnes de la classe que han tret insuficient, 
 * un aprovat, un bé, un notable i un excel.lent. Els intervals per calcular la nota són:
 * [0,5) Insuficient,[5,6) ,Aprovat[6,7), Bé[7,9), Notable,[9,10]
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
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
		double[] notes = {4.9, 10.0, 3.9, 6.1, 7.0, 6.5, 8.7, 5.4};
		
		int[] insuficient = new int[notes.length];
		int[] aprovat = new int[notes.length];
		int[] be = new int[notes.length];
		int[] notable = new int[notes.length];
		int[] excellent = new int[notes.length];
		
        int in = 0, a = 0, b = 0, n = 0, ex = 0;
        
		for (int i = 0; i < notes.length; i++) {
			double nota = notes[i];
			int second_nota = i + 1; 
			if ((nota >= 0.0) && (nota < 5.0)) {
				insuficient[in++] = second_nota;
			} else if ((nota >= 5.0) && (nota < 6.0)) {
				aprovat[a++] = second_nota;
			} else if ((nota >= 6.0) && (nota < 7.0)) {
				be[b++] = second_nota;
			} else if ((nota >= 7.0) && (nota < 9.0)) {
				notable[n++] = second_nota;
			} else {
				excellent[ex++] = second_nota;
			}
		}
        System.out.println("--- RESULTS ---");
        System.out.printf("\nInsuficient :" + Arrays.toString(insuficient));
        System.out.printf("\nAprovat :" + Arrays.toString(aprovat));
        System.out.printf("\nBé :" + Arrays.toString(be));
        System.out.printf("\nNotable :" + Arrays.toString(notable));
        System.out.printf("\nExcellent :" + Arrays.toString(excellent));
        System.out.printf("\nI = %d ,S = %d ,B = %d ,N = %d ,Ex = %d",in,a,b,n,ex);
    }
}
