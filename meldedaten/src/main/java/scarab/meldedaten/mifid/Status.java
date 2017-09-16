package scarab.meldedaten.mifid;

public class Status {

	private int statusId;
	private String gruppe;
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
