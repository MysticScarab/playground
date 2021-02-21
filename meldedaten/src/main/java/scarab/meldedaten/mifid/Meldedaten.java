package scarab.meldedaten.mifid;

/**
 * Die Meldedaten umfassen die ID der betroffenen Meldung, die ID der Feldkonfiguration und den Wert
 * des Feldes.
 */
public class Meldedaten {

  private long meldungId;
  private int feldId;
  private String wert;

  public long getMeldungId() {
    return meldungId;
  }

  public void setMeldungId(long meldungId) {
    this.meldungId = meldungId;
  }

  public int getFeldId() {
    return feldId;
  }

  public void setFeldId(int feldId) {
    this.feldId = feldId;
  }

  public String getWert() {
    return wert;
  }

  public void setWert(String wert) {
    this.wert = wert;
  }
}
