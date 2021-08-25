package onsdag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		// alle lovlige kode
		String koder[] = { "7033330013290", "7035620032042", "7310070005007", "7046110002094" };

		for (String k : koder) {
			System.out.print(Metoder.lovligkode(k) + "  ");
		}

		Vare vareKoder[] = { new Vare("7033330013290", "bremykt", 35.50), new Vare("7035620032042", "rekesalat", 25.00),
				new Vare("7310070005007", "ramsola", 6.50), new Vare("7046110002094", "zalo", 21.50) };

		Map<String, Vare> prisliste = new HashMap<>();
		for (Vare v : vareKoder) {
			prisliste.put(v.getNamn(), v);
		}
		System.out.println();
		System.out.println(prisliste);
		System.out.println();

		List<String> handleliste = new ArrayList<>();
		handleliste.add("ramsola");
		handleliste.add("ramsola");
		handleliste.add("bremykt");

		kassalap(handleliste, prisliste);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------");

		EnkelListe<Integer> liste = new EnkelListe<>();
		liste.leggTilForst(9);
		liste.leggTilForst(7);
		liste.leggTilForst(1);
		liste.leggTilForst(3);
		liste.leggTilForst(5);

		liste.skriv();
		liste.snu();
		liste.skriv();
		System.out.println("Ferdig");

	}

	static void kassalap(List<String> handleliste, Map<String, Vare> prisliste) {
		double sum = 0.0;
		Set<String> land = new HashSet<>();

		for (String s : handleliste) {
			Vare v = prisliste.get(s);
			System.out.println(v + " land = " + Metoder.land(v.getStrekkode()));
			sum += v.getPris();
			land.add(Metoder.land(v.getStrekkode()));
		}
		System.out.println("Total sum = " + sum);
		System.out.println(land);

	}

}
