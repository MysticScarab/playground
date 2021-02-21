package scarab.meldedaten.mifid;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Basisdaten einer Meldung. In den Basisdaten sind alle allgemeinen Daten zu einer Meldung
 * zusammengefasst (ID der Meldung, diverse Statusangaben, Transaktionsnummer, ...).
 */
@Entity
public class Basisdaten implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "meldung_id")
  private long meldungId;

  @Column(name = "status_btg")
  private int statusBtg;
  // private Status statusBtg;
  @Column(name = "status_arm")
  private int statusArm;

  @Column(name = "status_nca")
  private int statusNca;

  @Column(name = "transaktionsnummer")
  private String transaktionsnummer;

  @Column(name = "user_field_3")
  private String userField3;

  @Column(name = "user_field_2")
  private String userField2;

  @Column(name = "meldetag")
  private LocalDate meldetag;

  public long getMeldungId() {
    return meldungId;
  }

  public void setMeldungId(long meldungId) {
    this.meldungId = meldungId;
  }

  public int getStatusBtg() {
    return statusBtg;
  }

  public void setStatusBtg(int statusBtg) {
    this.statusBtg = statusBtg;
  }

  public int getStatusArm() {
    return statusArm;
  }

  public void setStatusArm(int statusArm) {
    this.statusArm = statusArm;
  }

  public int getStatusNca() {
    return statusNca;
  }

  public void setStatusNca(int statusNca) {
    this.statusNca = statusNca;
  }

  public String getTransaktionsnummer() {
    return transaktionsnummer;
  }

  public void setTransaktionsnummer(String transaktionsnummer) {
    this.transaktionsnummer = transaktionsnummer;
  }

  public String getUserField3() {
    return userField3;
  }

  public void setUserField3(String userField3) {
    this.userField3 = userField3;
  }

  public String getUserField2() {
    return userField2;
  }

  public void setUserField2(String userField2) {
    this.userField2 = userField2;
  }

  public LocalDate getMeldetag() {
    return meldetag;
  }

  public void setMeldetag(LocalDate meldetag) {
    this.meldetag = meldetag;
  }
}
