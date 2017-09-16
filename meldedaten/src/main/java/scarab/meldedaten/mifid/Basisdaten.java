package scarab.meldedaten.mifid;

import java.util.Date;

public class Basisdaten {

	private long meldungId;
	 private int statusBtg;
//	private Status statusBtg;
	private int statusArm;
	private int statusNca;
	private String transaktionsnummer;
	private String userField3;
	private String userField2;
	private Date meldetag;

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

//	public Status getStatusBtg() {
//		return statusBtg;
//	}
//
//	public void setStatusBtg(Status statusBtg) {
//		this.statusBtg = statusBtg;
//	}

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

	public Date getMeldetag() {
		return meldetag;
	}

	public void setMeldetag(Date meldetag) {
		this.meldetag = meldetag;
	}

}
