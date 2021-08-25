package tirsdag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		List<Student> li = new ArrayList<>();
		li.add(new Student(11, "Arne", "Nilsen"));
		li.add(new Student(13, "Tore", "Hansen"));
		li.add(new Student(1, "Kari", "Nilsen"));
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);

		System.out.println();

		List<NettStudent> nettStudenter = new ArrayList<>();
		nettStudenter.add(new NettStudent(17, "Liv", "Olsen", "Trondheim"));
		nettStudenter.add(new NettStudent(11, "Arne", "Nilsen", "Bergen"));
		nettStudenter.add(new NettStudent(13, "Tore", "Hansen", "Førde"));
		nettStudenter.add(new NettStudent(1, "Kari", "Nilsen", "Bergen"));

		System.out.println(nettStudenter);
		Collections.sort(nettStudenter);
		System.out.println(nettStudenter);
//		Set<String> hjemsteder = new HashSet<>();
		Set<String> hjemsteder = new TreeSet<>();
		for (NettStudent s : nettStudenter) {
			hjemsteder.add(s.getHjemsted());
		}
		System.out.println();
		System.out.println(hjemsteder);

	}

}
