package scarab.meldedaten.mifid;

import javax.persistence.*;

@Entity
public class Status {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "status_id")
  private int statusId;

  @Column(name = "gruppe")
  private String gruppe;

  @Column(name = "name")
  private String name;

  /**
   * Default Konstruktor
   */
  public Status() {
  }

  public Status(int statusId, String gruppe, String name) {
    this.statusId = statusId;
    this.gruppe = gruppe;
    this.name = name;
  }

  public int getStatusId() {
    return statusId;
  }

  public void setStatusId(int statusId) {
    this.statusId = statusId;
  }

  public String getGruppe() {
    return gruppe;
  }

  public void setGruppe(String gruppe) {
    this.gruppe = gruppe;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
