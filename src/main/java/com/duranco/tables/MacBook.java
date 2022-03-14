package com.duranco.tables;

import javax.persistence.Entity;

@Entity
public class MacBook extends Ordinateur {
	String securitycode;
	int battrielife;
	public String getSecuritycode() {
		return securitycode;
	}
	public void setSecuritycode(String securitycode) {
		this.securitycode = securitycode;
	}
	public int getBattrielife() {
		return battrielife;
	}
	public void setBattrielife(int battrielife) {
		this.battrielife = battrielife;
	}

}
