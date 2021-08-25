package onsdag;

import java.util.Objects;

public class Vare {
	private String strekkode;
	private String namn;
	private double pris;

	public Vare(String strekkode, String namn, double pris) {
		this.strekkode = strekkode;
		this.namn = namn;
		this.pris = pris;
	}

	public String getStrekkode() {
		return strekkode;
	}

	public void setStrekkode(String strekkode) {
		this.strekkode = strekkode;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	@Override
	public int hashCode() {
		return Objects.hash(strekkode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vare other = (Vare) obj;
		return Objects.equals(strekkode, other.strekkode);
	}

	@Override
	public String toString() {
		return "Vare [strekkode=" + strekkode + ", namn=" + namn + ", pris=" + pris + "]";
	}

}
