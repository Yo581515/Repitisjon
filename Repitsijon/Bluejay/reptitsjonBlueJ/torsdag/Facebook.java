package torsdag;

import java.util.List;

public class Facebook {
	private String gruppeNavn;
	public Graf g;

	public Facebook(String navnPaaGruppe, String[] navn) {
		this.gruppeNavn = navnPaaGruppe;
		this.g = new Nabomatrise(navn);
	}

	boolean leggTilVenner(String p1, String p2) {
		return g.leggTilKant(p1, p2);
	}

	boolean erVenner(String p1, String p2) {
		return g.erNaboer(p1, p2);

	}

	boolean ikkeVenner(String p1, String p2) {
		return g.fjern(p1, p2);

	}

	int antalFellesVenner(String p1, String p2) {
		int ant = 0;
		List<String> listeP1 = g.getNaboer(p1);
		List<String> listeP2 = g.getNaboer(p2);
		for (String v : listeP1) {
			if (listeP2.contains(v)) {
				ant++;
			}
		}
		return ant;
//		List<String> fellesVenner = g.getNaboer(p1);
//		fellesVenner.retainAll(g.getNaboer(p2));
//		return fellesVenner.size();

	}

	void visGraf1() {
		System.out.print("Facebookgrafen for Deler av " + gruppeNavn + "\n" + "Antal personer i gruppen = "
				+ g.getAntallNoder() + "\nantall vennskap = " + g.getAntallKanter() + "\n");
		for (int i = 0; i < g.getNavn().length; i++) {

			List<String> liste = g.getNaboer(g.getNavn()[i]);

			System.out.print(g.getNavn()[i] + ": ");

			for (String a : liste) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	void visGraf() {
		System.out.print("Facebookgrafen for Deler av " + gruppeNavn + "\n" + "Antal personer i gruppen = "
				+ g.getAntallNoder() + "\nantall vennskap = " + g.getAntallKanter() + "\n");

		for (String bruker : g.alleNoder()) {
			System.out.println(bruker + ": " + g.getNaboer(bruker));
		}
	}

	public void printUtF() {
		g.printUt();
	}

}
