package tirsdag;

import java.util.ArrayList;
import java.util.List;

public class MainFigur {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		Figur rektangel = new Rektangel(a, b);
//		System.out.println(a + " * " + b + " = " + rektangel.areal());
//		rektangel.tegn();

		Figur trekant = new Trekant(a);
//		System.out.println("Arealet til trekanten med sidelengde " + a + " = " + trekant.areal());
//		trekant.tegn();

		List<Figur> figurer = new ArrayList<>();
		figurer.add(rektangel);
		figurer.add(trekant);

		double arealSum = 0.0;
		for (Figur f : figurer) {
			f.tegn();
			System.out.println(f.areal());
			arealSum += f.areal();
			System.out.println("\n");
		}
		System.out.println("+---------\nareal summen = " + arealSum);

	}

}
