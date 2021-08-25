package torsdag;

public class Main {
	public static void main(String[] args) {
		/*
		 * Forventer denne utskriften:
		 * 
		 * | A B C D ---+------------ A | . T T . B | T . . . C | T . . . D | . . . ...
		 * 
		 * Grafen har 2 kanter.
		 *
		 */
		String[] g1 = { "Anne", "Bjorn", "Edvard", "Fiona", "Ole", "Peter", "Yosafe", "Fredrik", "Sven", "Torje" };
		Facebook gr1 = new Facebook("DAT102", g1);
		System.out.println(gr1.leggTilVenner("Anne", "Bjorn"));

		System.out.println(gr1.g.getNavn()[0]);

		gr1.leggTilVenner("Anne", "Bjorn");
		gr1.leggTilVenner("Anne", "Sven");
		gr1.leggTilVenner("Anne", "Edvard");
		gr1.leggTilVenner("Edvard", "Fiona");
		gr1.leggTilVenner("Bjorn", "Fiona");
		gr1.leggTilVenner("Ole", "Bjorn");
		gr1.leggTilVenner("Ole", "Edvard");
		gr1.leggTilVenner("Ole", "Fiona");
		gr1.leggTilVenner("Anne", "Yosafe");
		gr1.leggTilVenner("Ole", "Torje");
		gr1.leggTilVenner("Ole", "Yosafe");
		gr1.leggTilVenner("Torje", "Fredrik");
		gr1.leggTilVenner("Torje", "Sven");
		gr1.leggTilVenner("Torje", "Fiona");
		gr1.leggTilVenner("Yosafe", "Fredrik");
		gr1.leggTilVenner("Torje", "Peter");
		gr1.leggTilVenner("Peter", "Fiona");
		gr1.leggTilVenner("Yosafe", "Peter");
		System.out.println();
		gr1.printUtF();
		System.out.println();

		System.out.println();
		System.out.println("antall kanter : " + gr1.g.getAntallKanter());
		System.out.println();
		System.out.println("liste av noder =  " + gr1.g.alleNoder());
		System.out.println();
		System.out.println("Er Anne og Bjorn venner ? " + gr1.erVenner("Anne", "Bjorn"));
		System.out.println("Er Ole og Bjorn venner ? " + gr1.erVenner("Ole", "Bjorn"));
		System.out.println();
		System.out.println("Venner til Ole er " + gr1.g.getNaboer("Ole"));
		System.out.println("Venner til Anne er " + gr1.g.getNaboer("Anne"));
		System.out.println();
		gr1.visGraf();
		System.out.println();

		System.out.println("antallfelles venner Anne og Ole = " + gr1.antalFellesVenner("Ole", "Anne"));
		System.out.println("\n");
		System.out.println(gr1.maksVenner() + " har flest venner");

	}
}
