package tirsdag;

public class NettStudent extends Student {

	private String hjemsted;

	public NettStudent(int snr, String fNavn, String eNavn, String hjemsted) {
		super(snr, fNavn, eNavn);
		this.hjemsted = hjemsted;
	}

	public String getHjemsted() {
		return hjemsted;
	}

	public void setHjemsted(String hjemsted) {
		this.hjemsted = hjemsted;
	}

	@Override
	public String toString() {
		return super.toString() +"Heimstad: "+ hjemsted;
	}

}
