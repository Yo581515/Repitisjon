package tirsdag;

public class Trekant implements Figur {

	private int sidelengde;

	public Trekant(int sidelengde) {
		this.sidelengde = sidelengde;
	}

	@Override
	public double areal() {
		return sidelengde * sidelengde / 2.0;
	}

	@Override
	public void tegn() {

		int stjerner = 1;
		for (int i = 0; i < sidelengde; i++) {
			for (int j = 0; j < stjerner; j++) {
				System.out.print("*");
			}
			System.out.println();
			stjerner++;
		}
	}

}
