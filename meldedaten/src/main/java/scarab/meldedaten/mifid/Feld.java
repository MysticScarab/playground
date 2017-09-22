package scarab.meldedaten.mifid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feld {

	@Id
	@GeneratedValue
	@Column(name = "feld_id")
	private int feldId;
	@Column(name = "nummer")
	private String nummer;
	@Column(name = "csv_name")
	private String csvName;
	@Column(name = "datentyp")
	private String datentyp;

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

	public String getDatentyp() {
		return datentyp;
	}

	public void setDatentyp(String datentyp) {
		this.datentyp = datentyp;
	}

}
