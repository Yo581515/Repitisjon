package mandag;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainMengder {
	public static void main(String[] args) {
		String[] l1E = { "G", "H", "E", "F", "A" };
		String[] l2E = { "E", "D", "B", "C", "A" };
		Set<String> liste1 = new HashSet<>();
		Set<String> liste2 = new HashSet<>();
		for (String e : l1E) {
			liste1.add(e);
		}
		for (String e : l2E) {
			liste2.add(e);
		}
		System.out.println(liste1);
		System.out.println(liste2);
		System.out.println("\nMed for løkke");
		for (String e : liste1) {
			System.out.print(" " + e + " ");
		}
		System.out.println();
		for (String e : liste2) {
			System.out.print(" " + e + " ");
		}

		System.out.println("\n\nUnion av leste1 og liste 2");
		Set<String> union = new HashSet<>(liste1);
//		Set<String> union = new TreeSet<>(liste1);
//		union.addAll(liste1);
		union.addAll(liste2);
		System.out.println(union);
		for (String e : union) {
			System.out.print(" " + e + " ");
		}

		System.out.println("\n\nSnitt av leste1 og liste 2");
		Set<String> snitt = new HashSet<>(liste1);
		snitt.retainAll(liste2);
		System.out.println(snitt);
		for (String e : snitt) {
			System.out.print(" " + e + " ");
		}

	}

}
