package onsdag;

public class EnkelListe<T> {
	private LinearNode<T> forste;
	private int antall;

	public EnkelListe() {
		forste = null;
		antall = 0;
	}

	public void leggTilForst(T element) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		nyNode.setNeste(forste);
		forste = nyNode;
		antall++ ;

	}

	public void skriv() {
		LinearNode<T> p = forste;
		System.out.print("[");
		while (p != null) {
			System.out.print(p.getElement());
			if (p.getNeste() != null) {
				System.out.print(", ");
			}
			p = p.getNeste();
		}
		System.out.println("]");

	}

	public void snu() {
		LinearNode<T> res = null;
		LinearNode<T> p = forste;

		while (p != null) {
			forste = p.getNeste();
			p.setNeste(res);
			res = p;
			p = forste;
		}

		forste = res;
	}
}
