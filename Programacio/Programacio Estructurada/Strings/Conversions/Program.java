/*
 * ProgramTUI 1.0.java exercic 16/1/26
 *
 *
 * Copyright 2026 Kurylyuk Stanislav
 */

public class Program {
	// 1
    //public int stringToInt(String s) {
    //   return Integer.parseInt(s);
    //}
    //public static void main(String[] args) {
    //    Program p = new Program();
    //    int i;
    //    i = p.stringToInt("3");     
    //    System.out.println(i);       
    //}
    public int stringToInt(String s) {
        return Integer.parseInt(s);
    }
    
    public String intToString(int i) {
        return String.valueOf(i);
    }
    
    public boolean isLetter(char c) {
        return Character.isLetter(c);
    }
    
    public double stringToDouble(String s) {
        return Double.parseDouble(s);
    }
    
    public String doubleToString(double d) {
        return String.valueOf(d);
    }
   
    public char caracterMajuscula(char c) {
        return Character.toUpperCase(c);
    }
    
    public static void main(String[] args) {
        Program p = new Program();
        
        int i;
        double d;
        char c;
        
        i = p.stringToInt("3");
        System.out.println("i = " + i);
        
        System.out.println(p.intToString(34));
        
        System.out.println(p.isLetter('A'));  // true
        System.out.println(p.isLetter('7'));  // false
        
        d = p.stringToDouble("3.14");
        System.out.println("d = " + d);
        
        System.out.println(p.doubleToString(2.5));
        
        c = 'a';
        c = p.caracterMajuscula(c);
        System.out.println("c = " + c); 
    }
}
