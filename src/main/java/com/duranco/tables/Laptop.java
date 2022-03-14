package com.duranco.tables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop extends Ordinateur {
private String autonomie;

public String getAutonomie() {
	return autonomie;
}

public void setAutonomie(String autonomie) {
	this.autonomie = autonomie;
}





}
