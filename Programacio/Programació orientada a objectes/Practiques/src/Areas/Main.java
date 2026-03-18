/*
 * Areas  16/03/2026

 * 
 * Copyright 2026 Kurylyuk Stanislav <a253022sk@correu.escoladeltreball.org>
 *
 * Descripció de l'aplicació
 * 
 * Volem modelar els espais físics d'un centre escolar.
 * La informació rellevant relativa a tots els espais és:
 * 
 * El codi identificador.
 * 
 * La superfície en m².
 * Si disposa de llum natural o no.
 * El consum elèctric, en Kwh.
 * 
 * La informació rellevant dels despatxos és:
 * 
 * El nombre de taules.
 * Si disposa de màquina de cafè.
 * 
 * La informació rellevant de les aules és:
 * 
 * L'aforament màxim.
 * Si disposen o no de cadires de pala.
 * El nombre d'ordinadors.
 * Si disposen o no de connectors de xarxa.
 * 
 * La informació rellevant dels laboratoris és:
 * 
 * El nombre d'encenedors Bunsen (per escalfar i esterilitzar mostres)
 * 
 * La informació rellevant de les aules d'informàtica és:
 * El nombre d'impressores.
 * 
 * La informació rellevant dels gimnasos és:
 * 
 * Si té dutxes o no.
 * El nombre de grades.
 * 
 * A partir de les dades anteriors, volem efectuar les operacions següents:
 * 
 * Calcular el consum per metre quadrat de qualsevol espai.
 * Calcular l'espai en metres quadrats per estudiant a les aules, tenint present que per als gimnasos hem de tenir en compte les grades (cada grada equival a 1m²).
 */

package Areas;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		Office office = new Office("Oficina 52", 40, true, 600);
		office.setCoffeeMachine(true);

		Laboratory lab = new Laboratory("Laboratori 12", 75, true, 1320, 20);
		lab.setnBunsen(12);

		Computing comp = new Computing("Informatica 1", 75, true, 9999, 15);
		comp.setnPrinters(3);

		Gym gym = new Gym("Gimnas_exe", 500, true, 320, 200);
		gym.setnStands(2000);
		gym.setShowers(true);
		
		HashSet<Area> areas = new HashSet<Area>();
		areas.add(office);
		areas.add(lab);
		areas.add(comp);
		areas.add(gym);
		
		double totalConsumption = 0;		
		System.out.println("Consum elèctric");
		System.out.println("---------------------------------");
		for (Area a : areas) {
			System.out.println("L'espai " + a.getCode() + 
				" consumeix: " + a.consumptionM2() + " W/m2");
			totalConsumption += a.getConsumption();
		}
		System.out.println("El consum total de l'institut és de: " + totalConsumption + " W");


		System.out.println("\nSuperfície per estudiant");
		System.out.println("---------------------------------");
		for (Area a : areas) {
			if (a instanceof Classroom) {
				Classroom c = (Classroom) a;
				System.out.println("L'Aula " + c.getCode() + 
					" disposa de: " + c.surfaceAreaStudent() + " m2 per estudiant");
			}
		}
	}
}