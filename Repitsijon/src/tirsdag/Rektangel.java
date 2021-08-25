package tirsdag;

public class Rektangel implements Figur {

	private int hoyde;
	private int bredde;

	public Rektangel(int hoyde, int bredde) {
		this.hoyde = hoyde;
		this.bredde = bredde;
	}

	@Override
	public double areal() {
		return hoyde * bredde;
	}

	@Override
	public void tegn() {
		for (int i = 0; i < hoyde; i++) {
			for (int j = 0; j < bredde; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
