package torsdag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nabomatrise implements Graf {

	private int n; // Antall noder
	private int m; // antall kanter
	private boolean[][] matrise;
	private Map<String, Integer> nodenavn;
	private String[] navn;

	@Override
	public String[] getNavn() {
		return navn;
	}

	public Nabomatrise(String[] navnPaaNoder) {
		n = navnPaaNoder.length;
		m = 0;
		matrise = new boolean[n][n];
		navn = navnPaaNoder;

		nodenavn = new HashMap<String, Integer>(n);
		// "A"-> 0, "B"-> 1, "C"-> 2, "D"-> 3
		for (int i = 0; i < n; i++) {
			nodenavn.put(navn[i], i);

		}
	}

	/*
	 * Forventer denne utskriften:
	 * 
	 * | A B C D ---+------------ A | . T T . B | T . . . C | T . . . D | . . . .
	 * 
	 * Grafen har 2 kanter.
	 *
	 */
	@Override
	public void printUt() {
		String mellomrom = "";

		for (int i = 0; i < n; i++) {
			String namn = navn[i];
			System.out.print(String.format("%16S", namn));
		}
		System.out.println(
				"\n------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < n; i++) {
			System.out.print(navn[i]);
			for (int j = 0; j < n; j++) {

				switch (navn[i].length()) {
				case 1:
					mellomrom = "              ";
					break;
				case 2:
					mellomrom = "             ";
					;
					break;
				case 3:
					mellomrom = "            ";
					;
					break;
				case 4:
					mellomrom = "           ";
					;
					break;
				case 5:
					mellomrom = "          ";
					;
					break;
				case 6:
					mellomrom = "         ";
					;
					break;
				case 7:
					mellomrom = "        ";
					;
					break;
				case 8:
					mellomrom = "       ";
					;
					break;
				case 9:
					mellomrom = "      ";
					;
					break;
				case 10:
					mellomrom = "     ";
					break;
				default:
					mellomrom = "    ";
					break;
				}

				String s = matrise[i][j] ? "T" : ".";
				if (j == 0) {
					System.out.print(String.format(mellomrom + "%1S", s));
				} else {
					System.out.print(String.format("%16S", s));
				}

//				if (matrise[i][j]) {
//					System.out.print(mellomrom + "T" + mellomrom);
//				} else {
//					System.out.print(mellomrom + "." + mellomrom);
//				}

			}

			System.out.println();
		}
	}

	@Override
	public int getAntallNoder() {

		return n;
	}

	@Override
	public int getAntallKanter() {

		return m;
	}

	@Override
	public List<String> alleNoder() {
//		List<String> liste = new ArrayList<>();
//		for (String v : navn) {
//			liste.add(v);
//		}
//		return liste;
		return Arrays.asList(navn);
	}

	@Override
	public boolean erNaboer(String u, String v) {
		if (!nodenavn.containsKey(u) || !nodenavn.containsKey(v)) {
			return false;
		}
		int iu = nodenavn.get(u);
		int iv = nodenavn.get(v);
		return matrise[iu][iv];
	}

	@Override
	public boolean leggTilNode(String w) {

		if (!nodenavn.containsKey(w)) {
			nodenavn.put(w, n);
			n++;

			String[] nyNavn = new String[n];
			for (int i = 0; i < navn.length; i++) {
				nyNavn[i] = navn[i];
			}
			navn = nyNavn;
			navn[n - 1] = w;

			boolean[][] nyMatrise = new boolean[n][n];
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					nyMatrise[i][j] = matrise[i][j];
				}
			}
			matrise = nyMatrise;

			return true;
		}
		return false;

	}

	@Override
	public boolean leggTilKant(String u, String v) {
		List<String> listen = alleNoder();
		if (((listen.contains(u)) && (listen.contains(v))) && !erNaboer(u, v)) {
			int iu = nodenavn.get(u);
			int iv = nodenavn.get(v);
			matrise[iu][iv] = true;
			matrise[iv][iu] = true;
			m++;
			return true;
		}
		return false;
	}

	@Override
	public boolean leggTilKanter(String w, String[] naboer) {

		for (int i = 0; i < naboer.length; i++) {
			boolean nabo = erNaboer(w, naboer[i]);

			if (nabo) {
				return false;
			}
		}

		for (int i = 0; i < naboer.length; i++) {
			leggTilKant(w, naboer[i]);
		}

		return true;

	}

	@Override
	public boolean fjern(String u, String v) {
		List<String> listen = alleNoder();
		if (((listen.contains(u)) && (listen.contains(v))) && erNaboer(u, v)) {
			int iu = nodenavn.get(u);
			int iv = nodenavn.get(v);
			matrise[iu][iv] = false;
			matrise[iv][iu] = false;
			return true;
		}
		return false;
	}

	@Override
	public List<String> getNaboer(String w) {
		List<String> listen = new ArrayList<>();

		Integer iw = nodenavn.get(w);

		if (!(iw == null)) {
			for (int i = 0; i < n; i++) {
				if (matrise[iw][i]) {
					listen.add(navn[i]);
				}
			}
		}

		return listen;
	}

}
