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
		String[] g1 = { "Anne", "Bjorn", "Edvard", "Fiona", "A", "BC", "DEF", "GHIJKL", "MNOPQRS", "UVWXYZab" };
		Facebook gr1 = new Facebook("DAT102", g1);
		System.out.println(gr1.leggTilVenner("Anne", "Bjorn"));

		System.out.println(gr1.g.getNavn()[0]);

		gr1.leggTilVenner("Anne", "Bjorn");
		gr1.leggTilVenner("Anne", "Edvard");
		gr1.leggTilVenner("Edvard", "Fiona");
		gr1.leggTilVenner("Bjorn", "Fiona");
		gr1.leggTilVenner("A", "Bjorn");
		gr1.leggTilVenner("A", "Edvard");
		gr1.leggTilVenner("A", "Fiona");
		gr1.leggTilVenner("Anne", "DEF");
		System.out.println();
		gr1.printUtF();
		System.out.println();

		System.out.println();
		System.out.println("antall kanter: " + gr1.g.getAntallKanter());
		System.out.println();
		System.out.println("liste av noder = " + gr1.g.alleNoder());
		System.out.println();
		System.out.println("Er Anne og Bjorn venner ? " + gr1.erVenner("Anne", "Bjorn"));
		System.out.println("Er Anne og Edvard venner ? " + gr1.erVenner("A", "Bjorn"));
		System.out.println();
		System.out.println("Venner til Anne er " + gr1.g.getNaboer("A"));
		System.out.println("Venner til A er " + gr1.g.getNaboer("Anne"));
		System.out.println();
		gr1.visGraf();
		System.out.println();
		System.out.println(gr1.erVenner("Bjorn", "A"));
		System.out.println(gr1.erVenner("Bjorn", "Anne"));
		System.out.println(gr1.erVenner("A", "Bjorn"));
		System.out.println(gr1.erVenner("Anne", "Bjorn"));
		System.out.println("antallfelles venner Anne og A = " + gr1.antalFellesVenner("A", "Bjorn"));
	}
}
