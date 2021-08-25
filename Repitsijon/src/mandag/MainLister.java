package mandag;

import java.util.ArrayList;
import java.util.List;

public class MainLister {

	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<>();
		liste.add(1);
		liste.add(56);
		liste.add(1);
		liste.add(22);
		liste.add(56);

		System.out.println("tall på inteks 4 = " + liste.get(3));
		System.out.println("tall på inteks 5 = " + liste.get(4));
		System.out.println("antall elementer i listen = " + liste.size());
		liste.add(1, 34);
		System.out.println("tall på inteks 2 = " + liste.get(1));
		System.out.println("element " + 34 + "finnes i listen? " + liste.contains(34));
		System.out.println("element " + 3 + "finnes i listen? " + liste.contains(3));

		for (Integer e : liste) {
			System.out.print(" " + e + " ");
		}
		System.out.println("\n" + liste);

		System.out.println("første indeks av element " + 1 + " er " + liste.indexOf(1));
		System.out.println("siste indeks av element " + 1 + " er " + liste.lastIndexOf(1));

		System.out.println("\nFjern alle elementer i listen og sjekk at den er tom!");
		liste.clear();
		System.out.println("liste er tom? " + liste.isEmpty());
	}

}
