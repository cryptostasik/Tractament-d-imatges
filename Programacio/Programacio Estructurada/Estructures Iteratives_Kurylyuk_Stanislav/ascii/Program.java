/*
 * Program.java 1.0 29/10/25
 *
 * exercicii4
 *
 * Escriu la seqüència ascendent dels codis i caràcters del codi ASCII estès
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program{
    public static void writeASCII(int n1, int n2) {
		int i;
		for (i = n1; i <= n2; i++) {
			System.out.printf("%d -- &c \n", i, (char)i);
		}
	}
    public static void main(String[] args) {
		Program p = new Program();
        p.writeASCII(1,157); // call the method
    }
}
