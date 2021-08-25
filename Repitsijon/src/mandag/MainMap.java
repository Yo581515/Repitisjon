package mandag;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMap {
	public static void main(String[] args) {
		String listeAvOrd[] = { "er", "det", "alle", "er", "det", "det" };
		Map<String, Integer> frekvens = new HashMap<>();

		
		
		for (String ord : listeAvOrd) {
			if (frekvens.containsKey(ord)) {
				int nyFrekvens = frekvens.get(ord) + 1;
				frekvens.put(ord, nyFrekvens);
			}else {
				frekvens.put(ord, 1);
			}
		}
		
		
		String innlestOrd="det";
		Integer f= frekvens.get(innlestOrd);
		if(f==null) {
			System.out.println(innlestOrd+" har frekvens = "+0);
		}else {
			System.out.println(innlestOrd+" har frekvens = "+f);
		}
		
		System.out.println();
		
		Set<String> nokler = frekvens.keySet();
		for(String s: nokler) {
			System.out.println(s+" : "+frekvens.get(s));
		}
		
		System.out.println();
		
		System.out.println(frekvens);
		
		System.out.println();

	}

}
