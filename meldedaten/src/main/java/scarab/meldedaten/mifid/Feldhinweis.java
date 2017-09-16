package scarab.meldedaten.mifid;

public class Feldhinweis {

	private long meldungId;
	private int hinweisId;
	private int feldId;
	private String hinweis;

	public long getMeldungId() {
		return meldungId;
	}

	public void setMeldungId(long meldungId) {
		this.meldungId = meldungId;
	}

	public int getHinweisId() {
		return hinweisId;
	}

	public void setHinweisId(int hinweisId) {
		this.hinweisId = hinweisId;
	}

	public int getFeldId() {
		return feldId;
	}

	public void setFeldId(int feldId) {
		this.feldId = feldId;
	}

	public String getHinweis() {
		return hinweis;
	}

	public void setHinweis(String hinweis) {
		this.hinweis = hinweis;
	}

}
