package tirsdag;

public class Student implements Comparable<Student> {

	private int snr;
	private String fNavn;
	private String eNavn;

	public Student(int snr, String fNavn, String eNavn) {
		this.snr = snr;
		this.fNavn = fNavn;
		this.eNavn = eNavn;
	}

	public int getSnr() {
		return snr;
	}

	public void setSnr(int snr) {
		this.snr = snr;
	}

	public String getfNavn() {
		return fNavn;
	}

	public void setfNavn(String fNavn) {
		this.fNavn = fNavn;
	}

	public String geteNavn() {
		return eNavn;
	}

	public void seteNavn(String eNavn) {
		this.eNavn = eNavn;
	}

	@Override
	public int compareTo(Student t) {
		int sml = this.eNavn.compareTo(t.geteNavn());

		if (sml != 0) {
			return sml;
		} else {
			return this.fNavn.compareTo(t.getfNavn());
		}
		// return this.snr - t.snr;
	}

	@Override
	public String toString() {
		return snr + " " + fNavn + " " + eNavn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + snr;
		return result;
		// return Objects.hash(snr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return snr == other.snr;
	}

}
