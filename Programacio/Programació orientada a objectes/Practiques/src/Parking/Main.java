/*
 * Parking  23/03/2026
 * 
 * Copyright 2026 Kurylyuk Stanislav <a253022sk@correu.escoladeltreball.org>
 *
 */
package Parking;

public class Main {

    public static void main(String[] args) {
        Parking p = new Parking(10);
        Car c1 = new Car("123ABC", 125, 5);
        Car c2 = new Car("123ABD", 125, 5);
        Car c3 = new Car("123ABE", 116, 2);
        Car c4 = new Car("123ABF", 116, 4);
        Motorbike m1 = new Motorbike("321ABC", 125);
        Motorbike m2 = new Motorbike("321ABD", 125);
        p.add(c1, 1);
        p.add(c2, 4);
        p.add(c3, 2);
        p.add(c4, 2);
        p.add(m1, 5);
        p.add(m1, 8);
        p.add(m2, 10); 
        System.out.println(p);
        System.out.println(p.calculateTotal());        
    }
}
