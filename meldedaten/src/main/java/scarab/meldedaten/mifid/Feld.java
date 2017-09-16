package scarab.meldedaten.mifid;

public class Feld {

	private int feldId;
	private String nummer;
	private String csvName;

	public int getFeldId() {
		return feldId;
	}

	public void setFeldId(int feldId) {
		this.feldId = feldId;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getCsvName() {
		return csvName;
	}

	public void setCsvName(String csvName) {
		this.csvName = csvName;
	}

}
