package scarab.meldedaten.mifid;

import java.time.LocalDate;

public class Historie {

  private long meldungId;
  private String feldname;
  private String wertAlt;
  private String wertNeu;
  private String benutzer;
  private LocalDate zeitstempel;

  public long getMeldungId() {
    return meldungId;
  }

  public void setMeldungId(long meldungId) {
    this.meldungId = meldungId;
  }

  public String getFeldname() {
    return feldname;
  }

  public void setFeldname(String feldname) {
    this.feldname = feldname;
  }

  public String getWertAlt() {
    return wertAlt;
  }

  public void setWertAlt(String wertAlt) {
    this.wertAlt = wertAlt;
  }

  public String getWertNeu() {
    return wertNeu;
  }

  public void setWertNeu(String wertNeu) {
    this.wertNeu = wertNeu;
  }

  public String getBenutzer() {
    return benutzer;
  }

  public void setBenutzer(String benutzer) {
    this.benutzer = benutzer;
  }

  public LocalDate getZeitstempel() {
    return zeitstempel;
  }

  public void setZeitstempel(LocalDate zeitstempel) {
    this.zeitstempel = zeitstempel;
  }
}
