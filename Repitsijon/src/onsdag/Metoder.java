package onsdag;

import java.util.List;

public class Metoder {

	public static String land(String kode) {
		if (kode.startsWith("57")) {
			return "Danmark";
		}
		if (kode.startsWith("73")) {
			return "Sverige";
		}
		if (kode.startsWith("64")) {
			return "Finland";
		}
		if (kode.startsWith("70")) {
			return "Norge";
		}
		if (kode.startsWith("569")) {
			return "Island";
		}
		return "utenForNorden";
	}

	public static boolean lovligkode(String kode) {
		if (!(kode.length() == 13)) {
			return false;
		}
		int kontroll = Character.digit(kode.charAt(kode.length() - 1), 10);
		int jevn = 0;
		int odde = 0;

		for (int i = 0; i < kode.length() - 1; i += 2) {
			jevn += Character.digit(kode.charAt(i), 10);
			odde += Character.digit(kode.charAt(i + 1), 10);
		}

		int sum = jevn + odde * 3 + kontroll;
		return (sum % 10) == 0;

	}

	public static boolean alleLovlig(List<String> koder) {
		for (String k : koder) {
			if (!lovligkode(k)) {
				return false;
			}
		}
		return false;
	}

}
